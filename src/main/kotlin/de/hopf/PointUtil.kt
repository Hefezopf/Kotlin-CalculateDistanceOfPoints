package de.hopf

import java.text.NumberFormat
import java.util.*
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

    fun determineDistance(p1: Point, p2: Point): Double {
        return sqrt((p2.x - p1.x).toDouble().pow(2.0) + (p2.y - p1.y).toDouble().pow(2.0))
    }

    fun determineMaximumOfArray(points: Array<Point>): Double {
        require(points.isNotEmpty()) { "too less points" }
        var max = Double.NEGATIVE_INFINITY
        for (i in points.indices) {
            val startPoint = points[i]
            max = calculateMaximum(points, startPoint, max, i)
        }

        return limitValue(max, 2)
    }

    fun determineMinimumOfArray(points: Array<Point>): Double {
        require(points.isNotEmpty()) { "too less points" }
        var min = Double.POSITIVE_INFINITY
        for (i in points.indices) {
            val startPoint = points[i]
            min = calculateMinimum(points, startPoint, min, i)
        }

        return limitValue(min, 2)
    }

    private fun limitValue(value: Double, digits: Int): Double {
        var erg = 0.0
        var nf = NumberFormat.getInstance(Locale.ENGLISH)
        nf.minimumFractionDigits = digits
        nf.maximumFractionDigits = digits
        try {
            var s = nf.format(value)
            erg = s.toDouble()
        } catch (e: NumberFormatException) {
            e.printStackTrace()
        }
        return erg
    }

    private fun calculateMaximum(points: Array<Point>, startPoint: Point, maximum: Double, startVal: Int): Double {
        var max = maximum
        for (i in startVal + 1 until points.size) {
            val maxTemp = determineDistance(startPoint, points[i])
            if (maxTemp > max) {
                max = maxTemp
            }
        }

        return max
    }

    private fun calculateMinimum(points: Array<Point>, startPoint: Point, minimum: Double, startVal: Int): Double {
        var min = minimum
        for (i in startVal + 1 until points.size) {
            val minTemp = determineDistance(startPoint, points[i])
            if (minTemp < min) {
                min = minTemp
            }
        }

        return min
    }
}
