package view

import constant.INPUT_CAR_NAME_MESSAGE
import constant.NAME_LENGTH_EXCEPTION_MESSAGE

class OutputView {
    fun printInputCarName(){
        println(INPUT_CAR_NAME_MESSAGE)
    }

    fun printExceptionMessage(message : String){
        println(message)
    }
}