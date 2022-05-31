//  ******* Secondary Constructor *******
class People{
//    Properties
    var name:String
    var pAge:Int
    var gender:String = "Male"

//    secondary constructor
    constructor(name:String,age:Int){
        println("Constructor called")
        this.name = name
        pAge = age
    }

    //    Member function
    fun display(){
        println("Name = $name")
        println("Age = $pAge")
        println("Gender = $gender")
    }
}

fun main() {
    val p1 = Person("Manish",19)
    p1.display()
    val p2 = Person("Babli",19)
    p2.gender = "Female"
    p2.display()
}