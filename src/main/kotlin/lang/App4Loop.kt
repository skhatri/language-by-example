package lang

class App4Loop {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val planets = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
            planets.forEach { planet ->
                println(planet)
            }
        }
    }
}