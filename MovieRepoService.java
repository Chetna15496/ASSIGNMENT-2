package com.movie.service;

import com.movie.model.movieModel;
import com.movie.repo.movieRepo;
import com.movie.repo.movieRepoImpl;

public class MovieRepoService implements MovieService {
	movieRepo repo;
	public MovieRepoService() {
		repo=new movieRepoImpl();
	}
	@Override
	public void addMovie(movieModel m) throws Exception {
		repo.addMovie(m);
	}
	@Override
	public movieModel getMovieById(int movieId) throws Exception {
		
		return repo.getMovieById(movieId);
	}
}
