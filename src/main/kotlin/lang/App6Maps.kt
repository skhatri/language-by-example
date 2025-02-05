package lang

class App6Maps {
    data class Planet(
        val `type`: String,
        val moons: Int,
        val orbitDuration: Float,
        val nickname: String,
        val tilt: Float,
        val distanceFromSun: Float
    )

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val planetData = mutableMapOf<String, Planet>()
            planetData.put(
                "Earth", Planet(
                    "terrestrial", 1, 365f, "The Blue Planet", 23.5f, 149.6f
                )
            )
            planetData.put(
                "Mars", Planet(
                    "terrestrial", 2, 687f, "The Red Planet", 25.2f, 227.9f
                )
            )
            val earth = planetData["Earth"]
            println("Earth's nickname is ${earth?.nickname} and it has ${earth?.moons} moon(s).")

            for ((planet, data) in planetData) {
                println("$planet: $data")
            }

            println("Is Mars in the list? ${planetData.containsKey("Mars")}")
            planetData.remove("Mars")
        }
    }
}