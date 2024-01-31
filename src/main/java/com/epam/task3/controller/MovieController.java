package com.epam.task3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.epam.task3.entities.Movie;
import com.epam.task3.service.MovieService;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/movies")
public class MovieController {

	private final MovieService movieService;

  @PostMapping
  public Movie createMovie(@RequestBody Movie movie) {
    return movieService.saveMovie(movie);
  }

  @GetMapping("/{id}")
  public Movie getMovie(@PathVariable String id) {
    return movieService.getMovie(id);
  }

  // Create other endpoints for reading all, updating, deleting 
}