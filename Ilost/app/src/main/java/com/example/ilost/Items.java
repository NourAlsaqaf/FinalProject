package com.example.ilost;

import java.io.Serializable;

public class Items implements Serializable {
    private String itemName;
    private String itemTime;
    private int itemImage;
    private String itemLocation;

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

    public String getItemLocation() {
        return itemLocation;
    }

    public void setItemLocation(String itemLocation) {
        this.itemLocation = itemLocation;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    private String userNumber;

    public Items(String itemName, String itemTime, int itemImage, String itemLocation, String userNumber) {
        this.itemName = itemName;
        this.itemTime = itemTime;
        this.itemImage = itemImage;
        this.itemLocation = itemLocation;
        this.userNumber = userNumber;
    }
}
