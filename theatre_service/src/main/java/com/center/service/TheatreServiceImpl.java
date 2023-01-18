package com.center.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.center.dto.TheatreDetails;
import com.center.model.Theatre;
import com.center.repository.TheatreRepo;

@Service
public class TheatreServiceImpl implements TheatreService {
	 
	@Autowired
	TheatreRepo theatreRepo;
	
	
	@Override
	public Theatre saveTheatre(Theatre theatre) {
		
		Theatre savedTheatre = theatreRepo.save(theatre);
		
		return savedTheatre;
	}
	
	
	@Override
	public TheatreDetails findTheatreByMovieId (int movieId) {
	
		TheatreDetails theatreDetails = theatreRepo.findTheatreByMovieId(movieId);
		
		return theatreDetails;
		
	}
	
}
	
