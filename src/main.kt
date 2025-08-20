import vehicle.Car
import parking_lot.ParkingLot
import java.time.LocalDateTime

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

        println("Enter the plate of the car\n")

        //If input is null, assign the given string to avoid exceptions

         val plate = readln() ?: "e"

        //Checking given property count for the car object

        if(plate == "e"){
            println("Invalid input")
            return
        }


        var car1 = lot1.vehiclesInside.find {it.plate == plate}

        //Checking if the car with the given plate is inside the lot

        if (car1 != null) {
            lot1.exportVehicle(car1)
        }
        //If not, check lot conditions and decide whether the car will be allowed or not

        else if (lot1.emptyAreas != 0) {
            //Creating the car object

            car1 = Car(plate, null, null)
            lot1.importVehicle(car1)
        }
        else {
            println("Sorry, we cannot accept your car right now")
        }

        println("Empty spaces: ${lot1.emptyAreas}")
        println("\nIs there anything I can do for you? If so, press anything other than 'q'")

        input = readln()

        //Used elvis operator to avoid empty input and so to avoid related exceptions

        key = input?.firstOrNull() ?: 'q'

    }
    println("Ending session\n")

}
