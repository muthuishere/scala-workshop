object LoopDemo extends App {


  private def printNumbers = {
    var numbers = List(2, 3, 4);
    for (number <- numbers) {

      println(number)
    }
  }


  def printIndexes(): Unit ={


    for( index <- 1 until  5){
      println(index)
    }
  }

  def printInnerLoopIndexes(): Unit ={


    for{
      index <- 1 until  5
        anotherIndex <- 1 until  3
    }{
      println(s"$index $anotherIndex ")

    }
  }

  printInnerLoopIndexes()
}
