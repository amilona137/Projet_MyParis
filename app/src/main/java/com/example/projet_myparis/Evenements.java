package com.example.projet_myparis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Evenements extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Versions> versionsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evenements);

        recyclerView = findViewById(R.id.recyclerView);

        initData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        VersionsAdapter versionsAdapter = new VersionsAdapter(versionsList);
        recyclerView.setAdapter(versionsAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        versionsList = new ArrayList<>();

        versionsList.add(new Versions( R.drawable.ejanvier, "Janvier à Paris", "En janvier, Paris se dévoile sous toutes les coutures pendant la Fashion Week et propose de nombreux événements autour de la mode. Paris est une destination shopping de choix, dont vous pouvez profiter pleinement pendant les soldes de janvier. Un, deux, trois, prêt ? Shoppez !"));
        versionsList.add(new Versions( R.drawable.efevrier, "Février à Paris", "Alors que l’hiver bat son plein et que les températures sont basses dans la capitale, le cœur des amoureux brûle pour la Saint-Valentin, le 14 février. Tout au long du mois, Paris vous propose un large choix de sorties à faire en couple : expositions, concerts, spectacles, salons… À vous de choisir ce qui vous fait plaisir !"));
        versionsList.add(new Versions( R.drawable.emarsavril, "Mars et avril à Paris", "En mars et en avril, le printemps fête son grand retour et la capitale vit au rythme de nombreux événements ! Nouvelles expositions, activités pour les enfants, grandes manifestations populaires… Best-of des rendez-vous à ne pas manquer !"));
        versionsList.add(new Versions( R.drawable.emaijuin, "Mai et juin à Paris", "Avec le retour du soleil, Paris joue la carte du plein air et propose de nombreux événements organisés en extérieur comme en ligne. Il y en a pour toutes les envies ! Avec le retour du soleil, Paris joue la carte du plein air et propose de nombreux événements organisés en extérieur comme en ligne. Il y en a pour toutes les envies !"));
        versionsList.add(new Versions( R.drawable.ejuilletaout, "Juillet et août à Paris", "En juillet et en août, Paris fête l’été en proposant de nombreux événements en plein air. Il fait beau et le soleil est à son zénith ! Pour profiter au mieux des longues journées et des douces soirées, les possibilités sont multiples. Au hit-parade d’un été parisien réussi, faites la fête le 14 Juillet, relaxez-vous à Paris Plages, vibrez pour l’arrivée du Tour de France et profitez de tous les festivals de la capitale !"));
        versionsList.add(new Versions( R.drawable.eseptembre, "Septembre à Paris", "Septembre est une période idéale pour visiter la capitale et profiter de ses températures encore très agréables. Côté agenda, après une parenthèse estivale, Paris fait sa rentrée culturelle et festive. À l’image de la nature qui voit l’automne pointer le bout de son nez, la ville prend des couleurs à travers de nombreux événements !"));
        versionsList.add(new Versions( R.drawable.eoctobre, "Octobre à Paris", "En octobre, l’art contemporain est à l’honneur à Paris ! Dans le cadre de la Nuit Blanche, la Ville lumière s’en remet aux artistes actuels dès le coucher du soleil. Pour sa nouvelle édition, un parcours nocturne plein de surprises vous attend aux quatre coins de la capitale : œuvres monumentales, installations lumineuses, expériences sensorielles… La nuit sera longue !"));
        versionsList.add(new Versions( R.drawable.enovembredecembre, "Novembre et décembre à Pairs", "A l’approche des fêtes, elle se pare de ses plus belles couleurs ! Le mois de novembre est chargé en rendez-vous pour les passionnés. Du 11 au 14 novembre 2021, le salon Paris Photo rassemble l’ensemble de la profession - galeries, photographes, artistes, collectionneurs…-  et jouit d’un rayonnement international."));
    }
}