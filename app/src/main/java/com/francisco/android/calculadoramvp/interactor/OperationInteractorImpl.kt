package com.francisco.android.calculadoramvp.interactor

import com.francisco.android.calculadoramvp.interfaces.OperationInteractor
import com.francisco.android.calculadoramvp.interfaces.OperationPresenter
//Constructor primario s establece o no con la palabra reservada constructor
class OperationInteractorImpl constructor (operationPresenter: OperationPresenter) : OperationInteractor {

    private var result : Int = 0
    private var presenter : OperationPresenter

    //Constructor en sus forma expadida
    init {
        this. presenter = operationPresenter
    }

    override fun add(num1: Int, num2: Int) {
        result = num1 + num2
        presenter.showResult(result.toString())
    }

    override fun subtrac(num1: Int, num2: Int) {
        result = num1 - num2
        presenter.showResult(result.toString())
    }

    override fun multiply(num1: Int, num2: Int) {
        result = num1  * num2
        presenter.showResult(result.toString())
    }

    override fun divide(num1: Int, num2: Int) {
        result = num1 / num2
        presenter.showResult((result.toString()))
    }

}