import kotlin.test.Test
import kotlin.test.assertEquals

class MusicLibraryTest {
    private val library = MusicLibrary()

    @Test
    fun testAddTrackAddsTrack() {
        library.addTrack("Voices - Elkka")
        assertEquals("Voices - Elkka", library.getTrack(0).title)
    }
}