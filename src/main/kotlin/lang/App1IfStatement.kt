package lang


class App1IfStatement {


    companion object {
        class Planet(val name: String, val moons: Int) {

        }

        @JvmStatic
        fun main(args: Array<String>) {
            val planet = Planet("Mercury", 0)
            if (planet.moons == 0) {
                println("${planet.name} has no moons.")
            }
        }
    }
}