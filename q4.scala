import scala.io.StdIn.readInt

object q4{
  def main(args: Array[String]): Unit = {
    val basePrice = 15
    val baseAttendance = 120
    val performanceCost = 500

    def totalCosts(attendance: Int): Int = {
      performanceCost + attendance * 3
    }
    def attendance(price: Int): Int = {
      baseAttendance + (basePrice - price) * 20 / 5
    }

    def profit(price: Int): Int = {
      price * attendance(price) - totalCosts(attendance(price))
    }

    def findbestPrice(startingPrice: Int, endingPrice: Int): Int = {
      var bestPrice = startingPrice
      var maximumProfit = profit(startingPrice)

      for (price <- startingPrice to endingPrice) {
        val currentProfit = profit(price)
        if (currentProfit > maximumProfit) {
          maximumProfit = currentProfit
          bestPrice = price
        }
      }
      bestPrice
    }

    println("Enter the starting price of the price range: ")
    var start = readInt()
    println("Enter the ending price of the price range: ")
    var end = readInt()

    val bestPrice = findbestPrice(start,end)
    println(s"The best ticket price is $bestPrice Rupees")
    val maximumProfit = profit(bestPrice)
    println(s"The maximum profit made at this price is $maximumProfit")

  }
}
