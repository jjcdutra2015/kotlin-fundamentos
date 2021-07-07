package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val pol: Int)

fun main() {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)
    println(g1 == g2)

    val tv1 = Televisao(marca = "Samsung", pol = 32)
    val tv2 = Televisao(marca = "Samsung", pol = 32)
    println(tv1 == tv2)
    println(tv1.toString())
    println(tv1.copy())
    println(tv1.copy(pol = 42))

    val (marca, pol) = tv1
    println("$marca, $pol'")
}