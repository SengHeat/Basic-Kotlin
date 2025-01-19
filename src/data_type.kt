
fun main() {

    println("Hello World With Kotlin")

    //TODO: Variable
    val name = "SENG HEAT" // Cannot be reassigned.
    var age = 21  // Can be reassigned.
    age ++;

    println("Hello My name is : $name , Age : $age")

    //TODO: DataType
    val number: Int = 10
    val price: Double = 99.99
    val isActive: Boolean = true
    val grade: Char = 'A'

    println("Number: $number, Price: $price, Active: $isActive, Grade: $grade")

    //TODO: Operation
    val a = 10
    val b = 15

    println("Addition: ${a + b}") // Arithmetic
    println("Is a equal to b? ${a == b}") // Comparison
    println("Logical AND: ${a > 5 && b > 15}")
}