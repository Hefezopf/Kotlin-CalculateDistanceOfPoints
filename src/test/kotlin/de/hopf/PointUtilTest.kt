package de.hopf

import org.junit.Test
import kotlin.test.assertEquals

class PointUtilTest {

    val pA = Point(1, 1)
    val pB = Point(1, 3)
    val pC = Point(4, 4)
    val pD = Point(6, 1)

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

        val res = PointUtil().parseToCoord(coords)

        assertEquals(2, res.size)
        assertEquals(4, res.get(0))
        assertEquals(3, res.get(1))
    }

    @Test
    fun testParseToCoord2() {
        val coords = "(4 3)"

        val res = PointUtil().parseToCoord(coords)

        assertEquals(2, res.size)
        assertEquals(4, res.get(0))
        assertEquals(3, res.get(1))
    }

    @Test
    fun testDetermineDistance1() {
        var distance = PointUtil().determineDistance(pA, pB)

        assertEquals(2.0, distance)
    }

    @Test
    fun testDetermineDistance2() {
        var distance = PointUtil().determineDistance(pA, pC)

        assertEquals(4.242640687119285, distance)
    }

    @Test
    fun testDetermineMaximumOfArray1() {
        val points: Array<Point> = arrayOf<Point>(pA, pB, pC)

        var maxDistance = PointUtil().determineMaximumOfArray(points)

        assertEquals(4.242640687119285, maxDistance)
    }

    @Test
    fun testDetermineMaximumOfArray2() {
        val points: Array<Point> = arrayOf<Point>(pA, pB, pC, pD)

        var maxDistance = PointUtil().determineMaximumOfArray(points)

        assertEquals(5.385164807134504, maxDistance)
    }

    @Test
    fun testDetermineMaximumOfArray3() {
        val points: Array<Point> = arrayOf<Point>(pA, pC, pD)

        var maxDistance = PointUtil().determineMaximumOfArray(points)

        assertEquals(5.0, maxDistance)
    }

    @Test
    fun testDetermineMinimumOfArray1() {
        val points: Array<Point> = arrayOf<Point>(pA, pC, pD)

        var minDistance = PointUtil().determineMinimumOfArray(points)

        assertEquals(3.605551275463989, minDistance)
    }

    @Test
    fun testDetermineMinimumOfArray2() {
        val points: Array<Point> = arrayOf<Point>(pA, pB, pC, pD)

        var minDistance = PointUtil().determineMinimumOfArray(points)

        assertEquals(2.0, minDistance)
    }
}
