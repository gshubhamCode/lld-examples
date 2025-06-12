package org.lld.musicplayer;

public class SequentialPlaybackMode implements PlaybackMode {
  @Override
  public Song getNextSong(Playlist playlist) {
    return playlist.getNextSequential();
  }
}
