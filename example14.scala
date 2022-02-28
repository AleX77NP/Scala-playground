import java.io.PrintWriter
import scala.io.Source

object ScalaCourse {
    def main(args: Array[String]) = {

        val writer = new PrintWriter("test.txt")
        writer.write("Random test.\nMore information")
        writer.close()

        val txt = Source.fromFile("test.txt", "UTF-8")

        val lineIterator = txt.getLines

        for(line <- lineIterator)
            println(line)

        txt.close()
    }
} // FILE I/O