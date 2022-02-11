package com.francisco.android.calculadoramvp.interfaces

interface OperationPresenter {
    fun showResult(result : String)
    fun invalidOperation()
    fun add(num1 : Int, num2 : Int)
    fun subtrac(num1 : Int, num2 : Int)
    fun multiply(num1 : Int, num2 : Int)
    fun divide(num1 : Int, num2 : Int)
}