package com.makentoshe.profiling

import android.content.Context
import android.view.View

class MemoryProblem(private val context: Context) : Problem {

    private val list = ArrayList<View>()

    override fun launch() {
        while (true) list.add(View(context))
    }
}