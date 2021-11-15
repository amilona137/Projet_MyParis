package com.example.projet_myparis;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Monuments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments);

        findViewById(R.id.toureiffel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Monuments.this, MTourEiffel.class));
            }
        });

        findViewById(R.id.louvre).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Monuments.this, MLouvre.class));
            }
        });

        findViewById(R.id.notredame).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Monuments.this, MNotreDame.class));
            }
        });

        findViewById(R.id.arctriomphe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Monuments.this, MArcTriomphe.class));
            }
        });

        findViewById(R.id.orsay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Monuments.this, MOrsay.class));
            }
        });

        findViewById(R.id.pompidou).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Monuments.this, MPompidou.class));
            }
        });

        findViewById(R.id.sacrecoeur).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Monuments.this, MSacreCoeur.class));
            }
        });

        findViewById(R.id.versailles).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Monuments.this, MVersailles.class));
            }
        });

        findViewById(R.id.champselysees).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Monuments.this, MChampsElysees.class));
            }
        });
    }
}