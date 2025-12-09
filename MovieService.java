package com.ty.movielibrary;

import java.util.List;

public interface MovieService {
    Movie addMovie(Movie movie);
    List<Movie> getAllMovies();
    Movie getMovieById(Long id);
    Movie updateMovie(Long id, Movie movie);
    String deleteMovie(Long id);
}