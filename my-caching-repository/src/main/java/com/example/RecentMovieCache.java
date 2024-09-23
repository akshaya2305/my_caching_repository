package com.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class RecentMovieCache {
    public static void main(String[] args) {
             
      Map<String, String> recentMoviewCache =
        new LinkedHashMap<String, String>(100, 0.75f, true);
        
    //L2 Cache Implementation
     
      Map<String, String> popularMoviewCache =
        new LinkedHashMap<String, String>(1000, 0.75f, true);      
        
        String[] genres= {"Action", "Comedy", "Drama", "Horror", "Romance", "Sci-Fi", "Thriller"};
        //Write code to generate 1000 movies with random genres and push in popularMoviewCache
        for(int i=0; i<2000; i++){
            String movie = "Movie" + i;
            String genre = genres[new Random().nextInt(genres.length)];
            popularMoviewCache.put(movie, genre);
        }
        //Write code to generate 100 recentlye viewed movies and push in recentMoviewCache
        for(int i=0; i<100; i++){
            String movie = "Movie" + i;
            recentMoviewCache.put(movie, "Recently Viewed");
        }   
        //Write code to print it with time it takes to fetch the movie form map
        long startTime = System.nanoTime();
        String movie = popularMoviewCache.get("Movie100");
        long endTime = System.nanoTime();
        System.out.println("Time taken to fetch the movie: " + (endTime - startTime) + " nanoseconds");
        }
    
}
