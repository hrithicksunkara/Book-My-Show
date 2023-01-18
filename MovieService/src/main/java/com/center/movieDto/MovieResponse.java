package com.center.movieDto;

	import java.util.Date;

	import com.center.entity.Genre;
	import com.center.entity.Language;
	
	public class MovieResponse {
		
		private int movieId;
		
		private String movieName;
		
		private Genre genre;
		
		private Language language;
		
		private String overview;
		
		private String hero;
		
		private String heroine;
		
		private String posterPath;
		
		private Date releaseDate;

		public int getMovieId() {
			return movieId;
		}

		public void setMovieId(int movieId) {
			this.movieId = movieId;
		}

		public String getMovieName() {
			return movieName;
		}

		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}

		public Genre getGenre() {
			return genre;
		}

		public void setGenre(Genre genre) {
			this.genre = genre;
		}

		public Language getLanguage() {
			return language;
		}

		public void setLanguage(Language language) {
			this.language = language;
		}

		public String getOverview() {
			return overview;
		}

		public void setOverview(String overview) {
			this.overview = overview;
		}

		public String getHero() {
			return hero;
		}

		public void setHero(String hero) {
			this.hero = hero;
		}

		public String getHeroine() {
			return heroine;
		}

		public void setHeroine(String heroine) {
			this.heroine = heroine;
		}

		public String getPosterPath() {
			return posterPath;
		}

		public void setPosterPath(String posterPath) {
			this.posterPath = posterPath;
		}

		public Date getReleaseDate() {
			return releaseDate;
		}

		public void setReleaseDate(Date releaseDate) {
			this.releaseDate = releaseDate;
		}
}
