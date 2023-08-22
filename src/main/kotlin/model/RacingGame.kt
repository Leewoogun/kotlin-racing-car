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

}