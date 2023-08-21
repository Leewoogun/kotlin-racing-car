package controller

import exception.InputException
import view.InputView
import view.OutputView
import kotlin.IllegalArgumentException

class Controller(private val inputView : InputView, val outputView : OutputView) {
    private lateinit var inputException: InputException
    fun start(){
        inputCarName()
    }

    private fun inputCarName(){
        outputView.printInputCarName()
        var flag = false

        while (!flag){
            try {
                val cars = inputView.inputCarName()
                inputException = InputException(cars)
                flag = true
            } catch (e: IllegalArgumentException){
                outputView.printExceptionMessage(e.message.toString()) // String? -> String으로 변환
            }
        }
    }

    private fun inputTryNumber(){

    }

    private fun gameResult(){

    }

    private fun winner(){

    }
}