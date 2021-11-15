package com.example.projet_myparis;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ItemViewHolder> {

    MyRestaurantsData[] restaurants;


    public class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView nom;
        TextView description;
        ImageView image;

        public ItemViewHolder(View itemView) {
            super(itemView);
            nom = itemView.findViewById(R.id.nom);
            description = itemView.findViewById(R.id.description);
            image = itemView.findViewById(R.id.image);

        }
    }

    public RVAdapter(MyRestaurantsData[] restaurants) {
        this.restaurants = restaurants;


    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_list_item, parent,
                false);

        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        final MyRestaurantsData list = restaurants[position];
        holder.nom.setText(list.getNom());
        holder.description.setText(list.getDescription());
        holder.image.setImageResource(list.getImage());

    }

    @Override
    public int getItemCount() {
        return restaurants.length;
    }

}

