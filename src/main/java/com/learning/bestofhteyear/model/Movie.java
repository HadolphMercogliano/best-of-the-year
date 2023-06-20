package com.learning.bestofhteyear.model;

public class Movie {
  private int Id;
  private String title;
  
  public Movie(int id, String title) {
    Id = id;
    this.title = title;
  }
  
  public int getId() {
    return Id;
  }
  
  public String getTitle() {
    return title;
  }
}
