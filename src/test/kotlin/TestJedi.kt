import org.junit.Assert
import org.junit.Test

class TestJedi {
    @Test
    fun `Jedi testing`() {
        val Obi_WanKenobi = Jedi()
        val Yoda = Jedi()

        Assert.assertEquals(Obi_WanKenobi, Yoda)
        Assert.assertNotSame(Obi_WanKenobi, Yoda)
    }
}