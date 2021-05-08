package com.pjwstk.movieservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    public List<Movie> getAllMovies() {
        Movie movie1 = new Movie(0, "Shrek", "Comedy");
        Movie movie2 = new Movie(1, "Shrek 2", "Comedy");
        Movie movie3 = new Movie(2, "Shrek 3", "Comedy");

        return List.of(movie1, movie2, movie3);
    }
}