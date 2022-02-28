object ScalaCourse {
    def main(args: Array[String]) = {
    
        def getSum(num1: Int = 0, num2: Int = 0): Int = {
            return num1 + num2
        }

        println(getSum(5,5))

        def say(): Unit = {
            println("Hi")
        }

        say()

        def sum(args: Int*): Int = {
            var sum = 0
            for(i  <- args) {
                sum += i
            }
            sum
        }

        println(sum(1,2,4,5))
    }
} // FUNCTIONS