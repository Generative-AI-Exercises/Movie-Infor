package com.epam.task3.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.task3.repositories.MovieRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MovieServiceImpl {
	
	private final MovieRepository movieRepository; 
	
    // Create methods for Create, Read, Update and Delete operations

}
