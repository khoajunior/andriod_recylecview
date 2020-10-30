package com.example.fragment_tiki.model;

public class Donut {
    private String title;
    private String desp;
    private String price;
    private int image;

    public Donut(String title, String desp, String price, int image) {
        this.title = title;
        this.desp = desp;
        this.price = price;
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Donut(String title, String desp, int image) {
        this.title = title;
        this.desp = desp;
        this.image = image;
    }

    public Donut() {
    }

    @Override
    public String toString() {
        return "Donut{" +
                "title='" + title + '\'' +
                ", desp='" + desp + '\'' +
                ", image=" + image +
                '}';
    }
}
