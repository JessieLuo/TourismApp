package com.example.tourismapp;

public class TopItem {
    private int image;
    private int id;
    public TopItem(int id, int image){
        this.id = id;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
