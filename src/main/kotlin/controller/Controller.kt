package controller

import exception.InputException
import exception.TryNumberException
import view.InputView
import view.OutputView
import kotlin.IllegalArgumentException

class Controller(private val inputView : InputView, val outputView : OutputView) {
    private lateinit var inputException: InputException
    private lateinit var tryNumberException : TryNumberException
    fun start(){
        inputCarName()
        inputTryNumber()
    }

    private fun inputCarName() : List<String>?{
        outputView.printInputCarName()

        while (true){
            try {
                val cars = inputView.inputCarName()
                inputException = InputException(cars)
                return cars
            } catch (e: NumberFormatException){
                outputView.printExceptionMessage(e.message.toString()) // String? -> String으로 변환
            }
        }
    }

    private fun inputTryNumber() : Int{
        outputView.printTryNumber()

        while (true){
            try {
                val tryNumber = inputView.inputTryNumber()
                tryNumberException = TryNumberException(tryNumber)
                return tryNumber!!.toInt()
            } catch (e: IllegalArgumentException){
                outputView.printExceptionMessage(e.message.toString())
            }
        }
    }

    private fun gameResult(){

    }

    private fun winner(){

    }
}