package oop

class Hod (name:String,email:String,password:String):User(name,email,password){
    fun suspendTeacher(){
        println("I can suspend teacher")
    }
    fun scheduleMeeting(){
        println("I can schedule a meeting")
    }
}