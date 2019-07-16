package com.makentoshe.profiling

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    /** Can cause a calculations problem */
    private val cpuProblem = CpuProblem()

    /** Can cause a memory problem */
    private val memoryProblem = MemoryProblem(this)

    private val presenter = MainActivityPresenter(cpuProblem, memoryProblem)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // create view
        MainActivityUi().createView(this).apply(::setContentView)

        val cpuProblemButton = findViewById<Button>(R.id.cpu_problem)
        presenter.bindCpuProblemButton(cpuProblemButton)

        val memProblemButton = findViewById<Button>(R.id.mem_problem)
        presenter.bindMemProblemButton(memProblemButton)
    }

}
