package com.center.model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "screen")
public class Screen {
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "screen_id")
	private int screenId;
	
	@Column(name = "screen_name")
	private String screenName;
	
	@OneToMany
	@JoinColumn(name = "screen_fid", referencedColumnName = "show_id")
	private List<Screen> screen;
	
	@ManyToOne
	@JoinColumn(name = "theatreId")
	private Theatre theatre;
	
	@OneToMany(mappedBy = "screen")
	private Set<Show> shows;
	
	@OneToMany(mappedBy = "screen")
	private Set<Seats> seats;

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public List<Screen> getScreen() {
		return screen;
	}

	public void setScreen(List<Screen> screen) {
		this.screen = screen;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	public Set<Show> getShows() {
		return shows;
	}

	public void setShows(Set<Show> shows) {
		this.shows = shows;
	}

	public Set<Seats> getSeats() {
		return seats;
	}

	public void setSeats(Set<Seats> seats) {
		this.seats = seats;
	}

			
}
