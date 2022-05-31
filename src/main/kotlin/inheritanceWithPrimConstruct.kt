// ********* Inheritance With Primary Constructor *********


//  *********  Inheritance  ********

open class Father1(_car:String, _money:Int){
    //    Properties
    var car:String
    var money:Int

//    Initialization
    init {
        car = _car
        money = _money
    }
//    Member function
    fun display()
    {
        println("Father Car = $car")
        println("Father Money = $money")
    }
}
class Son1(_car:String,_money:Int,_bike:String):Father1(_car,_money){
    //    Properties
    var bike:String
//    Initialization
    init {
        bike = _bike
    }
    //    Member Function
    fun show(){
        println("Son bike = $bike")
        println("Father Car = $car")
        println("Father Money = $money")
    }
}

fun main() {
    val s1 = Son1("BMW",1000,"KTM")
    s1.show()
    s1.display()
    s1.car = "Audi"
    s1.money = 20000
    s1.display()
}

