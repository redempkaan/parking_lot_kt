import vehicle.Car
import parking_lot.ParkingLot

fun main(){
    var input : String
    var tokens : List<String>
    var key = 'c'
    val lot1 = ParkingLot("Burakcan Sezgin", 4, 100)
    val car_shape = """
          ______
         /|_||_\`.__
        (   _    _ _\
        =`-(_)--(_)-'
    """.trimIndent()

    println(car_shape)

    println("Welcome to Fups Mobile parking lot, I am manager ${lot1.manager}\n")

    //Checking a key variable to provide constant console activity of the app; if key is not 'q', continue
    while(key != 'q') {

        println("Enter the properties of the car (seperate with single space)")

        //If input is null, assign the given string to avoid exceptions
        input = readln() ?: "error error"
        tokens = input.split(" ")
        //Checking given property count for car object
        if(tokens.size != 5){
            println("Check your input and try again")
            return
            }

        val (plate, height, width, fuel_type, hours) = tokens
        //Creating the car object
        val car2 = Car(plate, height.toInt(), width.toInt(), fuel_type, hours.toInt())
        //Checking if the car with the given plate is inside the lot
        if (car2.plate in lot1.vehicles_inside) {
            lot1.exportVehicle(car2)
        }
        //If not, check lot conditions and decide whether the car will be allowed or not
        else if ((car2.fuel_type.lowercase() != "lpg") && lot1.empty_areas != 0) {
            lot1.importVehicle(car2)
        }
        else {
            println("Sorry, we cannot accept your car right now")
        }

        println("Empty spaces: ${lot1.empty_areas}")
        println("Is there anything I can do for you? If so, press anything other than 'q'")

        input = readln()

        //Used elvis operator to avoid empty input and so to avoid related exceptions
        key = input?.firstOrNull() ?: 'q'

    }
    println("Ending session\n")

}
