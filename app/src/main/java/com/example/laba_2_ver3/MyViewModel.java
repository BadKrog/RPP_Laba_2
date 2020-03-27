package com.example.laba_2_ver3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.gson.Gson;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Technologies> technologiesMLD;

    public LiveData<Technologies> getTechnologiesMLD() {
        return technologiesMLD;
    }

    public void loadTechnologies(String jsonString){
        if(technologiesMLD == null) {
            technologiesMLD = new MutableLiveData<Technologies>();
            Gson g = new Gson();
            technologiesMLD.setValue(g.fromJson(jsonString.toString(), Technologies.class));
        }
    }
}
