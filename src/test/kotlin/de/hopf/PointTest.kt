package de.hopf

import de.hopf.Point
import org.junit.Test
import kotlin.test.assertEquals

class PointTest {

    @Test
    fun testPoint() {
        val p1 = Point(1, 4)

        assertEquals(1, p1.x)
        assertEquals(4, p1.y)
    }

    @Test
    fun testDetermineMinimum() {
        val pA = Point(1, 4)
        val pB = Point(2, 3)

        var minDistance = determineMinimum(pA, pB)

        assertEquals(1.4142135623730951, minDistance)
    }

    @Test
    fun testDetermineMinimumOfArray1() {
        val pA = Point(1, 1)
        val pB = Point(4, 4)
        val pC = Point(6, 1)
        val points: Array<Point> = arrayOf<Point>(pA, pB, pC)

        var minDistance = determineMinimumOfArray(points)

        assertEquals(3.605551275463989, minDistance)
    }

    @Test
    fun testDetermineMinimumOfArray2() {
        val pA = Point(1, 1)
        val pB = Point(1, 3)
        val pC = Point(4, 4)
        val pD = Point(6, 1)
        val points: Array<Point> = arrayOf<Point>(pA, pB, pC, pD)

        var minDistance = determineMinimumOfArray(points)

        assertEquals(2.0, minDistance)
    }
}
