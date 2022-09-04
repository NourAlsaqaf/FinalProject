package com.example.ilost;

public class Items {
    private String itemName;
    private String itemTime;
    private int itemImage;

    public Items(String itemName, String itemTime, int itemImage) {
        this.itemName = itemName;
        this.itemTime = itemTime;
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemTime() {
        return itemTime;
    }

    public void setItemTime(String itemTime) {
        this.itemTime = itemTime;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }
}

