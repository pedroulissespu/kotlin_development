fun main() {

}

class Planeta {
    var nome: String = ""
        get() {
            println("Meu valor é $field")
            return field
        }
        set(value) {
            if (value == "") {
                println("Todo planeta deve ter um nome.")
            } else {
                field = value
            }
        }
}