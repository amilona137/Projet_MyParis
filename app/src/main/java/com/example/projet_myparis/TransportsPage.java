package com.example.projet_myparis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TransportsPage extends AppCompatActivity {

    TextView g7, cab,uber,marcel, ratp1,ratp2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transports_page);
        ratp1=findViewById(R.id.ratp1);
        ratp2=findViewById(R.id.ratp2);
        g7=findViewById(R.id.taxi);
        cab=findViewById(R.id.cab);
        uber=findViewById(R.id.uber);
        marcel=findViewById(R.id.marcel);


        findViewById(R.id.BoutonTransport).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TransportsPage.this, FirstPage.class));
            }
        });

        ratp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ratp.fr/"));
                startActivity(intent);

            }
        });
        ratp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ratp.fr/"));
                startActivity(intent);

            }
        });
        g7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.g7.fr/"));
                startActivity(intent);

            }
        });
        cab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.eurecab.com/"));
                startActivity(intent);

            }
        });
        uber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uber.com/global/fr/cities/paris/"));
                startActivity(intent);

            }
        });
        marcel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.classco.marcel"));
                startActivity(intent);

            }
        });

    }
}