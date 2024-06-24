import kotlin.test.Test
import kotlin.test.assertEquals

class MusicLibraryTest {
    private val library = MusicLibrary()

    @Test
    fun testGetTrackReturnsTrack() {
        library.addTrack("Big City Life",  "Luude, Mattafix", 146)
        assertEquals("Big City Life", library.getTrack(0).title)
    }

    @Test
    fun testGetTracksReturnsTracks() {
        library.addTrack("Big City Life",  "Luude, Mattafix", 146)
        library.addTrack("Baiana", "Bakermat", 180)
        assertEquals(2, library.getTracks().size)
    }
}