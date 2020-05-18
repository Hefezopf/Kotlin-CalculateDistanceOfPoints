package de.hopf

import kotlin.math.pow
import kotlin.math.sqrt

data class Point (var x: Int, var y: Int) {
}

fun determineMinimum(p1: Point, p2: Point): Double {
    return sqrt((p2.x - p1.x).toDouble().pow(2.0) + (p2.y - p1.y).toDouble().pow(2.0))
}

fun determineMinimumOfArray(points: Array<Point>): Double {
    require(points.isNotEmpty()) { "too less points" }
    var min = Double.POSITIVE_INFINITY
    for (i in points.indices) {
        val startPoint = points[i]
        min = calculate(points, startPoint, min, i)
    }
    return min
}

private fun calculate(points: Array<Point>, startPoint: Point, minimum: Double, startVal: Int): Double {
    var min = minimum
    for (i in startVal + 1 until points.size) {
        val minTemp = determineMinimum(startPoint, points[i])
        if (minTemp < min) {
            min = minTemp
        }
    }
    return min
}