package com.example.projet_myparis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class OneDayDetails extends AppCompatActivity {

    RecyclerView recyclerView;
    RVAdapter rvAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_day_details);
        recyclerView = findViewById(R.id.details_one_day);

        findViewById(R.id.BoutonRestaurant).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OneDayDetails.this, FirstPage.class));
            }
        });

        MyRestaurantsData[] restaurants = new MyRestaurantsData[]{
                new MyRestaurantsData("Arc de Triomphe", "L'Arc de Triomphe est, comme la Tour Eiffel, l'un des monuments les plus emblématiques de Paris. Mesurant 50 mètres de haut, 22 mètres de large et 45 mètres de long, l'Arc de Triomphe est le symbole des victoires de l'armée française sous l'Empire de Napoléon. Il a fallu trente ans pour construire l'Arc de Triomphe. ", R.drawable.adt),
                new MyRestaurantsData("La Tour Eiffel", "La tour Eiffel est une structure en fer puddlé, un fer qui a perdu une part de son carbone et donc rouille moins vite. Elle est de forme pyramidale aux côtés légèrement incurvés. Elle mesure 324m de haut et se divise en 4 parties séparées par un étage.", R.drawable.lte),
                new MyRestaurantsData("La Place de l'Alma", "La place de l’Alma tient son nom de sa proximité avec le pont de l’Alma, de là partent les avenues de New-York, du Président-Wilson, George-V, Montaigne ( qui conduit aux Champs Elysées) et du cours Albert Ier qui longe la Seine. Elle célèbre la victoire (1854) des alliés sur les Russes sur l'Alma (petit fleuve côtier près de Sébastopol en Crimée).", R.drawable.pdl),
                new MyRestaurantsData("Le Jardin des Tuileries", "Le Jardin des Tuileries tient son nom des fabriques de tuiles qui se tenaient à l'endroit où la reine Catherine de Médicis a fait édifier le palais des Tuileries en 1564, aujourd'hui disparu. Le célèbre jardinier du roi, André Le Nôtre, lui donne à partir de 1664 son aspect actuel de jardin à la française.", R.drawable.ljdt),
                new MyRestaurantsData("Notre Dame de Paris", "Notre-Dame de Paris est d'architecture gothique et se situe sur l'île de la Cité au cœur de Paris. Les deux rosaces qui ornent chacun des bras du transept 6 sont parmi les plus grandes d'Europe et ont chacune un diamètre de 13 m. ... La hauteur de la flèche est de 96 mètres et la largeur de la façade est de 43,5 mètres.", R.drawable.nddp),
                new MyRestaurantsData("L'Opéra Garnier", "L’opéra Garnier, ou palais Garnier, est un théâtre national qui a la vocation d'être une académie de musique, de chorégraphie et de poésie lyrique ; il est un élément majeur du patrimoine du 9e arrondissement de Paris et de la capitale. ", R.drawable.og),
                new MyRestaurantsData("Montmartre", "Montmartre est un quartier du 18e arrondissement de Paris (France) dominé par la basilique du Sacré-Cœur. Depuis le XIX e siècle, il a accueilli de nombreux artistes tels que Picasso ou Modigliani et est devenu le symbole d'un mode de vie bohème.", R.drawable.mmt),
        };



        rvAdapter = new RVAdapter(restaurants);
        recyclerView.setAdapter(rvAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.hasFixedSize();

    }
}