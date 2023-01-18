package com.center.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.center.entity.Movie;

public interface MoviesRepository extends JpaRepository<Movie, Integer>{ 
		

	@Query(nativeQuery = true, value = "select * from movie where movie_name = :movieName OR hero = :movieName OR heroine = :movieName")
	public Movie findByMovieName(@Param("movieName") String movieName);
	
	@Query(nativeQuery = true, value = "select * from movie where genre = :movieName or language = :movieName")
	public Movie findByMovieGenreOrLanguage(@Param("movieName") String movieName);
	
}
