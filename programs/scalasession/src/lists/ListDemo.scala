package lists

class Person(val name:String,val age:Int){

}

object ListDemo extends App {

  val weekdays = List("Sunday","Monday","Tuesday")
//  println(weekdays)
//  println(weekdays(0))
//  println("head",weekdays.head)
//  println("tail",weekdays.tail)
  val users= List.fill(4)("AnonyMous User")

  val personX = new Person("x",45)
  val persons= List.fill(4)(personX)
//
//  persons.foreach(person =>{
//    println(person.name)
//  } )
//
//
  println("Length",persons.length)
  println("Persons are empty",persons.isEmpty)
  println("Persons are NotEMpty",persons.nonEmpty)
  println("Person last ",persons.last.name)

}
