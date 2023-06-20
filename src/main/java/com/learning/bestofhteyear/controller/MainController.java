package com.learning.bestofhteyear.controller;

import com.learning.bestofhteyear.model.Movie;
import com.learning.bestofhteyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    songs.add(new Song(3, "HComfortably Numb"));
    songs.add(new Song(4, "Rosetta Stoned"));
    songs.add(new Song(5, "Pneuma"));

    return songs;
  }
}
