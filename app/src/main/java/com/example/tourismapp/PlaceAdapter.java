package com.example.tourismapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceAdapterViewHolder> {
    private List<com.example.tourismapp.PlaceItem> placeItemList;
    private Context context;

    public PlaceAdapter(List<PlaceItem> placeItemList, Context context) {
        this.placeItemList = placeItemList;
        this.context = context;
    }

    @NonNull
    @Override
    public PlaceAdapter.PlaceAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).
                inflate(R.layout.place_togo, parent, false );
        return new PlaceAdapterViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceAdapter.PlaceAdapterViewHolder holder, int position) {
        holder.itemImageView.setImageResource(placeItemList.get(position).getImage());
        holder.titleTextView.setText(placeItemList.get(position).getTitle());
        holder.itemTextView.setText(placeItemList.get(position).getRent());
        holder.itemTextView2.setText(placeItemList.get(position).getBedroom());
        holder.itemTextView3.setText(placeItemList.get(position).getCar());
    }

    @Override
    public int getItemCount() {
        return placeItemList.size();
    }

    public class PlaceAdapterViewHolder extends RecyclerView.ViewHolder {
        public ImageView itemImageView;
        public TextView titleTextView, itemTextView, itemTextView2, itemTextView3;
        public PlaceAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImageView = itemView.findViewById(R.id.itemImageView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            itemTextView2 = itemView.findViewById(R.id.itemTextView2);
            itemTextView3 = itemView.findViewById(R.id.itemTextView3);
        }
    }
}
