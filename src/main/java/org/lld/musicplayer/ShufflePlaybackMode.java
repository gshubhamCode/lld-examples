package org.lld.musicplayer;

import java.util.*;

public class ShufflePlaybackMode implements PlaybackMode {
  private List<Integer> unplayed = new ArrayList<>();
  private final Random random = new Random();

  @Override
  public Song getNextSong(Playlist playlist) {
    // Initialize unplayed list if empty
    if (unplayed.isEmpty()) {
      unplayed = initIndexList(playlist.getSize());
    }

    int songIndex = popRandomIndex(unplayed);
    return playlist.getSong(songIndex);
  }

  private List<Integer> initIndexList(int size) {
    List<Integer> indices = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
      indices.add(i);
    }
    return indices;
  }

  private int popRandomIndex(List<Integer> unplayed) {
    // O(1) random pick and remove using swap-and-remove-last
    int randIdx = random.nextInt(unplayed.size());
    int lastIdx = unplayed.size() - 1;

    // swap random and last
    Collections.swap(unplayed, randIdx, lastIdx);

    // remove last in O(1)
    return unplayed.remove(lastIdx);
  }
}
