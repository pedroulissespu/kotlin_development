fun main() {
    val receita = Receita()
    println(receita.instrucoes)

    receita.geraReceita()
    println(receita.instrucoes)
}

class Receita {
    lateinit var instrucoes: String

    fun geraReceita() {
        instrucoes = "Lave as mãos."
    }
}