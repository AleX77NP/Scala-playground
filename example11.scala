object ScalaCourse {
    def main(args: Array[String]) = {
        
        val rover = new Animal
        rover.setName("Rover")
        rover.setSound("Woof")

        val fluffy = new Animal("Worry")
        fluffy.setSound("Auf")

        println(rover.toString())
        println(fluffy.getName())
        
        val spike = new Dog("Spike", "Woooof", "Grrrr")
        println(spike.toString())

        val woffy = new Wolf("Arun")
        println(woffy.move)
    }

    abstract class Creature(val name: String){
        var moveSpeed: Double
        def move: String
    }

    class Wolf(name: String) extends Creature(name){
        var moveSpeed = 42.4
        def move = "%s moves at speed %.2f".format(this.name, this.moveSpeed)
    }

    class Animal(var name: String, var sound: String) {
        this.setName(name)

        val id = Animal.newIdNum

        def getName() : String = name
        def getSound(): String = sound

        def setName(name: String) = {
            if(!(name.matches(".*\\d+.*")))
                this.name = name
            else
                this.name = "No Name"
        }

        def setSound(sound: String) = {
            this.sound = sound
        }

        def this(name: String) = {
            this("No Name", "No Sound")
            this.setName(name)
        }

        def this() = {
            this("No Name", "No Sound")
        }

        override def toString() : String = {
            return "%s with the id %d says %s".format(this.name, this.id, this.sound)
        }

    }

    object Animal {
        private var idNumber = 0
        private def newIdNum = { idNumber += 1; idNumber }
    }

    class Dog(name: String, sound: String, growl: String) extends Animal(name, sound) {
        def this(name: String, sound: String) = {
            this("No Name", sound, "No Growl")
            this.setName(name)
        }

        def this(name: String) = {
            this("No Name", "No Sound", "No Hrowl")
            this.setName(name)
        }

        def this() = {
            this("No Name", "No Sound", "No Growl")
        }

        override def toString() : String = {
            return "%s with the id %d says %s or %s".format(this.name, this.id, this.sound, this.growl)
        }
    }

} // ABSTRACT AND NORMAL CLASSES