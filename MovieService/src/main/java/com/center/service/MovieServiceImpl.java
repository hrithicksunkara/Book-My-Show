package com.center.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.center.entity.Movie;
import com.center.movieDto.MovieResponse;
import com.center.repo.MoviesRepository;

@Service
@Component
public class MovieServiceImpl implements MovieService{
		
	@Autowired
	MoviesRepository moviesRepository;
	
	@Override
	public MovieResponse getMovieById(int movieId) {


       MovieResponse movieResponse = new MovieResponse();


       Movie movie = moviesRepository.findById(movieId).get();


       movieResponse.setMovieId(movie.getMovieId());
       movieResponse.setMovieName(movie.getMovieName());
       movieResponse.setGenre(movie.getGenre());
       movieResponse.setLanguage(movie.getLanguage());
       movieResponse.setOverview(movie.getOverview());
       movieResponse.setHero(movie.getHero());
       movieResponse.setHeroine(movie.getHeroine());
       movieResponse.setPosterPath(movie.getPoster());
       movieResponse.setReleaseDate(movie.getReleaseDate());

       return movieResponse;
    }
	
	public MovieResponse getMovieByName(String movieName) {
		
		 MovieResponse movieResponse = new MovieResponse();
		 
		 
	       Movie movie = moviesRepository.findByMovieName(movieName);


	       movieResponse.setMovieId(movie.getMovieId());
	       movieResponse.setMovieName(movie.getMovieName());
	       movieResponse.setGenre(movie.getGenre());
	       movieResponse.setLanguage(movie.getLanguage());
	       movieResponse.setOverview(movie.getOverview());
	       movieResponse.setHero(movie.getHero());
	       movieResponse.setHeroine(movie.getHeroine());
	       movieResponse.setPosterPath(movie.getPoster());
	       movieResponse.setReleaseDate(movie.getReleaseDate());
	       
	       return movieResponse;
	}

	@Override
	public Movie saveMovie( Movie movie) {
		Movie savedMovie = moviesRepository.save(movie);
		return savedMovie;
		
	}

	@Override
	public List<Movie> getAll() {
		
		return moviesRepository.findAll();
	}

	@Override
	public MovieResponse findByMovieGenreOrLanguage(String movieName) {
	
		return null;
	}

	@Override
	public MovieResponse findByMovieName(String movieName) {
		
		return null;
	}
}
