package com.center.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.center.dto.TheatreDetails;
import com.center.model.Theatre;
import com.center.service.TheatreService;

@CrossOrigin(origins = "*")
@RestController
public class TheatreController {
		
		@Autowired
		TheatreService theatreService;
		
		
		@PostMapping("/theatre/create")
		public Theatre createTheatre(@RequestBody Theatre theatre) {
			
			Theatre saveTheatre = theatreService.saveTheatre(theatre);
			return saveTheatre;
		}
		
		@GetMapping("theatre/{movieId}")
		
		public TheatreDetails getTheatreByMovieId(@PathVariable("movieId") int movieId) {
			return theatreService.findTheatreByMovieId(movieId);
		}
		
	
		
		//@GetMapping("/theatre/{id}")
		//public TheatreResponse getTheatreById(@PathVariable Integer id) {
		
			//TheatreResponse theatreResponse = theatreService.getTheatreById(id);
			//List response = this.restTemplate.getForObject("http://localhost:8081/movieId/" + id, List.class);
			//theatreResponse.setMovieResponse(response);
			//return theatreResponse;
		//}
		
		//@GetMapping("/moviesFromTheatre/{id}")
		//public List<MovieResponse> getMovieByTheatre(@PathVariable("id")int id){
			
			//List<MovieResponse> movieResponse = theatreService.getMoviesById(id);
			
			//return movieResponse;//
		}

		
