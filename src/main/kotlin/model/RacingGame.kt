package model

class RacingGame(private val cars: List<String>?) {

    private val carList : MutableList<CarDto> = mutableListOf()

    init{
        makeCarList()
    }

    private fun makeCarList(){
        if (cars != null) {
            for (car in cars){
                val carDto = CarDto(car, 0)
                carList.add(carDto)
            }
        }
    }

    fun playGame(){
        move()
    }

    fun getCarList() : List<CarDto>{
        return carList
    }

    fun getWinner() : MutableList<String>{
        val winnerList = mutableListOf<String>()
        val maxPosition = findMaxPosition()

        for (car in carList){
            if (car.position == maxPosition){
                winnerList.add(car.name)
            }
        }

        return winnerList
    }

    private fun move(){
        for (car in carList){
            if (checkCanMove()){
                car.position++
            }
        }
    }

    private fun checkCanMove() : Boolean{
        val randomNum = Random().makeRandomNumber()

        return randomNum > 4
    }

    private fun findMaxPosition() : Int{
        var max = 0

        for (car in carList){
            max = Math.max(car.position, max)
        }

        return max
    }

}