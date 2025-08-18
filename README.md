# Simple Parking Lot Application to learn Kotlin and practice its object oriented properties

This project simulates a simple console-based parking lot management system. The system tracks vehicle entries and exits, monitors parking capacity, and calculates parking fees based on the duration each vehicle stays.

#Features

# 1)Vehicle Entry:
Users can add N different vehicles through the entry gate.
Each vehicle requires license plate and entry time information.

# 2)Parking Capacity:
The parking lot has 4 vehicle slots in total.
No new vehicles are allowed if the parking lot is full.
Vehicle Tracking:
The system checks whether a vehicle is already inside based on its license plate.
If a vehicle returns:
Inside → it will exit, and exit time is recorded.
Outside → it will enter, and entry time is recorded.
Fee Calculation:
Upon exit, the duration between exit and entry times is calculated.
A parking fee is charged according to this duration.

Usage
The program prompts the user to input vehicle information.
The system checks the current parking lot status.
For each vehicle, the user inputs:
License plate
Entry time (if vehicle is outside)
For exiting vehicles, the parking duration and fee are displayed.
