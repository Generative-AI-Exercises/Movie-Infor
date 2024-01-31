package com.epam.task3.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.epam.task3.entities.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {
    List<Movie> findByTitle(String title);
    List<Movie> findByReleaseDate(String releaseDate); 
}
