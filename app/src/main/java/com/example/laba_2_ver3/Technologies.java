package com.example.laba_2_ver3;

import android.graphics.Bitmap;

import java.util.List;

public class Technologies {
    private List<Technology> technologies;
    private List<Bitmap> imagesTechno;

    public void setTechnologies(List<Technology> technologies) {
        this.technologies = technologies;
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public void setImagesTechno(List<Bitmap> imagesTechno) {
        this.imagesTechno = imagesTechno;
    }

    public List<Bitmap> getImagesTechno() {
        return imagesTechno;
    }

    // Класс с технологией
    private static class Technology {
        private String graphic;
        private String name;
        private String helptext;

        public Technology(){
            graphic = "";
            name = "";
            helptext = "";
        }

        @Override
        public String toString() {
            return "Technology {name:"+name+"; graphic:"+graphic+"; helptext:"+helptext+"}";
        }

        public void setGraphic(String graphic) { this.graphic = graphic; }
        public void setName(String name) { this.name = name; }
        public void setHelptext(String helptext) { this.helptext = helptext; }
    }
}

