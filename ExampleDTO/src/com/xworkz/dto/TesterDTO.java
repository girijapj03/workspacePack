package com.xworkz.dto;

import com.xworkz.dto.constant.MovieType;
import com.xworkz.dto.dtoEx.MovieDTO;
import com.xworkz.dto.dtoEx.PlaceDTO;

public class TesterDTO {

	public static void main(String[] args) {
		MovieDTO movie = new MovieDTO("INCEPTION", "ENGLISH", 3.00, MovieType.THRILLER, false);
		movie.setAvailInPrime(true);
		movie.setHours(3.00);
		movie.setLanguge("ENGLISH");
		movie.setName("INCEPTION");
		movie.setType(MovieType.THRILLER);
		System.out.println(movie);

		PlaceDTO place = new PlaceDTO();
		place.setName("Mudhol");
		place.setFamousFor("MUDHOL HOUND");
		place.setInKarnataka(true);
		place.setPincode(587313);
		System.out.println(place);
	}

}
