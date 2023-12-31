package com.learning.bestofhteyear.controller;

import com.learning.bestofhteyear.model.Movie;
import com.learning.bestofhteyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {
  @GetMapping("/")
  public String home(Model model) {
    String creatorName = getCreatorName();
    model.addAttribute("creator", creatorName);
    return "index";
  }
  
  private String getCreatorName() {
    return "Hadolph";
  }
  @GetMapping("/movies")
  public String movies(Model model) {
    model.addAttribute("movies", getBestMovies());
    return "movies";
  }
  @GetMapping("/movies/{id}")
  public String getMovieById(@PathVariable Integer id, Model model) {
    Movie selectedMovie = null;
    for (Movie movie : getBestMovies()) {
      if (movie.getId() == id) selectedMovie = movie;
    }
    model.addAttribute("movie", selectedMovie);
    return "movieDetails";
  }
  
  
  @GetMapping("/songs")
  public String songs(Model model) {
    model.addAttribute("songs", getBestSongs());
    return "songs";
  }
  @GetMapping("/songs/{id}")
  public String getSongById(@PathVariable Integer id, Model model) {
    Song selectedSong = null;
    for (Song song : getBestSongs()) {
      if (song.getId() == id) selectedSong = song;
    }
    model.addAttribute("song", selectedSong);
    return "songDetails";
  }
  
  private List<Movie> getBestMovies() {
    List<Movie> movies = new ArrayList<>();
    movies.add(new Movie(1, "Il cavaliere oscuro - Il ritorno"));
    movies.add(new Movie(2, "Il Signore degli Anelli - Il ritorno del re"));
    movies.add(new Movie(3, "Pulp Fiction"));
    movies.add(new Movie(4, "Fight Club"));
    movies.add(new Movie(5, "Il gladiatore "));
    
    return movies;
  }
  private List<Song> getBestSongs() {
    List<Song> songs = new ArrayList<>();
    songs.add(new Song(1, "Bohemian Rhapsody"));
    songs.add(new Song(2, "Smells Like Teen Spirit"));
    songs.add(new Song(3, "Comfortably Numb"));
    songs.add(new Song(4, "Rosetta Stoned"));
    songs.add(new Song(5, "Pneuma"));

    return songs;
  }
//  LIST ITEM TO STRING METHODS

//  private String movieListToString(List<Movie> list) {
//    StringBuilder titles = new StringBuilder();
//    for (int i = 0; i < list.size(); i++) {
//      titles.append(list.get(i).getTitle());
//      if(i < list.size() - 1) {
//        titles.append(", ");
//      }
//    }
//    return titles.toString();
//  }
//  private String songListToString(List<Song> list) {
//    StringBuilder titles = new StringBuilder();
//    for (int i = 0; i < list.size(); i++) {
//      titles.append(list.get(i).getTitle());
//      if(i < list.size() - 1) {
//        titles.append(", ");
//      }
//    }
//    return titles.toString();
//  }
}
