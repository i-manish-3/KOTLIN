/******* Getter and Setter *******/
class User(_id:Int,_name:String,_age:Int){
    val id:Int = _id
    get() = field

    var name:String = _name
    get() = field
    set(value){
        field = value
    }

    var age:Int = _age
    get() = field
    set(value) {
        field = value
    }
}

fun main() {
    val u1 = User(1,"Manish",19)
    println(u1.id)  // get Property
    println(u1.name)  // get Property
    println(u1.age)  // get Property

    u1.name = "Babli"  // set Property
    u1.age = 18   // set Property

    println(u1.name)
    println(u1.age)
}