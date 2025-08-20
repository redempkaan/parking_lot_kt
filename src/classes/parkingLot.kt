package parking_lot
import classes.logFormatter
import classes.passedMins
import vehicle.Vehicle


class ParkingLot(val manager: String, val limit: Int, val minutelyFee: Int){

    //Empty areas are equal to lot limit at first

    var emptyAreas = limit

    //Imported vehicles are stored in list
    var vehiclesInside: MutableList<Vehicle> = mutableListOf()

    fun getManager() = println("Manager: $manager")

    fun importVehicle(vehicle: Vehicle){
        //Decreasing empty areas after import

        emptyAreas -= 1
        vehiclesInside.add(vehicle)
        vehicle.driveInside()
        vehicle.setImportTime()

    }

    fun exportVehicle(vehicle: Vehicle){
        //Increasing empty areas after export

        emptyAreas += 1
        vehiclesInside.remove(vehicle)
        vehicle.driveOutside()
        vehicle.setExportTime()

        println("Car ${vehicle.plate}'s import time: ${vehicle.importTime?.logFormatter()}, export time: ${vehicle.exportTime?.logFormatter()}\n Total fee(calculated in minutes) : ${vehicle.importTime?.passedMins(vehicle.exportTime)?.times(minutelyFee)}")
    }
}