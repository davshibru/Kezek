package com.example.kezek.data;

import com.example.kezek.R;

public class EmploeeData {
    private int imageId;
    private String description;

    private EmploeeData(int imageId, String description) {
        this.imageId = imageId;
        this.description = description;
    }

    public static EmploeeData[] emploeeData = {
            new EmploeeData(R.drawable.ic_baseline_account_box_24, "Рустам, 26 лет, опыт работы 8 лет"),
            new EmploeeData(R.drawable.ic_baseline_account_box_24, "Евгений, 23 года, опыт работы 8 лет"),
            new EmploeeData(R.drawable.ic_baseline_account_box_24, "Евгений, 23 года, опыт работы 8 лет")
    };

    public   final  int getImageId() {
        return imageId;
    }

    public String getDescription() {
        return description;
    }
}
