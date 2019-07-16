package com.makentoshe.profiling

import android.content.Context
import android.widget.Button
import android.widget.LinearLayout

class MainActivityUi {

    fun createView(context: Context) = LinearLayout(context).apply {
        orientation = LinearLayout.VERTICAL

        Button(context).apply { id = R.id.cpu_problem }.apply(::addView)

        Button(context).apply { id = R.id.mem_problem }.apply(::addView)

    }
}