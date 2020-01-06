package caseclassdemo.withoutcaseclass

class Person(var name:String){

  override def toString = s"Person($name)"

  def canEqual(other: Any): Boolean = other.isInstanceOf[Person]

  override def equals(other: Any): Boolean = other match {
    case that: Person =>
      (that canEqual this) &&
        name == that.name
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(name)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}


object Person{

  def main(args: Array[String]): Unit = {
    val obj1 = new Person("x")
    val obj2 = new Person("x")
    println( obj1 == obj2)
    println( obj1 )
    println( obj2 )
  }
}