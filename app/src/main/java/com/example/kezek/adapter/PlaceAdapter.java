package com.example.kezek.adapter;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kezek.R;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {

    private String[] titles;
    private String[] lastMassages;
    private int[] imageIds;

    public PlaceAdapter(String[] titles, String[] lastMassages, int[] imageIds) {
        this.titles = titles;
        this.lastMassages = lastMassages;
        this.imageIds = imageIds;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_place_chat, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardView cardView = holder.cv;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.card_view_place_chat_image);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(titles[position]);
        TextView title, lastMassage;
        title = (TextView) cardView.findViewById(R.id.card_view_place_chat_title);
        lastMassage = (TextView) cardView.findViewById(R.id.card_view_place_chat_last_massage);
        title.setText(titles[position]);
        lastMassage.setText(lastMassages[position]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CardView cv;

        public ViewHolder(@NonNull CardView itemView) {
            super(itemView);
            cv = itemView;
        }
    }
}
