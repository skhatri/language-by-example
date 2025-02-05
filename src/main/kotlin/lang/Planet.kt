package lang

data class Planet(
    val name: String,
    val `type`: String,
    val moons: Int,
    val orbitDuration: Float,
    val nickname: String,
    val tilt: Float,
    val distanceFromSun: Float,
    val diameter: Float,
) {
    fun describe(): String {
        return "${this.name} is a ${this.type} planet, known as ${this.nickname}. It has ${this.moons} moon(s) and orbits the Sun in ${this.orbitDuration} days."
    }

    fun lightTravelTime(): Float {
        val speedOfLight = 299792;
        return distanceFromSun * 1_000_000 / speedOfLight;
    }
}