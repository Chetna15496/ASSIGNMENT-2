package com.movie.service;

import com.movie.model.movieModel;

public interface MovieService {

	void addMovie(movieModel m) throws Exception;
	movieModel getMovieById(int movieId) throws Exception;
}