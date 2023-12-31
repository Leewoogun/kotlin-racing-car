package exception

import constant.NAME_DUPLICATION_EXCEPTION_MESSAGE
import constant.NAME_LENGTH_EXCEPTION_MESSAGE
import constant.NULL_EXCEPTION_MESSAGE

class InputException(private val cars: List<String>?) : Exception(){

    init {
        checkInputException()
    }

    private fun checkInputException(){
        checkNameNull()
        checkCarLengthCOMMA()
        checkNameDuplicate()
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

    private fun checkNameDuplicate(){
        val carSet : Set<String> = cars!!.toSet()

        if (carSet.size != cars.size){
            throw IllegalArgumentException(NAME_DUPLICATION_EXCEPTION_MESSAGE)
        }
    }

    private fun checkNameLength(car: String) {
        if (car.length > 5) {
            throw IllegalArgumentException(NAME_LENGTH_EXCEPTION_MESSAGE)
        }
    }
}