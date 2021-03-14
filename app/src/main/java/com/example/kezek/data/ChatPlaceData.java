package com.example.kezek.data;

import com.example.kezek.R;

public class ChatPlaceData {

    private String title;
    private String lastMassage;
    private int imageId;

    public static ChatPlaceData[] chatPlaceData = {
            new ChatPlaceData("Black Sakal", "Спасибо вам за то, что выбираете нас", R.drawable.ic_baseline_account_box_24),
            new ChatPlaceData("Stoma-dent", "Да встречи, берегите свои зубы", R.drawable.ic_baseline_account_box_24),
            new ChatPlaceData("GRATA", "К 13:30 жду вас", R.drawable.ic_baseline_account_box_24)
    };

    public ChatPlaceData(String title, String lastMassage, int imageId) {
        this.title = title;
        this.lastMassage = lastMassage;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getLastMassage() {
        return lastMassage;
    }

    public int getImageId() {
        return imageId;
    }
}
