package com.example.projet_myparis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class AdapterShopping extends RecyclerView.Adapter<AdapterShopping.ItemViewHolder> {

        MyShoppingData[] shopping ;
        Context context;
        private ItemClickListener click;


        public class ItemViewHolder extends RecyclerView.ViewHolder {
            TextView nom;
            ImageView image;


            public ItemViewHolder(View itemView) {
                super(itemView);
                nom = itemView.findViewById(R.id.nom);
                image = itemView.findViewById(R.id.image);


            }
        }

        public AdapterShopping(MyShoppingData[] shopping, ItemClickListener click) {
            this.shopping = shopping;
            this.click = click;

        }

        public interface ItemClickListener{
            void onItemClick(int p);
        }

        @Override
        public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_list_item_shopping, parent,
                    false);

            return new ItemViewHolder(view);
        }



        public void onBindViewHolder(ItemViewHolder holder, int position) {
            final MyShoppingData list = shopping[position];
            holder.nom.setText(list.getNom());
            //holder.description.setText(list.getDescription());
            holder.image.setImageResource(list.getImage());

            holder.itemView.setOnClickListener(view -> {
                click.onItemClick(position);

            });




        }

        @Override
        public int getItemCount() {
            return shopping.length;
        }
}
