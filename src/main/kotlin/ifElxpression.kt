fun main(){
    val a = 10
    val b = 20
    var max = 0

//    if (a >= 18)
//    {
//        println("You can drive $c")
//    }
//    else
//    {
//        println("You can't drive")
//    }

//    max of two number

//    if(a > b)
//    {
//        max = a
//    }
//    else
//    {
//        max = b
//    }
//    println(max)

//    another way to write above expression

    max = if(a < b) a else b
    println(max)
}
