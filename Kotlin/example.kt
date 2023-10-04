class Example {
    fun exampleFunction(name: String, age: Int) {
        // ...
    }
}

fun main() {
    val example = Example()

    // Inlay parameter hints here should show 'name' and 'age'
    example.exampleFunction("Alice", 25)

}
