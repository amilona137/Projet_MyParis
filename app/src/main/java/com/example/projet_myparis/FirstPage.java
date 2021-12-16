package com.example.projet_myparis;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        findViewById(R.id.bmonuments).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstPage.this, Monuments.class));
            }
        });
        findViewById(R.id.brestaurants).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstPage.this, RestaurantsPage.class));
            }
        });

        findViewById(R.id.bdormir).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstPage.this, OuDormir.class));
            }
        });

        findViewById(R.id.bshopping).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstPage.this, ShoppingPage.class));
            }
        });

        findViewById(R.id.bevenements).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstPage.this, Evenements.class));
            }
        });

        findViewById(R.id.bplans).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstPage.this, BonsPlans.class));
            }
        });

         findViewById(R.id.bcircuit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstPage.this, OneDay.class));
            }
        });

        findViewById(R.id.banecdotes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstPage.this, AnecdotesPages.class));
            }
        });
        findViewById(R.id.btransport).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstPage.this, TransportsPage.class));
            }
        });

    }
    }
