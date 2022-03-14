package ru.netology.domain;

public class Smartphone extends Product {
    private String marker;

    public Smartphone() {}

    public Smartphone(int id, String name, int price, String marker) {
        super(id, name, price);
        this.marker = marker;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }
}
