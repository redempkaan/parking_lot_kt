import vehicle.Car
import parking_lot.ParkingLot

fun main(){
    var input : String
    var tokens : List<String>
    var key = 'c'
    val lot1 = ParkingLot("Burakcan Sezgin", 4, 100)
    val carShape = """
          ______
         /|_||_\`.__
        (   _    _ _\
        =`-(_)--(_)-'
    """.trimIndent()

    println(carShape)

    println("Welcome to Fups Mobile parking lot, I am manager ${lot1.manager}\n")

    //Checking a key variable to provide constant console activity of the app; if key is not 'q', continue
    while(key != 'q') {

        println("Enter the properties of the car by seperating with single space as:\n plate height width fuelType importTime(hour)\n")

        //If input is null, assign the given string to avoid exceptions

        input = readln() ?: "error error"
        tokens = input.split(" ")

        //Checking given property count for car object

        if(tokens.size != 5){
            println("Check your input and try again")
            return
            }

        val (plate, height, width, fuelType, importTime) = tokens

        //Creating the car object

        val car2 = Car(plate, height.toInt(), width.toInt(), fuelType, importTime.toInt())

        //Checking if the car with the given plate is inside the lot

        if (car2.plate in lot1.vehiclesInside) {
            lot1.exportVehicle(car2)
        }
        //If not, check lot conditions and decide whether the car will be allowed or not

        else if ((car2.fuelType.lowercase() != "lpg") && lot1.emptyAreas != 0) {
            lot1.importVehicle(car2)
        }
        else {
            println("Sorry, we cannot accept your car right now")
        }

        println("Empty spaces: ${lot1.emptyAreas}")
        println("Is there anything I can do for you? If so, press anything other than 'q'")

        input = readln()

        //Used elvis operator to avoid empty input and so to avoid related exceptions

        key = input?.firstOrNull() ?: 'q'

    }
    println("Ending session\n")

}
