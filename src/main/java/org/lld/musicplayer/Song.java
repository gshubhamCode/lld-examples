package org.lld.musicplayer;

import java.util.List;

public class Song {

  private String name;
  private String albumName;
  private List<String> singers;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAlbumName() {
    return albumName;
  }

  public void setAlbumName(String albumName) {
    this.albumName = albumName;
  }

  public List<String> getSingers() {
    return singers;
  }

  public void setSingers(List<String> singers) {
    this.singers = singers;
  }
}
