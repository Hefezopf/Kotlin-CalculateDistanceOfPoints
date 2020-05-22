@file:JvmName("CalculatorApp")

package de.hopf

class Calculator {
}

fun main(args: Array<String>) {
    println("Start App...")
    val pA = Point(1, 1)
    val pB = Point(1, 3)
    val pC = Point(4, 4)
    val pD = Point(6, 1)
    val points = arrayOf(pA, pB, pC, pD)
    val minDistanceOfArray = determineMinimumOfArray(points)
    println("Minimum distance of all points = $minDistanceOfArray")
}
