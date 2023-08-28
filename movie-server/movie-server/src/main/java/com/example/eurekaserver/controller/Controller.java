package com.example.eurekaserver.controller;

import com.example.eurekaserver.entity.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class Controller {

    @GetMapping
    public List<Movie> getAllMovies(){
        List<Movie> movies = new ArrayList<Movie>();

        movies.add(new Movie("test","2004","7,7"));
        movies.add(new Movie("bir","1900","7,7"));
        return movies;
    }
    @GetMapping("/test")
    public String getTest(){
        return "test";
    }
}
