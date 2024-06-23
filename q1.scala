object q1{
  def main(args : Array[String]) : Unit = {
    var i, j , k = 2
    var m, n = 5
    var f = 12.0f
    var g = 4.0f
    var c = 'X'

    var result = k + 12 * m
    println(s"Result of a is: $result")

    result = m / j
    println(s"Result of b is: $result")

    result = n % j
    println(s"Result of c is: $result")

    result = m / j * j 
    println(s"Result of d is: $result")

    val resultE = f+ 10.0 * 5.0 +g
    println(s"Result of e is: $resultE")

    i += 1
    result = i * n
    println(s"Result of f is: $result")

  }
}



