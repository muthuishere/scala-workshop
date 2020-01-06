import scala.collection.mutable

object HashMapDemo extends App{

  val alphabetLearner = mutable.HashMap("A"->"Apple","B"->"Baby","C"->"Cat")

  alphabetLearner.foreach{
    case (key,value) => println(s"$key ==> dollar$$ $value")
  }

}
