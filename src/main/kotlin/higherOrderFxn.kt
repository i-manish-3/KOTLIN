
fun main()
{
    hOF(10,20, ::addition)
}
fun addition(a:Int,b:Int):Int{
    return (a+b)
}
fun hOF(a:Int, b:Int, callback:(Int,Int)->Int)
{
    println(callback(a,b))
}