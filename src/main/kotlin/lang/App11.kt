package lang

class App11 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val solarSystem = SolarSystem()
            println("All Planets:")
            solarSystem.listPlanets();


            println("Planets sorted by name:")
            solarSystem.sortPlanets("name").forEach { p -> println(p.name) }

            println("Planets sorted by distance from Sun:")
            solarSystem.sortPlanets("distance").forEach { p -> println("${p.name}: ${p.distanceFromSun}") }

            println("Volume Comparison:")
            println(solarSystem.comparePlanetsByVolume("Earth", "Mars"))
            println(solarSystem.comparePlanetsByVolume("Jupiter", "Earth"))
            println(solarSystem.comparePlanetsByVolume("Saturn", "Mercury"))
            println(solarSystem.comparePlanetsByVolume("Jupiter", "Uranus"))

            solarSystem.planets.forEach { p ->
                println(solarSystem.comparePlanetsByVolume(p.name, "Jupiter"))
            }
            solarSystem.planets.forEach { p ->
                println(solarSystem.comparePlanetsByVolume(p.name, "Earth"))
            }

            println("Nearest Neighbor:")
            println(solarSystem.findNearestNeighbour("Earth"))
            println(solarSystem.findNearestNeighbour("Mars"))
            for (planet in solarSystem.planets) {
                println(solarSystem.findNearestNeighbour(planet.name))
            }

            println("Distance between:")
            println(solarSystem.distanceBetween("Sun", "Mercury"))
            println(solarSystem.distanceBetween("Mercury", "Venus"))
            println(solarSystem.distanceBetween("Venus", "Earth"))
            println(solarSystem.distanceBetween("Earth", "Mars"))
            println(solarSystem.distanceBetween("Mars", "Jupiter"))
            println(solarSystem.distanceBetween("Jupiter", "Saturn"))
            println(solarSystem.distanceBetween("Saturn", "Neptune"))
            println(solarSystem.distanceBetween("Neptune", "Uranus"))
            println(solarSystem.distanceBetween("Uranus", "Pluto"))

            println(solarSystem.distanceBetween("Sun", "Earth"))
        }
    }
}