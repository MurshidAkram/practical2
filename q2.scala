object q2{
  def main(args: Array[String]) : Unit = {
    var a : Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    val k: Float = 4.3f


    /*or we can just declare due to scala type inference*/
   println(s"a = $a\nb = $b\nc = $c\nd = $d\nk = $k\n")

   //--b(pre decrement) and d--(post increment) is not directly supported in scala
   b -= 1
   println(b * a + c *d)
   d -= 1

   //scala doesnt support post increment therefore must manually increment
   println(a)
   a += 1

  //declare g first
   val g = 5.0f
   println(-2 * (g - k) +c)

   println (c)
   c += 1

   c += 1
   c = c * a
   println(c)
   a += 1

  }
}

