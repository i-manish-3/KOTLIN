fun main() {
    val data = mapOf(1 to 100, 2 to "Manish", "key" to 200)
    println(data)
    println(data[1])
    println(data[2])
    println(data["key"])

    println(data.get(2))

    println("All keys = ${data.keys}")
    println("All values = ${data.values}")

    for (i in data.keys)
    {
        print("$i ")

    }
    for (i in data.values)
    {
        print("$i ")

    }

}