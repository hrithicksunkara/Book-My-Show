	package com.center.Controller;
	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.client.RestTemplate;

	import com.center.entity.Movie;
	import com.center.movieDto.MovieResponse;
	import com.center.repo.MoviesRepository;
	import com.center.service.MovieService;


	@RestController
	@RequestMapping("/movie")
	public class MovieServiceController {
		
		@Autowired
	    MovieService service;
		
		@PostMapping("/")
		public Movie createMovie(@RequestBody Movie movie) {
		
			Movie savedMovie = service.saveMovie(movie);
			
			return savedMovie;
		}
		
		@GetMapping("/getAllMovies")
		public List<Movie> getAllMovies() {
			
			return service.getAll();
			
		}
		
		@GetMapping("/movieId/{movieId}")
		public MovieResponse getMovieDetails(@PathVariable("movieId") int movieId) {
			
			return service.getMovieById(movieId);
			
		}
		
		@GetMapping("movieName/{movieName}")
		public MovieResponse findByMovieName(@PathVariable("movieName") String movieName) {
			
			return service.findByMovieName(movieName);
		}
		
		@GetMapping("/searchMovie/{movieName}")
		
		public MovieResponse findMovieByName(@PathVariable ("name") String name) {
			
			return service.findByMovieName(name);
		}
			
		@GetMapping("/filterBy/{movieName}")
			public MovieResponse findMovie (@PathVariable ("movieName") String movieName) {
			
			return service.findByMovieGenreOrLanguage(movieName);
		}

		}
		
