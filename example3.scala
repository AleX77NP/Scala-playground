import scala.util.control.Breaks._

object ScalaCourse {
    def main(args: Array[String]) = {
        
        def printNums() = {
            val list = List(1,11,111,1111)
            for (i <- list) {
                if (i == 111){
                    break
                }
                if(i != 1) {
                    println(i)
                }
            }
        }
        printNums()
    }
} // LOOPS AND FUNCTIONS