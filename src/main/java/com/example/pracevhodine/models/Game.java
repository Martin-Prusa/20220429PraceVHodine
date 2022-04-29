package com.example.pracevhodine.models;

public class Game {
    private String title;
    private String releaseDate;
    private double price;
    private String developer;
    private String publisher;
    private int metascore;

    public Game(String title, String releaseDate, double price, String developer, String publisher, int metascore) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.price = price;
        this.developer = developer;
        this.publisher = publisher;
        this.metascore = metascore;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getMetascore() {
        return metascore;
    }
}
