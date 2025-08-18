package parking_lot
import vehicle.Vehicle
import kotlin.random.Random


class ParkingLot(val manager: String, val limit: Int, val hourly_fee: Int){

    //Empty areas are equal to lot limit at first
    var empty_areas = limit
    var vehicles_inside: MutableList<String> = mutableListOf()

    fun getManager() = println("Manager: $manager")

    fun importVehicle(vehicle: Vehicle){
        //Decreasing empty areas after import
        empty_areas -= 1
        vehicles_inside.add(vehicle.plate)
        vehicle.driveInside()
    }

    fun exportVehicle(vehicle: Vehicle){
        //Export time is randomized between import time and 24
        val export_time = Random.nextInt(vehicle.import_time + 1, 24)
        //Increasing empty areas after export
        empty_areas += 1
        println("Car ${vehicle.plate}'s import time: ${vehicle.import_time}, export time: ${export_time} total fee : ${(export_time - vehicle.import_time) * hourly_fee}")
        vehicles_inside.remove(vehicle.plate)
        vehicle.driveOutside()
    }
}