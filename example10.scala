object ScalaCourse {
    def main(args: Array[String]) = {
        
        var tupleMarge = (100, "Marge", 10.34)

        printf("%s owns us $%.2f\n", tupleMarge._2, tupleMarge._3)

        tupleMarge.productIterator.foreach{ i => println(i)}

        println(tupleMarge.toString())

    }
} // TUPLES