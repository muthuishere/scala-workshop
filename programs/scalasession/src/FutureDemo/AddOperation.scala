package FutureDemo

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global


object AddOperation {

  def main(args: Array[String]): Unit = {


    println(Thread.currentThread().getName +  " Starting App")

    val  addTwoAndThree = Future{

      println(Thread.currentThread().getName +  " Performing operation")
      Thread.sleep(500)
      2+3
    }

    val result = Await.result(addTwoAndThree,1 second)
    println(result)


  }

}
