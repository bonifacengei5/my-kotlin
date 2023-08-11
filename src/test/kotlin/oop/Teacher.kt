package oop

 open class Teacher (name:String, email:String, password:String):User(name, email, password){
    fun submitResults(){
        println("yeah i can submit results")
    }
    fun checkAttendance(){
        println("yeah, I can check attendance")
    }
}