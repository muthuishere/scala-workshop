object YieldDemo extends App {

  val res = for(i <- 1 to 5)    yield i

  println(res)
}
