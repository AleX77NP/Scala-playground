import scala.collection.mutable.ArrayBuffer

object ScalaCourse {
    def main(args: Array[String]) = {

        val arr = new Array[Int](20)

        val friends = Array("Bob", "Max")

        friends(0) = "Susy"

        println(friends(1))

        val arr2 = new ArrayBuffer[String]()
        arr2.insert(0, "Apple")
        arr2 += "Marco"
        arr2 ++= Array("Orange", "Strawberry")

        var s : String = " "

        for(s <- arr2)
            println(s)

        val nums = Array(1,2,3,4,5,6,7,8,9,10)

        val dnums = for(n <- nums) yield n * 2

        for(i <- 0 to (dnums.length - 1))
            println(dnums(i))

        dnums.foreach(println)

        var favNums = for(n <- nums if n % 4 == 0) yield n

        favNums.foreach(println)

        var matrix = Array.ofDim[Int](3,3)
        for (i <- 0  to 2){
            for (j <- 0 to 2){
                matrix(i)(j) = i * j
            }
        }

        for (i <- 0  to 2){
            for (j <- 0 to 2){
                printf("%d", matrix(i)(j))
            }
        }

        println("Sum  of fav nums" + favNums.sum)
        println("Min  of fav nums" + favNums.min)
        println("Max  of fav nums" + favNums.max)

        val sortedNums = nums.sortWith(_>_) //desc, < for asc

        println(sortedNums.mkString(", "))

    }
} // ARRAYS