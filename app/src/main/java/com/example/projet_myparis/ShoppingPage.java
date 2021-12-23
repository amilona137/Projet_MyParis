package com.example.projet_myparis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShoppingPage extends AppCompatActivity {


    RecyclerView recyclerView1;
    RecyclerView recyclerView2;
    AdapterShopping adapter1;
    AdapterShopping adapter2;
    TextView titre ;
    TextView description ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_page);


            recyclerView1 = findViewById(R.id.shopping1);
            recyclerView2 = findViewById(R.id.shopping2);
            titre = findViewById(R.id.titre);
            description = findViewById(R.id.description);

            // déclaration des listes de données
            MyShoppingData[] shopping1  = {
                    new MyShoppingData("Rue de Rivoli", R.drawable.bonrivoli),
                    new MyShoppingData("Rue Saint-Honoré",  R.drawable.sainthonore),
                    new MyShoppingData("Triangle d'or", R.drawable.triangle)

            };

            MyShoppingData[] shopping2  = {
                    new MyShoppingData("Le Marais", R.drawable.bonmarais),
                    new MyShoppingData("Le Boulevard St-Germain",  R.drawable.saintgermain),
                    new MyShoppingData("Le Forum des Halles", R.drawable.halles)

            };


            // action à faire quand click sur une image des recyclerView
             adapter1 = new AdapterShopping(shopping1, new AdapterShopping.ItemClickListener() {
                @Override
                public void onItemClick(int p) {
                    if(p==0){
                        titre.setText("Rue de Rivoli");
                        description.setText("Grande rue commerçante proche de nombreux sites incontournables, la rue de Rivoli offre le meilleur du shopping et du tourisme à Paris. Ce boulevard renommé réunit de grandes marques internationales, notamment Zara, H&M, Burberry et Urban Outfitters.");
                    }
                    if(p==1){
                        titre.setText("Rue Saint-Honoré");
                        description.setText("Les commerces de la rue Saint-Honoré ont la faveur de nombre des habitants les plus branchés de Paris. Dans cette rue de l'un des quartiers les plus historiques de la ville, les voyageurs découvriront un éventail de marques de créateurs établies au milieu de monuments séculaires qui évoquent l'histoire de France. Mais avant de visiter les sites touristiques, vous voudrez sûrement explorer la multitude de boutiques qui s'offrent à vous.");
                    }
                    if(p==2){
                        titre.setText("Triangle d'or");
                        description.setText("Le Triangle d'Or est peut-être le meilleur endroit où s'immerger dans la haute couture à Paris, permettant aux visiteurs d'explorer les célèbres Champs-Élysées en passant la journée à faire du shopping. Ces éblouissantes boutiques haut de gamme se trouvent le long de la rue François Ier, de l'avenue Montaigne et de l'avenue George V.");
                    }

                }
            });


        adapter2 = new AdapterShopping(shopping2, new AdapterShopping.ItemClickListener() {
            @Override
            public void onItemClick(int p) {
                if (p == 0) {
                    titre.setText("Le Marais");
                    description.setText("Le Marais est l'un des quartiers commerçants les plus branchés de Paris. Reconnu pour son large éventail de galeries d'art, de boutiques de mode et de boites de nuit, l'endroit est idéal pour se divertir jusqu'au petit matin. Comptant parmi les arrondissements les plus attrayants de Paris, le Marais vous réserve une vaste sélection de vitrines à découvrir, des grands centres commerciaux aux concepts les plus innovants.");
                }
                if (p == 1) {
                    titre.setText("Le Boulevard St-Germain");
                    description.setText("Les boutiques du boulevard Saint-Germain s'accordent parfaitement avec les somptueux monuments du 7e arrondissement, notamment la tour Eiffel, le Champ-de-Mars et le musée d'Orsay. Réputé pour sa ribambelle d'enseignes de géants de la mode comme Louis Vuitton, Hugo Boss et Karl Lagerfeld, le boulevard Saint-Germain abrite également des magasins vendant des meubles d'exception et des délices culinaires.");
                }
                if (p == 2) {
                    titre.setText("Le Forum des Halles");
                    description.setText("Le Westfield Forum des Halles est un centre commercial moderne construit sur le site des Halles historiques de Paris, démolies en 1971. Rouvert en 2016, il présente une architecture contemporaine saisissante, avec une vaste verrière qui couvre l'espace en laissant entrer la lumière naturelle tout au long de l'année.");
                }
            }
        });

        recyclerView1.setAdapter(adapter1);
        recyclerView2.setAdapter(adapter2);

        // recylerView mise en horizontal
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        // taille fixe des recyclerView peu importe le nombre de données
        recyclerView1.hasFixedSize();
        recyclerView2.hasFixedSize();

        findViewById(R.id.BoutonShopping).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShoppingPage.this, FirstPage.class));
            }
        });

}}