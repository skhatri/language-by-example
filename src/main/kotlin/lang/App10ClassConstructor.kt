package lang

class App10ClassConstructor {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solar = SolarSystem()
            val earth = solar.findPlanetByName("Earth")
            println("Description: ${earth?.describe()}")
            println(earth?.lightTravelTime())
        }
    }
}