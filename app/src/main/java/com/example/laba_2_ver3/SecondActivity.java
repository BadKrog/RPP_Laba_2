package com.example.laba_2_ver3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity implements ListFragment.OnListFragmentInteractionListener {

    TextView startText;
    ListFragment frag;
    FragmentTransaction fragTrans;
    MyViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // Получаем json файл из первого активити
        Bundle arguments = getIntent().getExtras();
        String jsonString = arguments.get("jsonString").toString();

        Log.d("MyTag", "Здесь уже работает");

        // Создаем хранилище
        model = new ViewModelProvider(
                    this.getViewModelStore(),
                    new ViewModelProvider.NewInstanceFactory()
                ).get(MyViewModel.class);
        model.loadTechnologies(jsonString, this.getResources());

        Log.d("MyTag", "Модель создана");

        frag = new ListFragment(model);
        fragTrans = getSupportFragmentManager().beginTransaction();
        fragTrans.add(R.id.fragCont, frag);
        fragTrans.commit();
        Log.d("MyTag", "Фрагмент создан");
    }

    @Override
    public void onListFragmentInteraction(Technologies.Technology item) {
        Log.d("MyTag", "Я не знаю что он хочет, но я вызвался");
    }
}
