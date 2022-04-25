import java.time.Month
import java.util.*

fun main() {
    for (p in PRIORIDADE.values()) {
        println(p)
    }
    println(PRIORIDADE2.ALTA.id)

}

enum class PRIORIDADE {
    BAIXA {
        override fun toString(): String {
            return "Essa prioridade é baixa."
        }
    },
    MEDIA, ALTA
}

enum class PRIORIDADE2(val id: Int) {
    BAIXA(1), MEDIA(5), ALTA(10)
}