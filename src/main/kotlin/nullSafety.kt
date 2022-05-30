
fun main()
{
    var name:String = "Manish"
//    name = null     // not allowed

    var name1:String? = "Kumar"
    name1 = null  // allowed

    val nameLen = name.length
    println(nameLen)

//    1 >> *****  check null in conditions *******

//    val name1Len = if(name1 != null) name1.length else -1
//    println(name1Len)

//    2 >> ***** safe call ******
//  mostly use (recommended)
    val name1Len = name1?.length
    println(name1Len)

//    3 >> ****** The !! operator

//    val name1Len = name1!!.length
//    println(name1Len)
}