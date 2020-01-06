package traitdemo.mixins

trait Tail {

  def wagTail { println("wagging tail")}
  def getTailWeight()= { 23 }
}


abstract class Pet(var name:String) {

  def walk { println("walking")}
  def speak
  def getWeight()= { 123 }
}


class Dog( name:String) extends Pet(name) with Tail{
  override def speak: Unit = {
    println(s"My name is $name wowwww , my weight is" + getWeight)
  }
}


object Orchestrator{

  def main(args: Array[String]): Unit = {
    val dogX = new Dog("Mrx")
    dogX.speak

  }
}

