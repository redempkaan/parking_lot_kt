package parking_lot
import classes.logFormatter
import classes.passedSecs
import vehicle.Vehicle
import classes.outputStr


class ParkingLot(val manager: String, val limit: Int, val secondlyFee: Int){

    //Empty areas are equal to lot limit at first

    var emptyAreas = limit

    //Imported vehicles are stored in list
    var vehiclesInside: MutableList<Vehicle> = mutableListOf()

    fun getManager() = println("Manager: $manager")

    fun printVehiclesInside() = println("Vehicles inside: ${vehiclesInside.map {it.plate}}")

    fun importVehicle(vehicle: Vehicle){
        //Decreasing empty areas after import

        emptyAreas -= 1
        vehiclesInside.add(vehicle)
        vehicle.driveInside()
        vehicle.setImportTime()
        printVehiclesInside()
        outputStr("[IN] plate: ${vehicle.plate} time: ${vehicle.importTime?.logFormatter()}")

    }

    fun exportVehicle(vehicle: Vehicle){
        //Increasing empty areas after export

        emptyAreas += 1
        vehiclesInside.remove(vehicle)
        vehicle.driveOutside()
        vehicle.setExportTime()

        println("Car ${vehicle.plate}'s import time: ${vehicle.importTime?.logFormatter()}, export time: ${vehicle.exportTime?.logFormatter()}\n Total fee (calculated in seconds): ${vehicle.importTime?.passedSecs(vehicle.exportTime)?.times(secondlyFee)}")
        printVehiclesInside()
        outputStr("[OUT] plate: ${vehicle.plate} time: ${vehicle.exportTime?.logFormatter()}, fee: ${vehicle.importTime?.passedSecs(vehicle.exportTime)?.times(secondlyFee)}")

    }
}