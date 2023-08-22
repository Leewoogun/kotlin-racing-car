package controller

import exception.InputException
import exception.TryNumberException
import model.RacingGame
import model.Random
import view.InputView
import view.OutputView
import kotlin.IllegalArgumentException

class Controller(private val inputView : InputView, val outputView : OutputView) {
    private lateinit var inputException: InputException
    private lateinit var tryNumberException : TryNumberException
    private lateinit var racingGame: RacingGame

    fun run(){
        val cars = inputCarName()
        var tryNumber = inputTryNumber()
        gameResult(cars, tryNumber)
        winner()
    }

    private fun inputCarName() : List<String>?{
        outputView.printInputCarName()

        while (true){
            try {
                val cars = inputView.inputCarName()
                inputException = InputException(cars)
                return cars
            } catch (e: IllegalArgumentException){
                outputView.printExceptionMessage(e.message.toString()) // String? -> String으로 변환
            }
        }
    }

    private fun inputTryNumber() : Int{
        outputView.printTryNumber()

        while (true){
            try {
                var tryNumber = inputView.inputTryNumber()
                tryNumberException = TryNumberException(tryNumber)
                return tryNumber!!.toInt()
            } catch (e: IllegalArgumentException){
                outputView.printExceptionMessage(e.message.toString())
            }
        }
    }

    private fun gameResult(cars: List<String>?, tryNumber: Int){
        outputView.printGameResultMessage()
        racingGame = RacingGame(cars)

        var tryGame = tryNumber

        while (tryGame > 0){
            racingGame.playGame()
            outputView.printGame(racingGame.getCarList())
            tryGame--
        }
    }

    private fun winner(){
        val winners = racingGame.getWinner()
        outputView.printWinner(winners)
    }
}