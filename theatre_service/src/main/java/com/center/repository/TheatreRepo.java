package com.center.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.center.dto.TheatreDetails;
import com.center.model.Theatre;

public interface TheatreRepo extends JpaRepository<Theatre, Integer>{ 

@Query(value = "SELECT theatre_name as TheatreName, show_date_time as showDateTime, City as city," + "screen_name as ScreenName FROM ((show s JOIN screen ON screen.screen_id = s.scr_id)" +
       "join theatre  t on t.theatre_id = s.th_id)" + "JOIN movie m ON m.id = s.movie_id where s.movie_id = ?1") 
	TheatreDetails findTheatreByMovieId(int movieId);
	
}
