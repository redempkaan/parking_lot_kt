package vehicle

abstract class Vehicle(val plate: String, val height: Int, val width: Int, val fuel_type: String, val import_time: Int){

    fun getPlate() = println("Plate: $plate")
    fun getHeight() = println("Height: $height")
    fun getWidth() = println("Width: $width")
    fun getFuelType() = println("Fuel: $fuel_type")
    fun getEntryTime() = println("Entry time: $import_time")

    abstract fun driveInside()
    abstract fun driveOutside()

}

class Car(plate: String, height: Int, width: Int, fuel_type: String, import_time: Int) : Vehicle(plate, height, width, fuel_type, import_time){
    override fun driveInside() = println("Car $plate going inside")
    override fun driveOutside() = println("Car $plate going outside")

}