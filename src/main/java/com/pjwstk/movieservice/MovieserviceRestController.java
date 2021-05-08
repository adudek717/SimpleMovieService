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
    public ResponseEntity<Movie> getMovieById(@PathVariable("movieId") int movieId) {
        return ResponseEntity.ok(movieService.getMovieById(movieId));
    }

    @PostMapping
    public ResponseEntity<Movie> getMovieFromBody(@RequestBody Movie movie) {
        Movie createdMovie = movieService.getMovieFromBody();
        return ResponseEntity.ok(createdMovie);
    }

    @PutMapping("/{movieId}")
    public ResponseEntity<Movie> updateMovieById(@PathVariable("movieId") int movieId, @RequestBody Movie movie) {
        Movie createdMovie = movieService.updateMovieById(movieId, movie);
        return ResponseEntity.ok(createdMovie);
    }

    @DeleteMapping("/{movieId}")
    public ResponseEntity<Void> deleteMovieById(@PathVariable("movieId") int movieId) {
        movieService.deleteMovieById(movieId);
        return ResponseEntity.ok().build();
    }
}
