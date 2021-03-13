package com.example.kezek.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kezek.R;
import com.example.kezek.adapter.PlaceAdapter;
import com.example.kezek.data.ChatPlaceData;

public class ChatFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        RecyclerView chatCompaniesRecyclerView = view.findViewById(R.id.recycler_view_chat_place);

        String[] chatTitles, chatLastMassages;
        chatTitles = new String[ChatPlaceData.chatPlaceData.length];
        chatLastMassages = new String[ChatPlaceData.chatPlaceData.length];
        int[] chatImages = new int[ChatPlaceData.chatPlaceData.length];

        for (int i = 0; i < ChatPlaceData.chatPlaceData.length; i++){
            chatTitles[i] = ChatPlaceData.chatPlaceData[i].getTitle();
            chatLastMassages[i] = ChatPlaceData.chatPlaceData[i].getLastMassage();
            chatImages[i] = ChatPlaceData.chatPlaceData[i].getImageId();
        }

        PlaceAdapter adapter = new PlaceAdapter(chatTitles, chatLastMassages, chatImages);
        chatCompaniesRecyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        chatCompaniesRecyclerView.setLayoutManager(layoutManager);

        return view;
    }
}
