package com.example.projet_myparis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class RestaurantsPage extends AppCompatActivity {

    RecyclerView recyclerView;
    RVAdapter rvAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants_page);
        recyclerView = findViewById(R.id.rv_resto);

        findViewById(R.id.BoutonRestaurant).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RestaurantsPage.this, FirstPage.class));
            }
        });

        MyRestaurantsData[] restaurants = new MyRestaurantsData[]{
                new MyRestaurantsData("Le Coupe Gorge", "Ce petit restaurant à la décoration centrée " +
                        "autour de la ville de Paris révisite des plats typiques de la gastronomie française en ajoutant des touches d'originalité. Sa spécialité ? Du nougat fait maison par un chef passionné !" +
                        "Adresse : 2,rue de la Couteillerie    Prix moyen : 33€ ", R.drawable.coupegorge),
                new MyRestaurantsData("Touch In Paris", "Avec des assiettes raffinées et généreuses, Touch In Paris vous fera saliver ! Tournée autour de la gastronomie française, la cuisine du chef est colorée et de saison. " +
                        "Adresse : 20,rue Vignon    Prix moyen : 49€    ", R.drawable.touchinparis),
                new MyRestaurantsData("Le Félix Café", "Le Félix Café propose des plats simples dans une ambiance chaleureuse et bon enfant. Les férus de viande ne seront pas déçus, avec une carte des plus carnivores !" +
                        "Adresse : 40,boulevard de Reuilly   Prix moyen : 26€    ", R.drawable.felixgourmand),
                new MyRestaurantsData("Le Bon Bock", "Au cours du 18e arrondissement de la capital, ce restaurant propose des plats traditionels français familiaux avec une touche de raffinement. Ce lieu chargé d'histoire  propose une très belle carte de vins pour accompagner vos repas."+
                        "Adresse : 2,rue Dancourt   Prix moyen : 42€", R.drawable.lebonbock),
                new MyRestaurantsData("Magokoro", "Plongez dans une véritable ambiance japonaise. Tenue par des propriétaires tout droit venus du Japon, ils vont feront découvrir des plats originaux. Une invitation au voyage, tout simplement. " +
                        "Adresse : 33,rue Lamartine   Prix moyen : 33€    ", R.drawable.magokoro),
                new MyRestaurantsData("Casa Di Peppe", "Restaurant italien qui prône le 100 % fait maison, la Casa di Pepe vous fera savourer des plats italiens, en passant par des antipastis et un large choix de pizzas et de plats de pâtes. Le restaurant a même été élu en août 2021 meilleure pizzeria d'Europe !" +
                        "Adresse : 222,rue St Jacques   Prix moyen : 28€    ", R.drawable.casadipepe),
                new MyRestaurantsData("Le 27 Gourmand", "Dans ce restaurant, vous  dégusterez des plats copieux à base de canard mais aussi à base de boeuf Black Angus. Les plats sont traditionels de la gastronomie française et les frites maison vous régaleront !  " +
                        "Adresse : 27, boulevard des Batignolles   Prix moyen : 40€    ", R.drawable.vingtsept),
                new MyRestaurantsData("A Casaluna", "Bienvenue en Corse ! Les couleurs chaleureuses et les murs tout en pierre accompagneront la dégustation de plats venant de l'île de Beauté. Vous pourrez y découvrir des soupes de poisson, du sanglier et du boeuf d'exception ! Sans oublier la charcuterie corse." +
                        "Adresse : 6, rue de Beaujolais  Prix moyen : 60€    ", R.drawable.casaluna),

        };



        rvAdapter = new RVAdapter(restaurants);
        recyclerView.setAdapter(rvAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.hasFixedSize();

    }
}