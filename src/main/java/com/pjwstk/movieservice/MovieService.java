package com.pjwstk.movieservice;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.getMovieById(id);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.getAllMovies();
    }

    public Movie update(Movie movie) {
        Optional<Movie> id = movieRepository.getMovieById(movie.getId());
        if (id.isEmpty()) {
            throw new RuntimeException();
        } else {
            return movieRepository.save(movie);
        }
    }

    public void deleteMovieById(Long movieId) {
        movieRepository.deleteById(movieId);
    }

    public void changeAvailable(Long movieId){
        movieRepository.changeAvailable(movieId);
    }

    // ****************************************

//    public List<Movie> getAllMovies() {
//        Movie movie1 = new Movie(0, "Shrek", "Comedy");
//        Movie movie2 = new Movie(1, "Shrek 2", "Comedy");
//        Movie movie3 = new Movie(2, "Shrek 3", "Comedy");
//
//        return List.of(movie1, movie2, movie3);
//    }
//
//    public Movie getMovieById(int movieId) {
//        Movie movie1 = new Movie(0, "Shrek", "Comedy");
//
//        return movie1;
//    }
//
//    public Movie getMovieFromBody() {
//        Movie movie1 = new Movie(0, "Shrek", "Comedy");
//        System.out.println("Getting movie from body!");
//        return movie1;
//    }
//
//    public Movie updateMovieById(int movieId, Movie movie) {
//        Movie movie1 = movie;
//        System.out.println("Updating movie with id: " + movieId);
//        return movie1;
//    }
//
//    public void deleteMovieById(int movieId) {
//        System.out.println("Deleting movie with id: " + movieId);
//    }
}
