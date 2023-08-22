package view

import constant.GAME_RESULT_MESSAGE
import constant.INPUT_CAR_NAME_MESSAGE
import constant.TRY_GAME_COUNT_MESSAGE
import constant.WINNER_MESSAGE
import model.CarDto

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

    fun printGameResultMessage(){
        println(GAME_RESULT_MESSAGE)
    }

    fun printGame(carList: List<CarDto>){
        for (car in carList){
            println(car.name + " : " + "-".repeat(car.position))
        }
        println()
    }

    fun printWinner(winnerList : List<String>){
        println(winnerList.joinToString(",") + WINNER_MESSAGE)
    }
}