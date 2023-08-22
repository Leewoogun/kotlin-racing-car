package model

private const val MINIMUM = 0
private const val MAXIMUM = 9
class Random {
    fun makeRandomNumber() : Int{
        return (MINIMUM..MAXIMUM).random()
    }
}