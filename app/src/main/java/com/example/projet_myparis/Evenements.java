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

        versionsList.add(new Versions( "Android 10", "Version 10", "Api Level 29"));
        versionsList.add(new Versions( "Android 11", "Version 11", "Api Level 30"));
        versionsList.add(new Versions( "Android 12", "Version 12", "Api Level 31"));
        versionsList.add(new Versions( "Android 13", "Version 13", "Api Level 32"));
        versionsList.add(new Versions( "Android 17", "Version 17", "Api Level 33"));
        versionsList.add(new Versions( "Android 18", "Version 18", "Api Level 34"));
        versionsList.add(new Versions( "Android 120", "Version 120", "Api Level 35"));
    }
}