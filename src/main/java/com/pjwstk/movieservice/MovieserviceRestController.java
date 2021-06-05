package com.pjwstk.movieservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieserviceRestController {

    private final MovieService movieService;

    public MovieserviceRestController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getRequestMovies() {
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    @GetMapping("/{movieId}")
    public ResponseEntity<Movie> getMovieById(@PathVariable("movieId") Long movieId) {
        return ResponseEntity.ok(movieService.getMovieById(movieId).get());
    }

    @PostMapping
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
        Movie createdMovie = movieService.update(movie);
        return ResponseEntity.ok(createdMovie);
    }

    @PutMapping
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie) {
        Movie createdMovie = movieService.update(movie);
        return ResponseEntity.ok(createdMovie);
    }

    @DeleteMapping("/{movieId}")
    public ResponseEntity<Void> deleteMovieById(@PathVariable("movieId") Long movieId) {
        movieService.deleteMovieById(movieId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/isAvailable/{movieId}")
    public ResponseEntity<Void> changeAvailable(@PathVariable("movieId") Long movieId){
        movieService.changeAvailable(movieId);
        return ResponseEntity.ok().build();
    }
}

/*
    @PutMapping("/{movieId}")
    public ResponseEntity<Movie> updateMovieById(@PathVariable("movieId") Long movieId, @RequestBody Movie movie) {
        Movie createdMovie = movieService.update(movieId, movie);
        return ResponseEntity.ok(createdMovie);
    }
 */