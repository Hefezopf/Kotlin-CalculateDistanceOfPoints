package de.hopf

import java.util.ArrayList

class PointUtil() {
    fun parseAllCoords(allCoords: Array<String>): Array<Point> {
        val pointsList: MutableList<Point> = ArrayList()
        for (coord in allCoords) { // "(4,3)", "(5,2)", ...
            val xy: IntArray = parseToCoord(coord)
            pointsList.add(Point(xy[0], xy[1]))
        }

        return pointsList.toTypedArray()
    }
}
