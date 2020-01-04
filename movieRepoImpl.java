package com.movie.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.movie.model.movieModel;

public class movieRepoImpl implements movieRepo
{
	List<movieModel> movieList=new ArrayList<>();
movieModel m1=new movieModel(100,"sweet","20-10-18","8:00PM","Available");
movieModel m2=new movieModel(101,"show","22-8-18","9:00AM","Not-available");



@Override
   public movieModel getMovieById(int movieId) throws Exception
   {
	movieList.add(m1);
	movieList.add(m2);
	
	   for(movieModel obj:movieList ) {
		   if(obj.getMovieId()==movieId) {
			   return obj;
		   }
		   
	   }
	return null;
   }
	
	
	@Override
	public void addMovie(movieModel m) throws Exception {
		movieList.add(m);
	
	   System.out.println("Movie Added");

	}
}