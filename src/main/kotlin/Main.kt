import controller.Controller
import view.InputView
import view.OutputView

fun main(args: Array<String>) {
    val inputView = InputView()
    val outputView = OutputView()
    val controller = Controller(inputView, outputView)

    controller.start()
}