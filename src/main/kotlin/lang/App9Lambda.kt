package lang

class App9Lambda {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solarSystem = SolarSystem()
            val multiMoonPlanets = solarSystem.planets.filter { p -> p.moons > 1 && p.moons < 30 }
            println("Planets with more than one moon: ${multiMoonPlanets.map{p->p.name}.joinToString(", ")}")
        }
    }
}