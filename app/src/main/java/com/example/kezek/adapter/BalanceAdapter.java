package com.example.kezek.adapter;


import android.graphics.Color;
import android.graphics.drawable.Drawable;
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

public class BalanceAdapter extends RecyclerView.Adapter<BalanceAdapter.ViewHolder> {

    private String[] titles, moneys;
    private int[] imageIds, colors;

    public BalanceAdapter(String[] titles, String[] moneys, int[] colors, int[] imageIds) {
        this.titles = titles;
        this.moneys = moneys;
        this.colors = colors;
        this.imageIds = imageIds;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_balance, parent, false);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.card_view_balance_image);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(titles[position]);
        TextView title, money;
        title = (TextView) cardView.findViewById(R.id.card_view_balance_title);
        money = (TextView) cardView.findViewById(R.id.card_view_balance_money);
        title.setText(titles[position]);
        money.setText(moneys[position]);
        LinearLayout linearLayout = (LinearLayout) cardView.findViewById(R.id.linearLayout);
//        Drawable drawableColor = ContextCompat.getDrawable(cardView.getContext(), colors[position]);
//        linearLayout.setBackground(drawableColor);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;

        public ViewHolder(@NonNull CardView itemView) {
            super(itemView);
            cardView = itemView;
        }
    }
}
