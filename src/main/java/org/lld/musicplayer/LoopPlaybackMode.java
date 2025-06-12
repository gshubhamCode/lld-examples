package org.lld.musicplayer;

public class LoopPlaybackMode implements PlaybackMode {
  @Override
  public Song getNextSong(Playlist playlist) {
    return playlist.getCurrentSong();
  }
}
