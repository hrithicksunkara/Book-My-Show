package com.center.service;

import java.util.List;

import com.center.entity.Movie;
import com.center.movieDto.MovieResponse;

public interface MovieService {
public Movie saveMovie(Movie movie);
	
	public MovieResponse getMovieById(int movieId);
	
	public MovieResponse findByMovieName(String movieName);
	
	public List<Movie> getAll();
	
	public MovieResponse findByMovieGenreOrLanguage (String movieName);
	
}
