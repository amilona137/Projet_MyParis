package com.example.projet_myparis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class AnecdotesPages extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anecdotes_pages);

        /*findViewById(R.id.quiz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnecdotesPages.this, Quizpage.class ));
            }*/

        TextView texte = findViewById(R.id.texte);
        TextView titre = findViewById(R.id.titre);
        TabLayout tabLayout = findViewById(R.id.tab);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch(tabLayout.getSelectedTabPosition()){
                    case 0 :
                        titre.setText("Le fleuve qui traverse Paris est en fait l’Yonne, pas la Seine");
                        texte.setText("Que serait Paris sans la Seine ? Véritable source d’oxygène de la capitale, notre fleuve préféré n’est en fait pas celui qu’on croit. Quelque part en amont de Fontainebleau, l’Yonne et la Seine se rejoignent. La Seine absorbe le flot de l’Yonne, et se dirige vers Paris. Ou est-ce l’inverse ? Selon les règles de l’hydrographie, c’est en fait l’Yonne qui apporte le plus gros volume d’eau au point de confluence. C’est donc l’Yonne qui traverse Paris, scientifiquement parlant.");
                    case 1:
                        titre.setText("Le plus vieux pont de Paris ? Le Pont Neuf");
                        texte.setText("Ironique, non ? Le Pont Neuf a été inauguré en 1578. Premier pont à s’être doté d’un trottoir, il était anciennement appelé le pont aux pleurs, à cause du deuil du roi Henri III à son ouverture. La princesse de Condé, qu’il aimait passionnément et avec qui il entretenait une relation platonique, venait de décéder");

                    case 2:
                        titre.setText("Il est interdit de prendre des photos de la Tour Eiffel de nuit !");
                        texte.setText("Vous avez peut-être une violation de droits d’auteur dans la galerie de votre téléphone portable. Une œuvre d’art est propriété privée de son auteur jusqu’à 70 ans après sa mort. La Tour Eiffel est donc domaine public depuis 1993, Gustave Eiffel étant mort en 1923. Mais l’auteur des lumières qui illuminent nos nuits parisiennes est toujours en vie, et son installation date de 1985. Pour pouvoir photographier la Tour Eiffel de nuit, il faut l’autorisation explicite de la Société d’Exploitation de la Tour Eiffel !");

                    case 3:
                        titre.setText("Il n’y a qu’un seul panneau « stop » dans tout Paris");
                        texte.setText("Si vous grillez un stop à Paris, c’est vraiment parce que vous l’avez cherché. À part sur le quai Saint-Exupéry, il n’y a aucun panneau stop dans la capitale. Toutes les intersections parisiennes doivent simplement respecter la priorité à droite.");

                    case 4:
                        titre.setText("La place de la Concorde est le plus grand cadran solaire du monde");
                        texte.setText("Avez-vous déjà remarqué les imposants chiffres romains qui entourent la place de la Concorde ? Vous êtes-vous déjà demandé à quoi ils servent ? Voici votre réponse ! L’obélisque de la Concorde est en fait une gigantesque aiguille solaire ! L’installation a été réalisée en 1999 pour le passage au niveau millénaire. Autre secret : le projet avait déjà été lancé en 1913 et en 1939, mais deux « petits » événements mondiaux ont stoppé la mise en place."
                                );
                    case 5:
                        titre.setText("La rue la plus courte de Paris ne mesure même pas 10 mètres !");
                        texte.setText("La rue des Degrés, dans le 2ème arrondissement, possède une particularité : c’est la plus petite rue parisienne ! Avec 5,75m de long et 3,30m de large, cette rue en format pocket n’est en fait que 14 escaliers ! Mais elle a sa plaque, attention !");

                    case 6:
                        titre.setText("La Tour Nouguier et Koechlin ne vous dit rien ?");
                        texte.setText("Normal, puisque c’est la Tour Eiffel. Ou plutôt comment elle aurait pu s’appeler ! Nouguier et Koechlin étaient deux ingénieurs qui travaillaient à l’atelier de Gustave Eiffel, et ce sont eux qui ont imaginé la fameuse Dame de Fer. Eiffel n’était pas intéressé par le projet au départ, mais a finalement racheté le brevet !");


                }
            }



            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                return ;
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                return;

            }
        });

    }

    }
