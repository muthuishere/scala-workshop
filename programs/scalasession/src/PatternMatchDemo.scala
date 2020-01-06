import scala.util.Random

object PatternMatchDemo {

  def main(args: Array[String]): Unit = {

    //PatternMatchValueDemo
    PatternMatchFunctionDemo
  }

  private def PatternMatchValueDemo = {
    val number: Int = Random.nextInt(10)

    println("Selected Number " + number)
    val result = number match {
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
      case _ => "Other Number"
    }

    println(result)
  }
  private def PatternMatchFunctionDemo = {


    println("PatternMatchFunctionDemo ")
    def matchNumber(number:Int) = number match {
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
      case _ => "Other Number"
    }

    println(matchNumber(2))
  }
}
