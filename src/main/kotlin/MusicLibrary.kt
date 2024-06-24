class MusicLibrary {

    private val tracks: ArrayList<Track> = arrayListOf()

    fun addTrack(title: String) {
        tracks.add(Track(title))
    }

    fun getTrack(index: Int): Track {
        return tracks[index]
    }
}