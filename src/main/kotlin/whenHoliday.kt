import java.util.Scanner

fun main()
{
    val scanner = Scanner(System.`in`)
    var x = scanner.next()

    when(x)
    {
        "sunday","saturday" -> println("Holiday")
        else -> println("Working day")
    }
}