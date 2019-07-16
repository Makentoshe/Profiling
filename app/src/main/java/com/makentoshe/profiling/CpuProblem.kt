package com.makentoshe.profiling

/** Performs cpu calculations */
class CpuProblem : Problem {

    override fun launch() {
        f(10000)
    }

    private fun f(n: Int): Int {
        return when (n) {
            0, 1 -> n
            else -> f(n - 1) + f(n - 2)
        }
    }
}