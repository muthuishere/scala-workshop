object NullDemo  extends App {

  checkNullValueFromMethod

  private def checkNullValueFromVariable = {
    val name = null


    val result = Option(name).getOrElse("anonymous")

    println(result)
  }

  def getName():Option[String] = {
    return Some("Aegon");
  }

  def checkNullValueFromMethod ={

    val result:Option[String] = getName()
    println(result.getOrElse("some other name"))
  }
}
