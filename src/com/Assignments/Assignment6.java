package com.Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment6 {

	public static void main(String[] args) {
		
		
		//1. Create a list of the top 5 most populated countries in the world and print 2nd Country
		
		
		List<String> topCountries=new ArrayList<String>();
		
		topCountries.add("India");
		topCountries.add("China");
		topCountries.add("United States");
		topCountries.add("Indonesia");
		topCountries.add("Pakistan");
		
		System.out.println("topCountries - "+topCountries.get(1));
		
		
		//2. Create a set of the top 10 most visited tourist attractions in the world and print out its size.
		
		Set<String> topTouristPlaces=new HashSet<String>();
		
		topTouristPlaces.add("Eiffel Tower");
		topTouristPlaces.add("Colosseum");
		topTouristPlaces.add("Louvre Museum");
		topTouristPlaces.add("Great Wall of China");
		topTouristPlaces.add("Great Pyramid of Giza");
		topTouristPlaces.add("Sagrada Familia");
		topTouristPlaces.add("Taj Mahal");
		topTouristPlaces.add("Statue of Liberty");
		topTouristPlaces.add("Paris");
		topTouristPlaces.add("Bangkok");
		
		System.out.println("topTouristPlaces - "+topTouristPlaces.size());
		
		
		//3. Create a map of the 5 largest cities in the United States and their populations.
		
		
		Map<String,Integer> topCities=new HashMap<String,Integer>();
		
		topCities.put("New York City", 8478072);
		topCities.put("Los Angeles", 3878704);
		topCities.put("Chicago", 2721308);
		topCities.put("Houston", 2390125);
		topCities.put("Phoenix", 1673164);
		
		System.out.println("topCities - "+topCities.values().size());
		
		
		//4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		
		
		int[] sumOfTwoNumbers= {234,123,345,456,453,567,768,987,213,314};
		
		System.out.println("sumOfTwoNumbers - "+(sumOfTwoNumbers[2]+sumOfTwoNumbers[4]));
		
		//5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		
		List<String> topFiveMovies=new LinkedList<String>();
		
		topFiveMovies.add("Avatar");
		topFiveMovies.add("Avengers");
		topFiveMovies.add("Avatar: The Way of Water");
		topFiveMovies.add("Titanic");
		topFiveMovies.add("Star Wars: Episode VII - The Force Awakens");
		
		System.out.println("topFiveMovies - "+topFiveMovies.get(2));
		
		
		
		
		
		
		
	}

}
