class MusicLibrary {

    private val tracks: ArrayList<Track> = arrayListOf()

    fun addTrack(title: String, artist: String, duration: Int) {
        tracks.add(Track(title, artist, duration))
    }

    fun getTrack(index: Int): Track {
        return tracks[index]
    }

    fun getTracks(): ArrayList<Track> {
        return tracks
    }
}