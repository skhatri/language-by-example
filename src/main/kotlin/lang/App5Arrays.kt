package lang

class App5Arrays {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val planets = mutableListOf("Mercury", "Venus", "Earth", "Mars")
            planets.add("Jupiter")
            planets.removeAt(1)
            println("Planets: ${planets.joinToString(", ")}")
        }
    }
}