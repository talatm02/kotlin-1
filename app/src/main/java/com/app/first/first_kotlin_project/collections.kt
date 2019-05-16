package com.app.first.first_kotlin_project

import android.util.Log
import android.view.View

/**
 * Major Difference between List and Array.
 * Array<T> is a class with known implementation but List<T> and MutableList<T> are interfaces which have different implementations
 * Array<T> is mutable (it can be changed through any reference to it), but List<T> doesn't have modifying methods
 * Arrays have fixed size and cannot expand or shrink retaining identity (you need to copy an array to resize it). As to the lists, MutableList<T> has add and remove functions, so that it can increase and reduce its size.

 * UseCase:
 * We can use List where values of list is not required to change, Example list of Weekdays
 * Array can be use where values of the array can modify, Example Array of Status of Available seats in Plan

 */

fun collectionAction(view: View) {
    val weekDays = listOf<String>("Saturday", "Sunday", "Monday", "Tuesday", "Wedensday", "Thursday")
    Log.d("MainActivity",weekDays.get(2))

    // available seats in plan
    var availableSeats = booleanArrayOf(true, false, true, true, false, false, true, true)
    // updating the seat 2 not available(false) to available(true)
    availableSeats[1] = true

    Log.d("MainActivity",availableSeats[1].toString())
}