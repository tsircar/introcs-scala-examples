import scala.io._
import scala.util._

object StockQuote {
  
  def main(args : Array[String]) {
     val SYMBOL = "GOOG"
     val symbol = Try(args(0)).getOrElse(SYMBOL)
 
     url = s"http://finance.yahoo.com/d/quotes.csv?s=$symbol&f=snbaop11")
     data = Source.fromURL(url)
     for (datum <- data.getLines)
        println(datum)
     
  }
}
