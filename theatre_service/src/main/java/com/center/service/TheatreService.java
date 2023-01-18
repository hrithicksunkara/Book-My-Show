package com.center.service;



import com.center.dto.TheatreDetails;
import com.center.model.Theatre;

public interface TheatreService {
		
	public Theatre saveTheatre(Theatre theatre);
	
	public TheatreDetails findTheatreByMovieId(int movieId);
	
}
