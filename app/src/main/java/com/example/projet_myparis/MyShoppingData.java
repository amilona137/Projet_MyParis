package com.example.projet_myparis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyShoppingData {

    private String nom;
    private Integer image;
    public MyShoppingData(String nom,Integer image) {
        this.nom = nom;
        this.image = image;
    }


    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }


    public Integer getImage(){
        return image;
    }
    public void setImage(Integer im){
        this.image = im;
    }

}
