fun main() {
//   val  data = setOf("Manish","Himanshi",100,100,'M',"Himanshi")
//   println(data)
//   println(data.size)
//    for(i in data)
//    {
//        println(i)
//    }

//    val  data = setOf<String>("Manish","Himanshi","Himanshi")
//    println(data)
//    println(data.size)
//    for(i in data)
//    {
//        println(i)
//    }

    val  data = mutableSetOf("Manish","Himanshi","Himanshi")
    println(data)
    data.add("Babli")
    data.remove("Himanshi")
    println(data.size)
    for(i in data)
    {
        println(i)
    }

}