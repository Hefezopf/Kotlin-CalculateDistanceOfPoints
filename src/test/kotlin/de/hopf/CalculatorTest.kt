package de.hopf

import org.junit.Test
import kotlin.test.assertEquals

class CalculatorTest {
    @Test
    fun testDetermineMinimum() {
        val pA = Point(1, 4)
        val pB = Point(2, 3)
        var minDistance = determineMinimum(pA, pB)
        var minDistanceExp = 1.4142135623730951
        assertEquals(minDistanceExp, minDistance)
        assertEquals("Kotlin", "Kotlin")
    }

    @Test
    fun testDetermineMinimumOfArray1() {
        val pA = Point(1, 1)
        val pB = Point(4, 4)
        val pC = Point(6, 1)
        val points: Array<Point> = arrayOf<Point>(pA, pB, pC)
        var minDistance = determineMinimumOfArray(points)
        var minDistanceExp = 3.605551275463989
        assertEquals(minDistanceExp, minDistance)
    }

    @Test
    fun testDetermineMinimumOfArray2() {
        val pA = Point(1, 1)
        val pB = Point(1, 3)
        val pC = Point(4, 4)
        val pD = Point(6, 1)
        val points: Array<Point> = arrayOf<Point>(pA, pB, pC, pD)
        var minDistance = determineMinimumOfArray(points)
        var minDistanceExp = 2.0
        assertEquals(minDistanceExp, minDistance)
    }
}