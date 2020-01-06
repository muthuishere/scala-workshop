object FunctionDemo {

  def multiply(x:Int,y:Int):Int = {
    return x * y
  }
  def divide(x:Int,y:Int):Int = {
     x / y
  }
  def main(args: Array[String]): Unit = {

    println("2 * 3 Equals = ",multiply(2,3))
    println("6 divided by  3 Equals = ",divide(6,3))
  }
}
