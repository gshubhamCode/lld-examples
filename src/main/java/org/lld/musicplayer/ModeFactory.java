package org.lld.musicplayer;

public class ModeFactory {

  public static PlaybackMode get(Modes mode) {
    return switch (mode){
      case Shuffle -> new ShufflePlaybackMode();
      case Loop -> new LoopPlaybackMode();
      case Sequential -> new SequentialPlaybackMode();
      default -> throw new IllegalArgumentException("Invalid mode");
    };
  }
}
