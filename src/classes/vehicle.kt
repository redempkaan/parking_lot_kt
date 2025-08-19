package vehicle

abstract class Vehicle(val plate: String, val height: Int, val width: Int, val fuelType: String, val importTime: Int){

    fun getPlate() = println("Plate: $plate")
    fun getHeight() = println("Height: $height")
    fun getWidth() = println("Width: $width")
    fun getFuelType() = println("Fuel: $fuelType")
    fun getEntryTime() = println("Entry time: $importTime")

    abstract fun driveInside()
    abstract fun driveOutside()

}

class Car(plate: String, height: Int, width: Int, fuelType: String, importTime: Int) : Vehicle(plate, height, width, fuelType, importTime){
    override fun driveInside() = println("Car $plate going inside")
    override fun driveOutside() = println("Car $plate going outside")

}