package caseclassdemo

case class Person(var name:String)


object Person{

  def main(args: Array[String]): Unit = {
    val obj1 =  Person("x")
    val obj2 =  Person("x")
    println( obj1 == obj2)
    println( obj1 )
    println( obj2 )
  }
}