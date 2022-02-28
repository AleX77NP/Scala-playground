object ScalaCourse {
    def main(args: Array[String]) = {
        
        val employees = Map("Manager" -> "Bobby",
        "CEO" -> "Philip")

        if(employees.contains("Manager")){
            println(employees("Manager"))
        }

        val customers = collection.mutable.Map(100 -> "Paul", 200 -> "Jimmy")

        printf("Customer one: %s", customers(100))

        customers(300) = "Tony"

        for((k, v) <- customers) {
            printf("%d : %s", k, v)
        }
    }
} // MAPS