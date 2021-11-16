package com.example.projet_myparis;

public class Versions {
    private String imageev, titreev, descriptionev;
    private boolean expandable;

    public Versions(String imageev, String titreev, String descriptionev) {

        this.imageev = imageev;
        this.titreev = titreev;
        this.descriptionev = descriptionev;
        this.expandable= false;
    }

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }



    public String getImageEv() {
        return imageev;
    }

    public String getTitreEv() {
        return titreev;
    }

    public String getDescriptionEv() {
        return descriptionev;
    }


    public void setImageEv(String imageEv) {
        this.imageev = imageEv;
    }

    public void getTitreEv(String apiLevel) {
        this.titreev = titreev;
    }

    public void setDescriptionEv(String description) {
        this.descriptionev = descriptionev;
    }

    @Override
    public String toString() {
        return "Versions{" +
                ", version='" + imageev + '\'' +
                ", apiLevel='" + titreev + '\'' +
                ", descriptionev='" + descriptionev + '\'' +
                '}';
    }



}
