package com.example.tourismapp;

public class PlaceItem {
    private int id;
    private int image;
    private String title, rent, car, bedroom;
    public PlaceItem(int id, int image, String title, String rent, String car, String bedroom) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.rent = rent;
        this.car = car;
        this.bedroom = bedroom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getBedroom() {
        return bedroom;
    }

    public void setBedroom(String bedroom) {
        this.bedroom = bedroom;
    }
}
