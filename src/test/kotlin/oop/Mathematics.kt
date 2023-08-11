package oop
//override implementing function that is on an  interfect

class Mathematics :Subjects{
    override fun grading() {
        println("I am implementing mathematics")

    }

    override fun standardize() {
        println("I am standardizing")
    }
}