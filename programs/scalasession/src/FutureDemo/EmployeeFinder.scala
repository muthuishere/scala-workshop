package FutureDemo

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Random, Success}

object EmployeeFinder {

  def main(args: Array[String]): Unit = {

    var getHighestSalaryEmployeeId = Future {

      Thread.sleep(2000)
      Random.nextInt(45)
    }

    getHighestSalaryEmployeeId.onComplete{
      case Success(value) => println("received value " + value)
      case  Failure(exception) => exception.printStackTrace
    }

    println("Doing Some other work")

   // getHighestSalaryEmployeeId.isCompleted
Thread.sleep(3000)

  }

}
