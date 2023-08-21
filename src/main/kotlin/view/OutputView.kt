package view

import constant.INPUT_CAR_NAME_MESSAGE
import constant.TRY_GAME_COUNT_MESSAGE

class OutputView {
    fun printInputCarName(){
        println(INPUT_CAR_NAME_MESSAGE)
    }

    fun printExceptionMessage(message : String){
        println(message)
    }

    fun printTryNumber(){
        println(TRY_GAME_COUNT_MESSAGE)
    }
}