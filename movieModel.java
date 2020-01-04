package com.movie.model;

public class movieModel {
 private int movieId;
 private String movieName;
 private String showDate;
 private String showTime;
 private String status;
 public movieModel() {
	// TODO Auto-generated constructor stub
}
public movieModel(int movieId, String movieName, String showDate, String showTime, String status) {
	super();
	this.movieId = movieId;
	this.movieName = movieName;
	this.showDate = showDate;
	this.showTime = showTime;
	this.status = status;
}
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getShowDate() {
	return showDate;
}
public void setShowDate(String showDate) {
	this.showDate = showDate;
}
public String getShowTime() {
	return showTime;
}
public void setShowTime(String showTime) {
	this.showTime = showTime;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "movieModel [movieId=" + movieId + ", movieName=" + movieName + ", showDate=" + showDate + ", showTime="
			+ showTime + ", status=" + status + "]";
}
 
}
