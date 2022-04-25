fun main() {
    val str = "Programação Kotlin"

    str.uppercase()
    str.lowercase()
    val size = str.length
    with(str) {
        uppercase()
        lowercase()
        val size = length
    }
}