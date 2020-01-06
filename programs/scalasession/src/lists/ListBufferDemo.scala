package lists

import scala.collection.mutable.ListBuffer

object ListBufferDemo extends App {

  val numbers = ListBuffer(3,71,23)
println(numbers)

  numbers += 99
  println("After adding 99" + numbers)

  1 +=: numbers
  println("After prepending 1 " + numbers)

  numbers -= 71

  println("After removing 71 " + numbers)

  numbers.remove(0)
  println("After removing first element  " + numbers)

}
