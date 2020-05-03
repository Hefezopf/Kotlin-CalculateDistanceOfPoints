package org

class Calculator {
}

fun main(args: Array<String>) {
    println("Start!!!!!!")
    val p1 = Point(1, 4)
    val p2 = Point(2, 3)
    val p3 = Point(3, 2)
    val p4 = Point(4, 1)
    val points = arrayOf(p1, p2, p3, p4)
    val minDistance = determineMinimum(p1, p2)
    println("Distance:$minDistance")
    val minDistanceOfArray = determineMinimumOfArray(points)
    println("Distance of Array:$minDistanceOfArray")
}
