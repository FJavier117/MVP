package com.francisco.android.calculadoramvp.presenters

import com.francisco.android.calculadoramvp.interactor.OperationInteractorImpl
import com.francisco.android.calculadoramvp.interfaces.OperationInteractor
import com.francisco.android.calculadoramvp.interfaces.OperationPresenter
import com.francisco.android.calculadoramvp.interfaces.OperationView

class OperationPresenterImpl constructor(view:OperationView) : OperationPresenter {

    private var view: OperationView
    private var interactor: OperationInteractor

    init {
        this.view = view
        this.interactor = OperationInteractorImpl(this)
    }
    override fun showResult(result: String) {
        view.showResult(result)
    }

    override fun invalidOperation() {
        view.invalidOperation()
    }

    override fun add(num1: Int, num2: Int) {
        interactor.add(num1,num2)
    }

    override fun subtrac(num1: Int, num2: Int) {
        interactor.subtrac(num1,num2)
    }

    override fun multiply(num1: Int, num2: Int) {
        interactor.multiply(num1,num2)
    }

    override fun divide(num1: Int, num2: Int) {
        interactor.divide(num1,num2)
    }
}