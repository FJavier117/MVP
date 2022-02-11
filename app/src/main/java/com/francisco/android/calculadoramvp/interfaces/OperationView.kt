package com.francisco.android.calculadoramvp.interfaces

interface OperationView {
    fun showResult(result : String)
    fun invalidOperation()
}