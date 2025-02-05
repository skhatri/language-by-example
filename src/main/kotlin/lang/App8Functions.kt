package lang

import java.math.RoundingMode
import java.text.DecimalFormat

class App8Functions {

    companion object {
        fun lightTravelTime(distanceFromSun: Float): Float {
            val speedOfLight = 299792;
            return distanceFromSun * 1_000_000 / speedOfLight;
        }

        @JvmStatic
        fun main(args: Array<String>) {

            println(
                "Light takes about ${
                    lightTravelTime(149.6f).toBigDecimal().setScale(2, RoundingMode.UP).toFloat()
                } seconds to reach Earth."
            )
        }
    }
}