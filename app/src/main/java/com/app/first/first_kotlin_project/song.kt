package com.app.first.first_kotlin_project

import android.util.Log

/**
 * Created by medasmac1 on 5/13/19.
 */

// title of the song
val title:String = "Pehla Nasha"
// artist of the song
val artist:String = "Udit Narayan"
// length of the song
val duration:Double = 5.02
//Album name
val album:String = "JJWS"
val genre:String = "Romentic"
val noOfSongs:Int = 5
val released:Int = 2018

fun logVariable(){
    Log.d("MainActivity", "title: " + title)
    Log.d("MainActivity", "artist: " + artist)
    Log.d("MainActivity", "duration: " + duration)
    Log.d("MainActivity", "album: " + album)
    Log.d("MainActivity", "genre: " + genre)
    Log.d("MainActivity", "noOfSongs: " + noOfSongs)
    Log.d("MainActivity", "released: " + released)

}
