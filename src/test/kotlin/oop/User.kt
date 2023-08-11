package oop

 open class User (var name:String, var email:String, var password:String){
     private var  gender:String=""
     fun setGender(gender:String){
         this.gender= gender
     }
     fun getGender():String{
         return this.gender
     }
     private var idNumber:String=""
     fun setIdNumber(idNumber: String){
         this.idNumber=idNumber
     }
     fun getIdNumber():String{
         return  this.idNumber
     }
     fun register(){
        println("Yeah, I can register")
    }
    fun login(){
        println("Yeah, I can login")
    }
    fun loginOut(){
        println("Yeah,I can logout")


    }
}
