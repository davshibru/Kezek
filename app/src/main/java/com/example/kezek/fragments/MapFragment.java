package com.example.kezek.fragments;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kezek.R;
import com.example.kezek.adapter.EmployeeAdapter;
import com.example.kezek.data.EmploeeData;

public class MapFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map, container, false);

        ImageView image = (ImageView) view.findViewById(R.id.point);
        image.setOnClickListener(this::onClick);

        ImageView image1 = (ImageView) view.findViewById(R.id.point1);
        image1.setOnClickListener(this::onClick);

        ImageView image2 = (ImageView) view.findViewById(R.id.point2);
        image2.setOnClickListener(this::onClick);

        ImageView image3 = (ImageView) view.findViewById(R.id.point3);
        image3.setOnClickListener(this::onClick);

        ImageView image4 = (ImageView) view.findViewById(R.id.point4);
        image4.setOnClickListener(this::onClick);

        ImageView image5 = (ImageView) view.findViewById(R.id.point5);
        image5.setOnClickListener(this::onClick);

        ImageView image6 = (ImageView) view.findViewById(R.id.point6);
        image6.setOnClickListener(this::onClick);

        ImageView image7 = (ImageView) view.findViewById(R.id.point7);
        image7.setOnClickListener(this::onClick);

        ImageView image8 = (ImageView) view.findViewById(R.id.point8);
        image8.setOnClickListener(this::onClick);


        return view;
    }

    public void onClick(View v){
        Dialog dialog = null;
        int j = 0;
        switch (v.getId()){

            case R.id.point:
                j = 1;
                makeDialog(j, dialog);
                break;

            case R.id.point1:
                j = 2;
                makeDialog(j, dialog);
                break;

            case R.id.point2:
                j = 3;
                makeDialog(j, dialog);
                break;

            case R.id.point3:
                j = 4;
                makeDialog(j, dialog);
                break;

            case R.id.point4:
                j = 5;
                makeDialog(j, dialog);
                break;

            case R.id.point5:
                j = 6;
                makeDialog(j, dialog);
                break;

            case R.id.point6:
                j = 7;
                makeDialog(j, dialog);
                break;

            case R.id.point7:
                j = 8;
                makeDialog(j, dialog);
                break;

            case R.id.point8:
                j = 9;
                makeDialog(j, dialog);
                break;

        }

    }

    public void makeDialog(int j, Dialog dialog){

        dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.dialog_companyis_in_map);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().setGravity(Gravity.CENTER);

        TextView textView = (TextView) dialog.findViewById(R.id.card_view_map_title);
        String txt = textView.getText().toString();
        txt += "_" + j;
        textView.setText(txt);
        RecyclerView rv = (RecyclerView) dialog.findViewById(R.id.recycler_view_emploer);

        String[] descriptions = new String[EmploeeData.emploeeData.length];
        int[] imageIds = new int[EmploeeData.emploeeData.length];

        for (int i = 0; i < EmploeeData.emploeeData.length; i++){
            descriptions[i] = EmploeeData.emploeeData[i].getDescription();
            imageIds[i] = EmploeeData.emploeeData[i].getImageId();
        }

        EmployeeAdapter adapter = new EmployeeAdapter(imageIds, descriptions);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));

        dialog.show();
    }
}
