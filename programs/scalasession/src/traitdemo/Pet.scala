package traitdemo

trait Pet {

  def speak
  def walk { println("Walking") }
}

class Dog extends Pet{
   def speak: Unit = {
    println("Wow....")
  }
}

object Orchestrator{

  def main(args: Array[String]): Unit = {
     val dogX = new Dog
    dogX.speak

  }
}