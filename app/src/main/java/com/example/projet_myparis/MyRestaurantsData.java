package com.example.projet_myparis;

public class MyRestaurantsData {
    private String nom;
    private String description;
    private Integer image;

    public MyRestaurantsData(String nom, String description, Integer image) {
        this.nom = nom;
        this.description = description;
        this.image = image;
    }


    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public Integer getImage(){
        return image;
    }
    public void setImage(Integer im){
        this.image = im;
    }


}
