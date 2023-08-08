package oop

fun main(args: Array<String>) {
    println("Welcome to oop")
    var firstCar=Car("Toyota","V8","KDM007j")
    var secondCar=Car("Mercedes","C200","KDJ907K")
    println(firstCar.model)
    println(secondCar.reg_no)
    var firstFruit=Fruit("Mango","yellow",35.00)
    var secondFruit=Fruit("Apple","Pink",40.00)
    println(firstFruit.name)
    println(secondFruit.colour)
    var firstPhone=Phone("iPhone14","ios","TypeC")
    var secondPhone=Phone("Samsung","S23","TypeC")
    secondPhone.call(phoneNumber = "0740036109")
}