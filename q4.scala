import scala.io.StdIn.readInt

object q4{
  def main(args: Array[String]): Unit = {
    def totalCosts(attendance: Int): Int = {
      500 + attendance * 3
    }
    def attendance(price: Int): Int = {
      120 + (15 - price) * 20 / 5
    }

    def profit(price: Int): Int = {
      price * attendance(price) - totalCosts(attendance(price))
  
    }
  println("Profit at Rs. 5 : " + profit(5))
  println("Profit at Rs. 10 : " + profit(10))
  println("Profit at Rs. 15 : " + profit(15))
  println("Profit at Rs. 20 : " + profit(20))
  println("Profit at Rs. 25 : " + profit(25))
  println("Profit at Rs. 30 : " + profit(30))
  println("Profit at Rs. 35 : " + profit(35))
  println("Profit at Rs. 40 : " + profit(40)) 
  println("The best ticket price is Rs. 25 with a total profit of Rs. " + profit(25))
}

}
