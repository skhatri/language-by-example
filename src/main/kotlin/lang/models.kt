package lang;

import java.math.RoundingMode
import java.util.*
import kotlin.math.abs
import kotlin.math.pow

class SolarSystem() {
    val planets = mutableListOf<Planet>()
    fun addPlanet(planet: Planet) {
        this.planets.add(planet)
    }

    init {
        addPlanet(
            Planet(
                "Mercury",
                "terrestrial",
                0,
                88f,
                "Swift Planet",
                0.03f,
                57.91f,
                4879f
            )
        )
        addPlanet(
            Planet(
                "Venus",
                "terrestrial",
                0,
                225f,
                "Morning Star",
                177.4.toFloat(),
                108.2.toFloat(),
                12104f
            )
        )
        addPlanet(
            Planet(
                "Earth",
                "terrestrial",
                1,
                365f,
                "The Blue Planet",
                23.5.toFloat(),
                149.6.toFloat(),
                12742f
            )
        )
        addPlanet(
            Planet(
                "Mars",
                "terrestrial",
                2,
                687f,
                "The Red Planet",
                25.2.toFloat(),
                227.9.toFloat(),
                6779f
            )
        )
        addPlanet(
            Planet(
                "Jupiter",
                "gas giant",
                79,
                4333f,
                "The Gas Giant",
                3.1.toFloat(),
                778.5.toFloat(),
                139820f
            )
        )
        addPlanet(
            Planet(
                "Saturn",
                "gas giant",
                83,
                10759f,
                "The Ringed Planet",
                26.7.toFloat(),
                1434f,
                116460f
            )
        )
        addPlanet(
            Planet(
                "Uranus",
                "ice giant",
                27,
                30687f,
                "The Sideways Planet",
                97.8.toFloat(),
                2871f,
                50724f
            )
        )
        addPlanet(
            Planet(
                "Neptune",
                "ice giant",
                14,
                60190f,
                "The Windy Planet",
                28.3.toFloat(),
                4495f,
                49244f
            )
        )
        addPlanet(
            Planet(
                "Pluto",
                "dwarf planet",
                5,
                90560f,
                "The Icy Dwarf",
                122.5.toFloat(),
                5906.4.toFloat(),
                2376f
            )
        )


    }

    fun listPlanets() {
        this.planets.forEach { p ->
            println(p.describe())
        }
    }

    fun findPlanetByName(name: String): Planet? {
        return this.planets.find { p -> p.name.lowercase(Locale.getDefault()) == name.lowercase(Locale.getDefault()) }
    }

    fun sortPlanets(by: String): List<Planet> {
        return if (by == "name") {
            this.planets.sortedBy { p ->
                p.name
            }
        } else {
            this.planets.sortedBy { p -> p.distanceFromSun }
        }
    }

    fun comparePlanetsByVolume(p1: String, p2: String): String {
        val planet1 = this.findPlanetByName(p1)
        val planet2 = this.findPlanetByName(p2)
        if (planet1 == null || planet2 == null) {
            return "One or both planets not found."
        }
        if (planet1 == planet2) {
            return ""
        }
        val volume1 = (4.0 / 3.0) * Math.PI * (planet1.diameter.toDouble() / 2).pow(3.0)
        val volume2 = (4.0 / 3.0) * Math.PI * (planet2.diameter.toDouble() / 2).pow(3.0)

        val (larger, smaller, ratio) = if (volume1 > volume2) {
            Triple(planet1, planet2, volume1 / volume2)
        } else {
            Triple(planet2, planet1, volume2 / volume1)
        }
        return "${smaller.name} can fit approximately ${ratio.toBigDecimal().setScale(1, RoundingMode.UP).toFloat()} inside ${larger.name}."
    }

    fun findNearestNeighbour(planetName: String): String {
        val planet = findPlanetByName(planetName) ?: return "not found"
        val nearest = this.planets.filter { p -> p.name != planetName }
            .minBy { abs(it.distanceFromSun - planet.distanceFromSun) }
        return "The nearest neighbour to ${planet.name} is ${nearest.name}, located ${
            abs(nearest.distanceFromSun - planet.distanceFromSun).toBigDecimal().setScale(1, RoundingMode.UP)
        } million km away."
    }

    fun distanceBetween(p1: String, p2: String): String {

        val a = if (p1.lowercase() == "sun") 0f else this.findPlanetByName(p1)!!.distanceFromSun
        val b = if (p2.lowercase() == "sun") 0f else this.findPlanetByName(p2)!!.distanceFromSun

        val dist = Math.abs(a - b).toBigDecimal().setScale(1, RoundingMode.UP).toFloat()
        return "Distance between $p1 and $p2 is $dist million km away."
    }
}

