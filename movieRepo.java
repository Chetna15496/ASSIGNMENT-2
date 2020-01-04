package com.movie.repo;

import com.movie.model.movieModel;

public interface movieRepo {

	void addMovie(movieModel m) throws Exception;

	movieModel getMovieById(int movieId) throws Exception;
    
}
