package test.kotlin.de.hopf

import de.hopf.Point
import de.hopf.determineMinimum
import org.junit.Test
import kotlin.test.assertEquals

class CalculatorTest {
    @Test
    fun testCalculator() {
        val p1 = Point(1, 4)
        val p2 = Point(2, 3)
        var minDistance = determineMinimum(p1, p2)
        var minDistanceExp = 1.4142135623730951
        assertEquals(minDistanceExp, minDistance)
        assertEquals("XKotlin", "Kotlin")
    }
}