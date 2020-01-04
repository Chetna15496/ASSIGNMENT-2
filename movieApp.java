package com.movie.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.movie.model.movieModel;
import com.movie.service.MovieRepoService;
import com.movie.service.MovieService;

public class movieApp {

	public static void main(String[] args) throws Exception {
	MovieService service=new MovieRepoService();
	//movieModel m=new movieModel();
	List<movieModel> mList= new ArrayList<>();
	Scanner sc=new Scanner(System.in);


	System.out.println("Enter id,name,showtime,showdate & show status\n");
	int id=sc.nextInt();
	String name=sc.next();
	String showDate=sc.next();
	String showTime=sc.next();
	String status=sc.next();
	movieModel m1= new movieModel(id,name,showDate,showTime,status);
//	m1.setMovieId(id);
//	m1.setMovieName(name);
//	m1.setShowDate(showdate);
//	m1.setShowTime(showtime);
//	m1.setStatus(status);
	service.addMovie(m1);
	System.out.println(m1);
	
	System.out.println("Enter movie id");
	int movieId=sc.nextInt();
	m1=service.getMovieById(movieId);
	if(m1!=null)
	{
	System.out.println(m1);
	}
	else 
	{
		System.out.println("Invalid");
	
	}
	
	}
}
