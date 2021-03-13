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
import com.example.kezek.adapter.TaskAdapter;
import com.example.kezek.data.ChatPlaceData;
import com.example.kezek.data.TaskData;

public class TaskFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_task, container, false);
        RecyclerView taskRecyclerView = view.findViewById(R.id.recycler_view_task);

        String[] taskTitles, taskTimes;
        taskTitles = new String[TaskData.taskData.length];
        taskTimes = new String[TaskData.taskData.length];


        for (int i = 0; i < TaskData.taskData.length; i++){
            taskTitles[i] = TaskData.taskData[i].getTitle();
            taskTimes[i] = TaskData.taskData[i].getTime();
        }

        TaskAdapter adapter = new TaskAdapter(taskTitles, taskTimes);
        taskRecyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        taskRecyclerView.setLayoutManager(layoutManager);

        return view;
    }
}
