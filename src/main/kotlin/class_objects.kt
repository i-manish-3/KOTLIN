//  Creating Class
class Mobile {
    //    Properties
    var model: String = "100k"
    var price: Float = 1234.56f


//    Member function
    fun display(){
        println("Model = $model")
        println("Price = $price")
    }
}





fun main() {
    val oppo = Mobile()  // Creating Object
    oppo.display() // calling function member using object
    oppo.price = 39128.99f // Accessing properties using object
    oppo.model = "A51" // Accessing properties using object
    oppo.display() // calling function member using object

    val realme = Mobile()
    realme.display()
    realme.model = "2 pro"
    realme.price = 1299.99f
    realme.display()

}