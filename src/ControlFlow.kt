

fun main() {
    val age = 21

    //TODO if and else Statements
    if (age >= 18) {
        println("You are an adult.")
    } else {
        println("You are a minor.")
    }

    //TODO if as an Expression
    val num = 21
    val result = if (num % 2 == 0) "Even" else "Odd"
    println("The number is $result")

    //TODO when Statement
    val day = 7

    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6, 7 -> "Weekend"
        else -> "Invalid day"
    }

    println("Day: $dayName")

    var number = 1

    do {
        println("Do-While Count: $number")
        number++
    } while (number <= 3)

}
