package org.lld.musicplayer;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

  List<Song> songList = new ArrayList<>();
  int currentSongIndex = 0;

  // for testing purpose
  void addSong(Song newSong) {
    songList.add(newSong);
  }

  Song getSong(int index) {
    if (index >= 0 && index < songList.size()) {
      return songList.get(index);
    }
    return null;
  }

  Song getCurrentSong() {
    return getSong(currentSongIndex);
  }

  Song getNextSequential() {
    if (songList.size() == 0) return null;
    int nextSequentialSongIndex = currentSongIndex == songList.size() ? 0 : currentSongIndex + 1;
    return getSong(nextSequentialSongIndex);
  }

  int getSize() {
    return songList.size();
  }

  // play song at index
  void play(int index) {
    if (index >= 0 && index < songList.size()) {
      currentSongIndex = index;
    }
  }

  /**
   * Returns the index of the given song in the playlist.
   *
   * <p>Future enhancement: - Replace linear search with a Map<Song, Integer> for O(1) lookup -
   * Update map in addSong() and removeSong() methods accordingly
   */
  public int getIndexOfSong(Song song) {
    return songList.indexOf(song); // Linear search for now
  }
}
