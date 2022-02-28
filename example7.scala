object ScalaCourse {
    def main(args: Array[String]) = {

        def factorial(num: BigInt): BigInt = {
            if(num <=1) 
                1
            else
                num * factorial(num-1)
        }

        println(factorial(12))

    }
} // RECURSION