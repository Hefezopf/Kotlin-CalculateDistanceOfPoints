package de.hopf

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
    fun testParseAllCoords() {
        val coords = arrayOf<String>("(4,3)", "(5,2)", "(1,1)", "(1,2)")

        val res = PointUtil().parseAllCoords(coords)

        assertEquals(4, res.size)
        assertEquals(4, res[0].x)
        assertEquals(3, res[0].y)
        assertEquals(5, res[1].x)
        assertEquals(2, res[1].y)
        assertEquals(1, res[2].x)
        assertEquals(1, res[2].y)
        assertEquals(1, res[3].x)
        assertEquals(2, res[3].y)
    }

    @Test
    fun testParseToCoord1() {
        val coords = "(4,3)"

        val res = parseToCoord(coords)

        assertEquals(2, res.size)
        assertEquals(4, res.get(0))
        assertEquals(3, res.get(1))
    }

    @Test
    fun testParseToCoord2() {
        val coords = "(4 3)"

        val res = parseToCoord(coords)

        assertEquals(2, res.size)
        assertEquals(4, res.get(0))
        assertEquals(3, res.get(1))
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
