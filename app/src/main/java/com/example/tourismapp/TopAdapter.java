package com.example.tourismapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TopAdapter extends RecyclerView.Adapter<TopAdapter.TopAdapterViewHolder> {
    private List<com.example.tourismapp.TopItem> TopList;
    private Context context;
    public TopAdapter(List<com.example.tourismapp.TopItem> TopList, Context context){
        this.TopList = TopList;
        this.context = context;
    }
    @NonNull
    @Override
    public TopAdapter.TopAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.top_destination, parent, false);
        return new TopAdapterViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TopAdapter.TopAdapterViewHolder holder, int position) {
        holder.firstImageView.setImageResource(TopList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return TopList.size();
    }

    public class TopAdapterViewHolder extends RecyclerView.ViewHolder{
        public ImageView firstImageView, secondImageView, thirdImageView;
        public TopAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            firstImageView = itemView.findViewById(R.id.fisrtImageView);
            secondImageView = itemView.findViewById(R.id.secondImageView);
            thirdImageView = itemView.findViewById(R.id.thirdImageView);
        }
    }
}
