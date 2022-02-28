import scala.math._

object ScalaCourse {
    def main(args: Array[String]) = {

        val log10Func = log10 _ 

        println(log10Func(1000))

        List(1000.0, 10000.0).map(log10Func).foreach(println)

        List(1,2,3,4).map((x: Int) => x * 50).foreach(println)

        List(1,2,3,4,5).filter(_ % 2 == 0).foreach(println)

        def times3(num: Int) = num * 3

        def times4(num: Int) = num * 4

        def multIt(func: (Int) => Double, num: Int) = {
            func(num)
        }

        println(multIt(times3, 5))
        println(multIt(times4, 5))

        val divisor = 5

        val divisor5 = (num: Double) => num / divisor
        println(divisor5(5))
    }
} // HIGHER ORDER FUNCTIONS 