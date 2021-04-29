package com.example.noteapp;

public class ModelClass {

    private String nameActivity;
    private int deleteImage;

    public ModelClass(String nameActivity, int deleteImage) {
        this.nameActivity = nameActivity;
        this.deleteImage = deleteImage;
    }

    public String getNameActivity() {
        return nameActivity;
    }

    public void setNameActivity(String nameActivity) {
        this.nameActivity = nameActivity;

    }

    public int getDeleteImage() {
        return deleteImage;
    }

    public void setDeleteImage(int deleteImage) {
        this.deleteImage = deleteImage;
    }
}
