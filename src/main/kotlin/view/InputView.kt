package view

class InputView {
    fun inputCarName(): List<String>? {
        return readlnOrNull()?.split(",")
    }

}