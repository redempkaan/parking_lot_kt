# Simple Parking Lot Application to learn Kotlin and practice its object oriented properties

This project simulates a simple console-based parking lot management system. The system tracks vehicle entries and exits, monitors parking capacity, and calculates parking fees based on the duration each vehicle stays.

# Features

 **1) Vehicle Entry:**
Users can add N different vehicles through the entry gate.
Each vehicle requires license plate and entry time information.

**2) Parking Capacity:**
The parking lot has 4 vehicle slots in total.
No new vehicles are allowed if the parking lot is full.

**3) Vehicle Tracking:**
The system checks whether a vehicle is already inside based on its license plate.

If a vehicle returns:  
**Inside** → it will exit, and exit time is randomized between import time and 24  
**Outside** → it will enter, and entry time is recorded.  

**4) Fuel Type Check:**
Vehicles that use LPG as fuel are not allowed as they may cause problems in indoor areas.

**5) Fee Calculation:**
Upon exit, the duration between exit and entry times is calculated.
A parking fee is charged according to this duration.

# Usage
- The program prompts the user to input vehicle information(plate, height, width, fuel type, import time).  
- The system checks the current parking lot status.
- For exiting vehicles, fees are displayed.  
