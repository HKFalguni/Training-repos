package com.rakuten.training.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movie")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
	int id;
	@Column(name = "movie_poster")
	String poster;
	@Column(name = "movie_name")
	String name;
	@Column(name = "movie_movieDesc")
	String movieDesc;
	@Column(name = "movie_Songs")
	int numSongs;
	@Column(name = "movie_fight")
	int numFight;
	@Column(name = "movie_genre")
	String genre;
	
	public Movie(String poster, String name, String movieDesc, int numSongs, int numFlight, String genre) {
		super();
		this.poster = poster;
		this.name = name;
		this.movieDesc = movieDesc;
		this.numSongs = numSongs;
		this.numFight = numFight;
		this.genre = genre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMovieDesc() {
		return movieDesc;
	}

	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}

	public int getNumSongs() {
		return numSongs;
	}

	public void setNumSongs(int numSongs) {
		this.numSongs = numSongs;
	}

	public int getNumFight() {
		return numFight;
	}

	public void setNumFight(int numFight) {
		this.numFight = numFight;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	

}
