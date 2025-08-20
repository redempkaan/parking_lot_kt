package vehicle

import java.time.LocalDateTime

abstract class Vehicle(val plate: String){
    var importTime : LocalDateTime? = null
    var exportTime : LocalDateTime? = null

    fun getPlate() = println("Plate: $plate")

    abstract fun setImportTime()
    abstract fun setExportTime()

    abstract fun driveInside()
    abstract fun driveOutside()

}

class Car(plate: String, importTime: LocalDateTime?, exportTime: LocalDateTime?) : Vehicle(plate){

    override fun driveInside() = println("Car $plate going inside")
    override fun driveOutside() = println("Car $plate going outside")



    override fun setImportTime(){
        importTime = LocalDateTime.now()
    }

    override fun setExportTime(){
        exportTime = LocalDateTime.now()
    }

}