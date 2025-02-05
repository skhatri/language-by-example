package lang

class App7Transform {
    data class Planet(val name: String, val nickname: String)

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val planets = listOf(
                Planet("Mercury", "The Swift Planet"),
                Planet("Venus", "The Evening Star"),
                Planet("Earth", "The Blue Planet"),
                Planet("Mars", "The Red Planet")
            )
            val nicknames = planets.map { it.nickname }
            println("Planet nicknames: ${nicknames.joinToString(", ")}")
        }
    }
}