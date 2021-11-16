package com.example.projet_myparis;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.circularreveal.CircularRevealLinearLayout;

import java.util.List;

public class VersionsAdapter extends RecyclerView.Adapter<VersionsAdapter.VersionVH> {

    List<Versions> versionsList;
    Context context;
    public VersionsAdapter(List<Versions> versionsList) {
        this.versionsList = versionsList;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent,false);
        return new VersionVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {
        Versions versions = versionsList.get(position);
        holder.titreTxtev.setText(versions.getTitreEv());
        holder.imageTxtev.setImageResource(versions.getImageEv());
        holder.descriptionTxtev.setText(versions.getDescriptionEv());

        boolean isExpandable = versionsList.get(position).isExpandable();
        holder.expandableLayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return versionsList.size();
    }

    public class VersionVH extends RecyclerView.ViewHolder {

        TextView titreTxtev, descriptionTxtev;
        ImageView imageTxtev ;
        LinearLayout linearLayout;
        RelativeLayout expandableLayout;

        public VersionVH(@NonNull View itemView) {
            super(itemView);
            imageTxtev = itemView.findViewById(R.id.imageev);
            titreTxtev = itemView.findViewById(R.id.titreev);
            descriptionTxtev = itemView.findViewById(R.id.descriptionev);

            linearLayout = itemView.findViewById(R.id.linear_layout);
            expandableLayout = itemView.findViewById(R.id.expandable_layout);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Versions versions = versionsList.get(getAdapterPosition());
                    versions.setExpandable(!versions.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
