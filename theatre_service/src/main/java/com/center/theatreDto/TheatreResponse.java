package com.center.theatreDto;

import java.util.ArrayList;
import java.util.List;

public class TheatreResponse {
		
		private int TheatreId;
		private String TheatreName;
		private String City;
		
		
		public int getTheatreId() {
			return TheatreId;
		}


		public void setTheatreId(int theatreId) {
			TheatreId = theatreId;
		}


		public String getTheatreName() {
			return TheatreName;
		}


		public void setTheatreName(String theatreName) {
			TheatreName = theatreName;
		}


		public String getCity() {
			return City;
		}


		public void setCity(String city) {
			City = city;
		}


		public List<MovieResponse> getMovieResponse() {
			return movieResponse;
		}


		public void setMovieResponse(List<MovieResponse> movieResponse) {
			this.movieResponse = movieResponse;
		}


		List<MovieResponse> movieResponse = new ArrayList<>();
}
