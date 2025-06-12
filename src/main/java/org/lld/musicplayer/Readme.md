# Carvaan Music Player App

A simple music player application inspired by Carvaan that allows users to create and manage playlists with different playback modes.

## Features

* Create and manage multiple playlists.
* Add multiple songs to each playlist.
* Playback modes:

  * **Sequential:** Plays songs in order.
  * **Loop:** Repeats the current song.
  * **Shuffle:** Plays random unplayed songs, then repeats played songs.
* Basic playback controls: Play, Pause, Stop, Next.

## Technologies Used

* Java (Core)
* Object-Oriented Design principles

## Getting Started

### Prerequisites

* Java JDK 11 or above
* Maven or your preferred build tool (if applicable)

### Running the App

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/carvaan-music-player.git
   ```
2. Build the project:

   ```bash
   mvn clean install
   ```
3. Run the main class (e.g., `MusicPlayerApp`):

   ```bash
   java -jar target/carvaan-music-player.jar
   ```

## Usage

* Create playlists.
* Add songs to playlists.
* Select playback mode.
* Use playback controls to play music.

## Code Structure

* `PlaybackMode` interface defines playback behavior.
* Implementations: `SequentialPlaybackMode`, `LoopPlaybackMode`, `ShufflePlaybackMode`.
* `Playlist` class to hold songs.
* `MusicPlayer` class to manage playback and user interactions.


## Contributing

Feel free to fork and submit pull requests. For major changes, please open an issue first.

