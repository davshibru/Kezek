package com.example.kezek.fragments.subFragmentForCardFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kezek.R;
import com.example.kezek.adapter.BalanceAdapter;
import com.example.kezek.data.BanksData;

public class BalanseFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_balanse, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view_balance);

        int length = BanksData.banksData.length;
        String[] titles, money;
        int [] imageIds, color;

        titles = new String[length];
        money = new String[length];
        color = new int[length];
        imageIds = new int[length];

        for (int i = 0; i < length; i++){
            titles[i] = BanksData.banksData[i].getTitle();
            money[i] = BanksData.banksData[i].getMoney();
            color[i] = BanksData.banksData[i].getColor();
            imageIds[i] = BanksData.banksData[i].getImageIds();
        }

        BalanceAdapter adapter = new BalanceAdapter(titles, money, color, imageIds);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}