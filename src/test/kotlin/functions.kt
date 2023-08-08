import kotlin.math.sqrt

fun main(args: Array<String>) {
    //Inbuilt functions
    var greeting ="Hello there"
    println(greeting.uppercase())
    println(greeting.lowercase())
    println(greeting.reversed())
    println(greeting.replace("there", "King"))
    var number =10.0
    println(Math.pow(number, 2.0))
    println(sqrt(number))
    //User defined functions
    motto()
    mission()
    addition(10,20)
    avg(1.5, y = 10,40.0f)
    sum(x = 10, y = 50.0)
    println(userName("Bonnie","Ngei"))
    avg(10,  30.5,   10.5f)



}
fun motto(){
    println("Hello there, this our motto")
}
fun mission(){
    println("This is our mission")
}
fun addition(x:Int,y:Int){
    var z =x+y
   println("Your answer is$z")


}
fun avg(x: Double, y: Int, z:Float){
    var average =(x+y+z)/3.0
    println("Your answer is $average")

}

fun sum(x: Int,y:Double):Double=x +y



fun userName(firstName:String,lastName:String):String{
    var fullName= "$firstName $lastName"
    return fullName
}
// Create a function to determine that
//the value submitted by a user
// is a palindrome



