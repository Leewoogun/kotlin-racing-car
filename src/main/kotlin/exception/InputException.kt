package exception

import constant.NAME_LENGTH_EXCEPTION_MESSAGE
import constant.NULL_EXCEPTION_MESSAGE

class InputException(val cars: List<String>?) : Exception(){

    init {
        checkInputException()
    }

    private fun checkInputException(){
        checkNameNull()
        checkCarLengthCOMMA()
    }
    private fun checkNameNull(){
        cars?.let{
            for (car in cars){
                if (car.isNullOrEmpty()){
                    throw IllegalArgumentException(NULL_EXCEPTION_MESSAGE)
                }
            }
        }
    }

    private fun checkCarLengthCOMMA() {
        cars?.let{
            for (car in cars){
                checkNameLength(car)
            }
        }
    }

    private fun checkNameLength(car: String) {
        if (car.length > 5) {
            throw IllegalArgumentException(NAME_LENGTH_EXCEPTION_MESSAGE)
        }
    }
}