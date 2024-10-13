package com.example.pertemuan2

fun withoutParameter(){
    println("=== withoutPatameter ===")
    println("Hello World")
}

fun withParameter(name: String){
    println()
    println("=== withParameter ===")
    println("Hello, $name!")
}

fun withNamedArgument(name: String, age: Int){
    println()
    println("=== withNamedArgument ===")
    println("Hello, $name! You are $age years old.")
}

fun withDefaultParameter(name: String = "Luthfi", age: Int){
    println()
    println("=== withDefaultParameter ===")
    println("Hello, $name! You are $age years old.")
}

fun withReturn(panjang : Int, lebar : Int) : Int{
    return (panjang * lebar)
}

fun main() {
    withoutParameter()
    withParameter("John")
    withNamedArgument(age = 25, name = "Alice")
    withDefaultParameter(age = 20)
}
