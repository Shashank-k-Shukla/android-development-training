package com.example.androiddevelopmenttraining.kotlin_training


// To create Array
fun createArray(){
    val array = arrayOf("abc","hello",5,9,"jio")
    val arr1 : Array<Int> = Array(3){0}
    val arr2 : Array<Int?> = arrayOfNulls(5)
    val arr3  = arrayOfNulls<Int>(5)
    val arr4  = emptyArray<Int>()
    arr2[4] = 5

    val arr5 = Array(3) { Array (2) {0} }
    arr5[2][0] = 10

    println(arr5[1][0])

    val arr6 = Array(3) { Array (2) { Array (1){0} } }
    arr6[2][0][0] = 10
    println(arr6[2][0][0])
}

fun createPair(){
    val (a, b) = Pair("5",2)
    val pair : Pair<String, Int> = Pair("hello", 5)
    println(pair.second)
    println(pair.first)
    println(a)
    println(b)
    val pair1 = pairReturn()
    println(pair1.first)

    val first = pairReturn();
    println(first.second.second.second)
}

// multi pair
fun pairReturn() : Pair<String, Pair<Int, Pair<Int, Int>>>{
    return Pair("world", Pair(2, Pair(3,9)))
}

fun createTriple(){
    val triple = Triple<String, Int, String>("hello", 1, "world")
    println(triple.first)
    println(triple.second)
    println(triple.third)
    val triple1 = Triple("hello", 1, "world")
    println(triple1.first)
    println(triple1.second)
    println(triple1.third)

    val triple3 = returnTriple()
    println(triple3.first)
    println(triple3.second.second)
    println(triple3.third.second)

}

fun returnTriple() : Triple<String, Pair<Int, String>, Triple<Int, Int, String>>{
    return Triple("Hello", Pair(5, "pair"), Triple(3,5, "world"))
}