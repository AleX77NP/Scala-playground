object ScalaCourse {
    def main(args: Array[String]) = {
        
        val superman = new Hero("Superman")
        println(superman.fly)
        println(superman.hitByBullet)
        println(superman.counter)
    }

    trait Flyable {
        def fly : String
    }

    trait BulletProof {
        def hitByBullet: String
        def counter: String = "Counter attack!"
    }

    class Hero(val name: String) extends Flyable with BulletProof {
        def fly = "%s flys !!!".format(this.name)

        def hitByBullet = "The bullet has no effect on %s".format(this.name)
    }
} // TRAITS