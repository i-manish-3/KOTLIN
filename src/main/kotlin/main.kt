import java.util.Scanner

fun main() {

    println("Hello Kotlin")

//    var -> use if we want to re-assign the value
//    val -> in this value is not re-assignable

    var a = 15  //  dynamic type variable creation
    a = 20
    var b:Int = 20  // specific type variable creation

    println(a + b);

    println("The sum of a and b is "+ (a+b))
    println("The sum of a and b is ${a+b}") // another way

    a = 5
    b = 2
    for(i in b..a)    // start from b till a
    {
        println(i)
    }

//    user input using readLine()
//    val name = readLine()
//    println(name)

//    val name:String? = readLine()
//    println(name)
//    println(name!!::class.simpleName)

    // readLine takes input in string if we want to take input in integer we have to type-caste it.

//    val rollNo = readLine()!!.toInt()
//    println(rollNo)
//    println(rollNo::class.simpleName)

//    to take input in float

//    val fees = readLine()!!.toFloat()
//    println(fees)
//    println(fees::class.simpleName)

//    ## Take input using scanner class

    val scanner = Scanner(System.`in`)
    val name = scanner.next()
    println(name)
    println(name::class.simpleName)





}