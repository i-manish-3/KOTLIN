import javax.crypto.KeyAgreement

//  ******* Constructor ********
//  Primary & Secondary Constructor

class Registration(email:String,pass:String){

//    Properties
    var hName:String = ""
    var hAge:Int? = null
    var hEmail:String = email
    var hPass:String
    var gender:String = "Male"
//    Secondary constructor
    constructor(name:String,age:Int,email: String,pass: String):this(email,pass)
{
        hName = name
        hAge = age
}
//    Initializer Block
    init{
        hPass = pass
    }

//    Member function
    fun display(){
        println("Name = $hName")
        println("Age = $hAge")
        println("Email = $hEmail")
        println("Password = $hPass")
        println("Gender = $gender")
    }
}

fun main() {
    val user1 = Registration("Manish",19,"manish@gmail.com","Manish@123")
    user1.display()
    val user2 = Registration("Babli",19,"babli@gmail.com","Babli@123")
    user2.gender = "Female"
    user2.display()
}