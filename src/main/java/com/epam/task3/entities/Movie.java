package com.epam.task3.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Movie {
	
    @Id
    private String id;
    private String title;
    private String releaseDate;
    private Long runtime;
    private List<Director> directors;
    private List<Actor> actors;

    // Constructors, getters and setters...
}
