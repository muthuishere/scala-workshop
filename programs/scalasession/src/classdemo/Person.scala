package classdemo

class Person(val name: String, private var _age: Int) {
  var eligibleVoter: Boolean = false

  def age = _age

  def age_=(value: Int) = {

    _age = value

    eligibleVoter = if (value >= 18) true else false
  }

  def this() {
    this("Anonymous", 0)
  }


  age_=(_age)

  override def toString = s"Person($eligibleVoter, $name, $age)"
}

object Person {
  var isRunning = false

  def main(args: Array[String]): Unit = {

    val personX = new Person("X", 13)
    println(personX.toString)

    personX.age = 45

    println("After changing age ", personX.toString)

    //
    //    val noPerson = new Person()
    //    println(noPerson.toString)
    //
    val personWithNameAndAge = new Person("Danny", 34)
    println(personWithNameAndAge.toString)

  }
}


