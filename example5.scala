object ScalaCourse {
    def main(args: Array[String]) = {
        
        var s = "This is some string..."

        println(s.length)
        println(s.concat("and is nice"))

        println(s.equals("ehhehehe"))

        println(s.indexOf("some"))

        val arr = s.toArray
        for(i <- arr) 
            println(i)
    }
} // STRINGS