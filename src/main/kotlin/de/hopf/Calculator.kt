@file:JvmName("App")

package de.hopf

import java.util.ArrayList

class Calculator {
}

fun main(args: Array<String>) {
    println("Start App...")

    var points = if (args.isNotEmpty()) {
        PointUtil().parseAllCoords(args);
    } else {
        val pointsList: MutableList<Point> = ArrayList()
        pointsList.add(Point(1, 1));
        pointsList.add(Point(1, 3));
        pointsList.add(Point(4, 4));
        pointsList.add(Point(6, 1));
        pointsList.toTypedArray()
    }

    val minDistanceOfArray = PointUtil().determineMinimumOfArray(points)
    println("Minimum distance of all points = $minDistanceOfArray")
    val maxDistanceOfArray = PointUtil().determineMaximumOfArray(points)
    println("Maximum distance of all points = $maxDistanceOfArray")
}
