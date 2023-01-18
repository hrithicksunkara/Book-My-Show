package com.center.movieDto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TheatreDetails {
	private String theatreName;
	private LocalDateTime showDateTime;
	private String City;
	private String screenName;
	
}
