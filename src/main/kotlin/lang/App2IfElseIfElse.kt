package lang

class App2IfElseIfElse {
    data class Planet(val name: String, val type: String) {
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val planet = Planet("Jupiter", "gas giant")
            val suffix = if (planet.type == "terrestrial") {
                "a terrestrial planet."
            } else if (planet.type == "gas giant") {
                "a gas giant"
            } else {
                "another type of planet"
            }
            println("${planet.name} is $suffix")
        }
    }
}