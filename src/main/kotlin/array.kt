
fun main()
{
//    val arr = arrayOf(1,2,3,"Manish",'A')
//    for(i in arr) {
//        println(i)
//    }
// printing element of array

//    val arr1 = arrayOf<String>("Manish","Kumar","Himanshi")
//    for(i in arr1) {
//        println(i)
//    }

//    printing index of array

//    for(i in arr.indices)
//    {
//        println("at index $i element = ${arr[i]}")
//    }

//    size of array
//    println(arr.size)

//    printing array element by size

//    for(i in 0..arr.size-1)
//    {
//        println("at index $i element = ${arr[i]}")
//    }

//    for each loop

//    arr.forEach { i -> println(i) }

//    ******* Array() Constructor

//    val roll = Array(5,{i -> readLine()!!.toInt() })
//    for(r in roll)
//    {
//        println(r)
//    }

//    ***** Built in methods *****
//    val num = intArrayOf(1,2,3,4)
//    for(i in num)
//    {
//        print(i)
//    }
//    val char = charArrayOf('M','a','n','i','s','h')
//    for(i in char)
//    {
//        print(i)
//    }

//    User input array

    println("Enter the size of array: ")
    val num = readLine()!!.toInt()
    println("Enter the elements of array: ")
    val arr = Array(num){readLine()!!}
    for(i in arr)
    {
        println(i)
    }
}