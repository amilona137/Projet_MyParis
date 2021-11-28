package com.example.projet_myparis;

public class Versions {
    private String  titreev, descriptionev;
    private Integer imageev;
    private boolean expandable;

    public Versions(Integer imageev, String titreev, String descriptionev) {

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



    public Integer getImageEv() {
        return imageev;
    }

    public String getTitreEv() {
        return titreev;
    }

    public String getDescriptionEv() {
        return descriptionev;
    }


    public void setImageEv(Integer imageEv) {
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
                ", image='" + imageev + '\'' +
                ", titre='" + titreev + '\'' +
                ", description='" + descriptionev + '\'' +
                '}';
    }



}
