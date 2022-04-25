fun main() {

    val datat1 = TrianguloDataClass(15f, 15f, 15f)
    val t1 = Triangulo(15f, 15f, 15f)

    val datat2 = TrianguloDataClass(15f, 15f, 15f)
    val t2 = Triangulo(15f, 15f, 15f)
    println(datat1.toString())
    println(t1.toString())
    println("----------")
    println(datat1 == datat2)
    println(t1 == t2)
    println("----------")
    println("${datat1.hashCode()} - ${datat2.hashCode()}")
    println("${t1.hashCode()} - ${t2.hashCode()}")
    println("----------")
    datat1.copy(a = 14f)
}

class Triangulo(var a: Float, var b: Float, var c: Float)
data class TrianguloDataClass(var a: Float, var b: Float, var c: Float)