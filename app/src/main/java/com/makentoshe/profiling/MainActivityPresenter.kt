package com.makentoshe.profiling

import android.widget.Button

class MainActivityPresenter(private val cpuProblem: Problem, private val memProblem: Problem) {

    fun bindCpuProblemButton(view: Button) {
        view.setOnClickListener { cpuProblem.launch() }
    }

    fun bindMemProblemButton(view: Button) {
        view.setOnClickListener { memProblem.launch() }
    }
}