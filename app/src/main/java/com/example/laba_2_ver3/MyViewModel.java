package com.example.laba_2_ver3;

import android.content.res.Resources;
import android.graphics.BitmapFactory;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.gson.Gson;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Technologies> technologiesMLD;

    public LiveData<Technologies> getTechnologiesMLD() {
        return technologiesMLD;
    }

    public void loadTechnologies(String jsonString, Resources res){
        if(technologiesMLD == null) {
            technologiesMLD = new MutableLiveData<Technologies>();
            Gson g = new Gson();
            technologiesMLD.setValue(g.fromJson(jsonString.toString(), Technologies.class));

            // Загрузка картинок
            int sizeTecno = technologiesMLD.getValue().getTechnologies().size();
            for(int i=0; i<sizeTecno; i++){
                    //technologiesMLD.getValue().getTechnologies().get(i).setImage(
                          //  BitmapFactory.decodeResource(res,  .drawable.)
                   // );
            }
        }
    }
}
