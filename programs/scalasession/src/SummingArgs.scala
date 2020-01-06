object SummingArgs {

  def main(args: Array[String]): Unit = {



    var sum =0

    for(arg<- args){
      sum+= arg.toInt
    }

    println("Total " + sum)
  }


}
