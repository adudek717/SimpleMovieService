package com.pjwstk.movieservice;

import javax.persistence.*;

@Entity
//@Table(name="Movie")
public class Movie {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Category category;
    private String description;
    private int lengthInSeconds;
    private float rating;
    private boolean isAvailable;

    public Movie() {
    }

    public Movie(Long id, String name, Category category, String description, int lengthInSeconds, float rating) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.lengthInSeconds = lengthInSeconds;
        this.rating = rating;
    }

    public Movie(Long id, String name, Category category, String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
    }

    public Movie(Long id, String name, Category category, int lengthInSeconds) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.lengthInSeconds = lengthInSeconds;
    }

    public Movie(Long id, String name, Category category, float rating) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.rating = rating;
    }

    public Movie(Long id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
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
