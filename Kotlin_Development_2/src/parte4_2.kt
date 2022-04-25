fun main() {
    val p1 = Pessoa4("Davy Jones")
    val p2 = Pessoa4("Davy Jones", 54)
}

class Pessoa4(val nome: String) {

    private var idade: Int? = null

    constructor(nome: String, idade: Int) : this(nome) {
        this.idade = idade
    }

    fun saudacoes() {
        println("Meu nome é $nome e tenho $idade")
    }

}
class Pessoa5 private constructor(val nome: String) {
}