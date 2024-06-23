object q3{
  def main(args: Array[String]) : Unit = {
    val finalTakeHome = takeHome(40, 30)
    println(s"Final Take home salary = $finalTakeHome")

  }

  def takeHome(normal : Int, ot : Int) : Double = {
    var normalRate = 250
    var otRate =  85
    var tax = 0.12

    (normalRate * normal + otRate * ot) * (1 - tax)

  }
}



