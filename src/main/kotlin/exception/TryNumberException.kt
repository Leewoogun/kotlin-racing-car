package exception

import constant.NOT_NUMBER_MESSAGE
import constant.NULL_EXCEPTION_MESSAGE

class TryNumberException(val tryNumber : String?) {
    init{
        checkTryNumber()
    }

    private fun checkTryNumber(){
        checkNumberNull()
        checkIsNumber()
    }

    private fun checkNumberNull(){
        if (tryNumber.isNullOrBlank()){
            throw NumberFormatException(NULL_EXCEPTION_MESSAGE)
        }
    }


    private fun checkIsNumber(){
        if (tryNumber?.toIntOrNull() == null){
            throw NumberFormatException(NOT_NUMBER_MESSAGE)
        }
    }
}