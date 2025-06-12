package org.lld.musicplayer;

public interface PlaybackMode {
  Song getNextSong(Playlist playlist);
}
