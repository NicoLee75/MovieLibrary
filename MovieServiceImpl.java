package com.ty.movielibrary;


import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public Movie updateMovie(Long id, Movie movie) {
        Movie existing = movieRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setTitle(movie.getTitle());
            existing.setGenre(movie.getGenre());
            existing.setYear(movie.getYear());
            existing.setRating(movie.getRating());
            return movieRepository.save(existing);
        }
        return null;
    }

    @Override
    public String deleteMovie(Long id) {
        movieRepository.deleteById(id);
        return "Movie removed successfully!";
    }
}