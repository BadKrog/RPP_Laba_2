package com.example.laba_2_ver3;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class FragmentViewPage extends Fragment {

    private MyViewModel model;

    public FragmentViewPage() {
    }

    public FragmentViewPage(MyViewModel model) {
        this.model = model;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result=inflater.inflate(R.layout.fragment_view_pager, container, false);
        ViewPager pager=(ViewPager)result.findViewById(R.id.frag_pager);
        pager.setAdapter(new MyAdapterViewPage(getFragmentManager()));
        return result;
    }
}
