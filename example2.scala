object ScalaCrash {
    def main(args: Array[String]) = {
        var letters = "Abcd"

    for( i <- 0 until letters.length)
        println(letters(i))
    }

    val list = List(1,11,121,564,2443)

    for (k <- list){
        println("item " + k)
    }

    var eventList = for { j <- 1 to 22 
        if (j % 2) == 0 
        } yield j

    for (m <- eventList)
        println(m)

    for (n <- 1 to 5; s <- 6 to 10) {
        println(n)
        println(s)
    }
} // LISTS