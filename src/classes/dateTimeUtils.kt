package classes

import java.time.Duration
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

//Calculating time passed between two dates in minutes

fun LocalDateTime.passedMins(secondDate: LocalDateTime?): Long{
    return Duration.between(this, secondDate).toMinutes()

}

//Converting the date to a more appropriate format for logging

fun LocalDateTime.logFormatter(): String{
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")

    return this.format(formatter)
}