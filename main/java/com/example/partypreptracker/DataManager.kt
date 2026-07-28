package com.example.partypreptracker

import android.R

object DataManager {

    val itemNames=ArrayList<String>()
    val categories=ArrayList<String>()
    val quantities+ArrayList<Int>()
    Val comments=ArrayList<String>()

    init{
        sample data
        itemNames.add("Paper cups")
        categories.add("supplies")
        quantities.add(50)
        comments.add("Red ones for the theme")

        itemNames.add("Soda Bottles")
        categories.add("Beverages")
        quantites.add(10)
        comments.add("Mix of Cola and Orange")

        itemNames.add("Potato chips")
        categories.add("Snacks")
        quantities.add(5)
        comments.add("Large bags only")
}
    fun addItem(
        name: R.String,
        category: R.String,
        quantity:Int,
        comment:String
    ) {

        itemNames.add(name)
        categories.add(category)
        quantities.add(quantity)
        comments.add(comment)
    }
    fun getTotalItem():Int {

        var total = 0

        for (qty in quantities) {

            total += qty
        }
        return total
    }


