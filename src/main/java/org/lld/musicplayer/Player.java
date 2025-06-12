package org.lld.musicplayer;

public class Player {

  private PlaybackMode currentPlaybackMode;
  private Playlist currentPlaylist;


  private PlayerState playerState;

  public Player(Playlist playlist, Modes mode) {
    this.currentPlaylist = playlist;
    this.currentPlaybackMode = ModeFactory.get(mode);
    this.playerState = PlayerState.STOPPED;
  }

  void playNextSong() {
    Song nextSong = currentPlaybackMode.getNextSong(currentPlaylist);
    if (nextSong != null) {
      play(nextSong);
    } else {
      System.out.println("No songs available to play.");
    }
  }

  void changeMode(Modes mode) {
    currentPlaybackMode = ModeFactory.get(mode);
  }

  void play(Song song) {
    int index = currentPlaylist.getIndexOfSong(song);
    if (index >= 0) {
      currentPlaylist.play(index);
      playerState = PlayerState.PLAYING;
      System.out.println("Playing: " + song.getName());
    } else {
      System.out.println("Song not found in playlist.");
    }
  }

  void pause() {
    playerState = PlayerState.PAUSED;
  }

  void stop() {
    playerState = PlayerState.STOPPED;
  }
}
