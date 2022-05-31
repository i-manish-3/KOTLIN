
// ******* Constructor *******
//  Primary Constructor

class Person constructor(val name:String, val age:Int){

//    Properties
    var gender:String = "Male"

//    Member function
    fun display(){
        println("Name = $name")
        println("Age = $age")
        println("Gender = $gender")
    }

}

fun main() {

    val p1 = Person("Manish",19)
    p1.display()
    val p2 = Person("Himanshi",18)
    p2.gender = "Female"
    p2.display()
}