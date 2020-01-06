package functional

object NumberListOperations {


  def main(args: Array[String]): Unit = {

    
    val numbers = List(10,8,3,4)

    def isEven(num:Int) = (num % 2) == 0
    def isOdd(num:Int) = (num % 2) != 0

    val isAllEven  = numbers.forall(isEven)

    val isOddNumberExistsInList = numbers.exists(isOdd)

    val partitions = numbers.partition(isEven);

    println("numbers,", numbers)
    println("Is all EvenNumbers ", isAllEven)
    println("Is Odd Number Exists in List ",
      isOddNumberExistsInList)
    println("partitions ", partitions)


  }


  private def getSumOfFilteredEvenNumberSquares(numbers: List[Int]): Int = {
    return numbers
      .filter(number => number % 2 == 0)
      .map(number => number * number)
      .reduce((accumulator, currentSquaredNumber) => accumulator + currentSquaredNumber);
  }


}
