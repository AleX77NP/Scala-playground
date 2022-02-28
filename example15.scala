object ScalaCourse {
    def main(args: Array[String]) = {

        def divideNums(num1: Int, num2: Int) = try {
            (num1 / num2)
        } catch {
            case ex: java.lang.ArithmeticException => "Can't divide by 0"
        } finally {
            // cleanup
        }

        println(divideNums(5,0))
    }
} // EXCEPTION HANDLING