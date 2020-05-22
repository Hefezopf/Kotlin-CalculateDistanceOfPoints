@file:JvmName("CalculatorApp")

package de.hopf

class Calculator {
}

fun main(args: Array<String>) {
    println("Start App...")

    var points = arrayOf<Point>()
    //val argsArray = arrayOf<String>("(1,9)", "(1,1)")
    if (args.isNotEmpty()) {
        points = parseAllCoords(args);
    } else {
        var pointsFixed = arrayOf<Point>()
        pointsFixed[0] = Point(1, 1);
        pointsFixed[1] = Point(1, 3);
        pointsFixed[2] = Point(4, 4);
        pointsFixed[3] = Point(6, 1);
        points = pointsFixed;
    }

    val minDistanceOfArray = determineMinimumOfArray(points)
    println("Minimum distance of all points = $minDistanceOfArray")
}
