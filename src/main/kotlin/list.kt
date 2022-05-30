
fun main() {

//    val data = listOf("Manish",1,2,3,'A')
//    println(data)
//    println(data[4])
//    println("Size of data = ${data.size}")
//    for(i in data)
//    {
//        println(i)
//    }

//    *********** MUTABLE LIST ***********
//    val data = mutableListOf(1,2,3,4,"Manish",'A')
//    println(data.size)
//    println(data)
//
//    data.add(4,12)
//    println(data.size)
//    println(data)
//
//    data.removeAt(5)
//    println(data)
//    println(data.size)

//    USER INPUT IN LIST

    println("Enter the size of array: ")
    val num = readLine()!!.toInt()
    println("Enter the elements of array: ")
    val arr = List(num){readLine()!!}
    for(i in arr)
    {
        println(i)
    }
}