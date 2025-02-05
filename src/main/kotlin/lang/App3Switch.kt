package lang

class App3Switch {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val planet: String = "Mars"
            val nickName = when (planet) {
                "Earth" -> "The Blue Planet"
                "Mars" -> "The Red Planet"
                "Jupiter" -> "The Gas Giant"
                else -> "No nickname available"
            }
            println("$planet is known as $nickName")
        }
    }
}