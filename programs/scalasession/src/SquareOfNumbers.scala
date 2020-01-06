object SquareOfNumbers  extends App {

  for (i <- 1 to 20){
    println(s"Square of $i = ${ Math.pow(i,2)}")
  }
}
