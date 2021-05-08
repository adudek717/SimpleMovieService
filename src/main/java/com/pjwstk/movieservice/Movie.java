package com.pjwstk.movieservice;

public class Movie {
    private int id;
    private String name;
    private String category;
    private String description;
    private int lengthInSeconds;
    private float rating;

    public Movie() {
    }

    public Movie(int id, String name, String category, String description, int lengthInSeconds, float rating) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.lengthInSeconds = lengthInSeconds;
        this.rating = rating;
    }

    public Movie(int id, String name, String category, String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
    }

    public Movie(int id, String name, String category, int lengthInSeconds) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.lengthInSeconds = lengthInSeconds;
    }

    public Movie(int id, String name, String category, float rating) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.rating = rating;
    }

    public Movie(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public void setLengthInSeconds(int lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
