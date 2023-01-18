package com.center.model;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "theatre")
public class Theatre {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "theatre_id")
		private int TheatreId;
		
		@Column(name = "theatre_name")
		private String TheatreName;
		
		@Column(name = "city")
		private String City;
		
		@Column(name = "state")
		private String state;
		
		@OneToMany(cascade = CascadeType.ALL)
		@JoinColumn(name = "th_id", referencedColumnName = "theatre_id")
		private List<Screen> screens;

		
		@OneToMany
		@JoinColumn(name = "th_id",  referencedColumnName = "theatre_id")
		private List<Show> show;


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


		public String getState() {
			return state;
		}


		public void setState(String state) {
			this.state = state;
		}


		public List<Screen> getScreens() {
			return screens;
		}


		public void setScreens(List<Screen> screens) {
			this.screens = screens;
		}


		public List<Show> getShow() {
			return show;
		}


		public void setShow(List<Show> show) {
			this.show = show;
		}


		public Theatre(int theatreId, String theatreName, String city, String state, List<Screen> screens,
				List<Show> show) {
			super();
			TheatreId = theatreId;
			TheatreName = theatreName;
			City = city;
			this.state = state;
			this.screens = screens;
			this.show = show;
		}


		public Theatre() {
			super();
		}
		
		
		
}
