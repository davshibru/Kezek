package com.example.kezek.data;

import com.example.kezek.R;

public class TaskData {

    private String title;
    private String time;

    public static TaskData[] taskData = {
            new TaskData("Stoma-dent", "9:30"),
            new TaskData("GRATA", "13:30"),
            new TaskData("Black Sakal", "17:50")

    };

    public TaskData(String title, String time) {
        this.title = title;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }
}
