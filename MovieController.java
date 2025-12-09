package com.ty.movielibrary;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/")
    public String viewMovies(Model model) {
        model.addAttribute("movies", movieService.getAllMovies());
        return "index";
    }

    @GetMapping("/add")
    public String showAddMovieForm(Model model) {
        model.addAttribute("movie", new Movie());
        return "add-movie";
    }

    @PostMapping("/add")
    public String addMovie(Movie movie) {
        movieService.addMovie(movie);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String showUpdateMovieForm(@PathVariable Long id, Model model) {
        model.addAttribute("movie", movieService.getMovieById(id));
        return "update-movie";
    }

    @PostMapping("/update/{id}")
    public String updateMovie(@PathVariable Long id, Movie movie) {
        movieService.updateMovie(id, movie);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return "redirect:/";
    }
    
    @GetMapping("/movies")
    public String listMovies(Model model) {
        model.addAttribute("movies", movieService.getAllMovies());
        return "index";
    }

    @GetMapping("/addMovie")
    @PreAuthorize("hasRole('ADMIN')")
    public String addMovieForm(Model model) {
        model.addAttribute("movie", new Movie());
        return "add-movie";
    }
    
    

}