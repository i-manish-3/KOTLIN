fun main()
{
    val add = {a:Int, b:Int -> a+b}
    println(add(10,20))

//    another way
    val sum:(Int, Int) -> Int = {a,b -> a+b}
    println(sum(100,200))
}