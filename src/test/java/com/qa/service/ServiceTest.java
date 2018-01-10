package com.qa.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.model.Movie;

//import firstExercise.qa.com.Service;

public class ServiceTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Service map = new Service();

		Movie movie1 = new Movie("Harry Potter", "Fantasy", "6");
		Movie movie2 = new Movie("Rush Hour", "Action", "8");
		Movie movie3 = new Movie("Rambo", "Action", "3");

		map.addMovie(movie1);
		map.addMovie(movie2);
		map.addMovie(movie3);

		int genreCount = map.findMovieByGenre("Action");
		assertEquals("Expected result", genreCount, 2);

		genreCount = map.findMovieByGenre("Fantasy");
		assertEquals("Expected result", genreCount, 1);

	}

}
