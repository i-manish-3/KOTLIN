
//  *********  Inheritance  ********

open class Father{
//    Properties
    var car:String = "BMW"
    var money:Int = 10000

//    Member function

    fun display()
    {
        println("Father Car = $car")
        println("Father Money = $money")
    }
}
class Son:Father(){
    //    Properties
    var bike:String = "KTM"

    //    Member Function
    fun show(){
        println("Son bike = $bike")
        println("Father Car = $car")
        println("Father Money = $money")
    }
}

fun main() {
    val s1 = Son()
    s1.show()
    s1.display()
    s1.car = "Audi"
    s1.money = 20000
    s1.display()
}

