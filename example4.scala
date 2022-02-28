object ScalaCourse {
    def main(args: Array[String]) = {
        
       var numGuess = 0
       while (numGuess != 15)  {
            print("Guess a number: ")
            numGuess = scala.io.StdIn.readLine().toInt
       }

       println(s"You guessed the secret num $numGuess")
    }
} // INPUT