
// ******* Constructor *******
//  Primary Constructor

class Human (val name:String, val age:Int){

    //    Properties
    var hName:String
    var hAge:Int = age
    var gender:String = "Male"

//    Initializer Block
    init{
        hName = name
    }

    //    Member function

    fun display(){
        println("Name = $name")
        println("Age = $age")
        println("Gender = $gender")
    }

}

fun main() {
    val h1 = Human("Manish",19)
    h1.display()
    val h2 = Human("Babli",19)
    h2.gender = "Female"
    h2.display()

}