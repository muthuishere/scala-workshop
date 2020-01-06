object ConditionDemo {

  def checkAndPrintEligibility(age: Int): Unit = {

    if(age >= 18)
      println("You are Eligible to Vote")
    else
      println("You are not Eligible")
  }

  def checkAndGetEligibility(age: Int) = {
    if(age >= 18) "Eligible" else "Not Eligible"
  }

  def main(args: Array[String]): Unit = {


    val age = 15

    //checkAndPrintEligibility(age)
    val result = checkAndGetEligibility(age)

    println("You are " + result)

  }
}
