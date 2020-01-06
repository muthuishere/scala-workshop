package FutureDemo.implicitdemo
 import FutureDemo.implicitdemo.UserPreferences._

class PreferredDish(val preference: String)


object Restaurant {
  def serve(implicit dish: PreferredDish) = {
    println("Welcome,Your Preferred dish is  " + dish.preference)
  }

  def main(args: Array[String]): Unit = {

    println("Attempting to serve through parameter")
//    val dishAsParameter = new PreferredDish("pasta")
//    Restaurant.serve(dishAsParameter);
//
   println("Attempting to serve through implicit value")
    Restaurant.serve;


  }
}
