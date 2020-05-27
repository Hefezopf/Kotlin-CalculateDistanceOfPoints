package de.hopf

import java.util.ArrayList
import kotlin.math.pow
import kotlin.math.sqrt

class PointUtil() {
    fun parseAllCoords(allCoords: Array<String>): Array<Point> {
        val pointsList: MutableList<Point> = ArrayList()
        for (coord in allCoords) { // "(4,3)", "(5,2)", ...
            val xy: IntArray = parseToCoord(coord)
            pointsList.add(Point(xy[0], xy[1]))
        }

        return pointsList.toTypedArray()
    }

    fun parseToCoord(coord: String): IntArray {
        var xy: List<String> = coord.replace(Regex("[^\\w\\d]"), "").split("")
        val res: IntArray = IntArray(2)
        res[0] = xy[1].toInt()
        res[1] = xy[2].toInt()

        return res
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
}
