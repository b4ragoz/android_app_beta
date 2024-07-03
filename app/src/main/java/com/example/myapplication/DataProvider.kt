package com.example.myapplication

import com.example.myapplication.R

object DataProvider {
    val heroes = listOf(
        Hero("Deadpool", R.drawable.deadpool, R.drawable.deadpool_detail, "Please don’t make the super suit green...or animated!"),
        Hero("Iron Man", R.drawable.ironman, R.drawable.ironman_detail, "I AM IRON MAN"),
        Hero("Spider-Man", R.drawable.spiderman, R.drawable.spiderman_detail, "In iron suit")
    )
}
