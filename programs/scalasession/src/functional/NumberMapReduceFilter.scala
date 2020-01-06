package functional

object NumberMapReduceFilter {


  def main(args: Array[String]): Unit = {


    val numbers = List(21, 10, 12, 81)
    val sumOfNumbersAndTen = numbers.fold(10)((accumulator,currentValue)=>accumulator +  currentValue)


    println("numbers,", numbers)
    println("sumOfNumbersAndTen,", sumOfNumbersAndTen)
    val sumOfFilteredEvenNumberSquares = getSumOfFilteredEvenNumberSquares(numbers)
    println("sumOfFilteredEvenNumberSquares ,", sumOfFilteredEvenNumberSquares)


  }


  private def getSumOfFilteredEvenNumberSquares(numbers: List[Int]): Int = {
    return numbers
      .filter(number => number % 2 == 0)
      .map(number => number * number)
      .reduce((accumulator, currentSquaredNumber) => accumulator + currentSquaredNumber);
  }


}
