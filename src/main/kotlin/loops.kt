//   ******** For Loop  ********

fun main()
{
//    for(i in 1..5) {
//        print("Step: ")
//        println(i)
//    }

//    In reverse order

//    for(i in 5 downTo 1) {
//        print("Step: ")
//        println(i)
//    }

//    **********  While Loop *********

//    var x = 0
//    while(x <= 5)
//    {
//        println(x++)
//    }

//    ******** Do While *********

//    var x = 0
//    do{
//        println(x++)
//    }while(x <= 5)

//    ******** Break and Continue ********

    var x = 0
    while(x < 10)
    {
        x++
        if(x== 5)
            continue // continue skip that part
        println(x)
    }
}