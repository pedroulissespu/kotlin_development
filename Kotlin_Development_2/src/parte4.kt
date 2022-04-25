fun main() {
    val pessoa1: Pessoa1 = Pessoa1()

    val pessoa2: Pessoa2 = Pessoa2("Tony", 1975)
    pessoa2.nome
}

class Pessoa1

class Pessoa2(var nome: String, val anoNascimento: Int)

class Pessoa3(var nome: String, val anoNascimento: Int, val fome: Boolean = false) {
    fun saudacao() {
        println("Meu nome é ${this.nome}")
    }
}