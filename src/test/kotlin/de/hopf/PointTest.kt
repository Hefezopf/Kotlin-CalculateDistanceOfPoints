package test.kotlin.de.hopf

import main.kotlin.de.hopf.Point
import org.junit.Test
import kotlin.test.assertEquals

class PointTest {
    @Test
    fun testPoint() {
        val p1 = Point(1, 4)
        assertEquals("Kotlin", "Kotlin")
        assertEquals(1, p1.x)
        assertEquals(4, p1.y)
    }
}