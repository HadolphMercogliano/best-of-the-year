package com.learning.bestofhteyear.model;

public class Song {
  private int Id;
  private String title;
  
  public Song(int id, String title) {
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
