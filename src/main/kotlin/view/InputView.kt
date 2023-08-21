package view

class InputView {
    fun inputCarName(): List<String>? {
        return readlnOrNull()?.split(",")
    }

    fun inputTryNumber(): String?{
        return readlnOrNull()
    }

}