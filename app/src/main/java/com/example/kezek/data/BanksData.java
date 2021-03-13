package com.example.kezek.data;

import com.example.kezek.R;

public class BanksData {

    private String title;
    private String money;
    private int color;
    private int imageIds;


    public BanksData(String title, String money, int color, int imageIds) {
        this.title = title;
        this.money = money;
        this.color = color;
        this.imageIds = imageIds;
    }

    public static BanksData[] banksData = {
            new BanksData("О Деньги", "18900 c", R.color.o_color , R.drawable.logo_o_dengi),
            new BanksData("М банк", "9900 c", R.color.m_color , R.drawable.m_bank),
            new BanksData("Элсом", "23900 с", R.color.el_color, R.drawable.logo_elsom_rgb_72)
    };

    public String getTitle() {
        return title;
    }

    public String getMoney() {
        return money;
    }

    public int getColor() {return color;}

    public int getImageIds() {
        return imageIds;
    }
}
