import java.util.Scanner

fun main()
{
    val scanner = Scanner(System.`in`)
    var x = scanner.nextInt()
    when(x)
    {
        1 -> println("One")
        2,3 -> {
            println("Two or ")
            println("Three")
        }
        in 4..6 -> {
            println("Four")
            println("Five")
            println("Six")
            println("Seven")
        }
        else -> println("Not valid number")
    }
}