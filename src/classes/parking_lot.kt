package parking_lot
import vehicle.Vehicle
import kotlin.random.Random


class ParkingLot(val manager: String, val limit: Int, val hourlyFee: Int){

    //Empty areas are equal to lot limit at first

    var emptyAreas = limit
    var vehiclesInside: MutableList<String> = mutableListOf()

    fun getManager() = println("Manager: $manager")

    fun importVehicle(vehicle: Vehicle){
        //Decreasing empty areas after import

        emptyAreas -= 1
        vehiclesInside.add(vehicle.plate)
        vehicle.driveInside()
    }

    fun exportVehicle(vehicle: Vehicle){

        //Export time is randomized between import time and 24

        val exportTime = Random.nextInt(vehicle.importTime + 1, 24)

        //Increasing empty areas after export

        emptyAreas += 1
        println("Car ${vehicle.plate}'s import time: ${vehicle.importTime}, export time: ${exportTime} total fee : ${(exportTime - vehicle.importTime) * hourlyFee}")
        vehiclesInside.remove(vehicle.plate)
        vehicle.driveOutside()
    }
}