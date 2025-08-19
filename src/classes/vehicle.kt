package vehicle

abstract class Vehicle(val plate: String, val importTime: Int){

    fun getPlate() = println("Plate: $plate")
    fun getEntryTime() = println("Entry time: $importTime")

    abstract fun driveInside()
    abstract fun driveOutside()

}

class Car(plate: String, importTime: Int) : Vehicle(plate, importTime){
    override fun driveInside() = println("Car $plate going inside")
    override fun driveOutside() = println("Car $plate going outside")

}