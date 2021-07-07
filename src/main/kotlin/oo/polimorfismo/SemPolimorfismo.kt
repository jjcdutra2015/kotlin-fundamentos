package oo.polimorfismo

class Feijao2(val peso: Double)
class Arroz2(val peso: Double)

class Pessoa2(var peso: Double) {
    fun comer(feijao: Feijao2) {
        peso += feijao.peso
    }

    fun comer(arroz: Arroz2) {
        peso += arroz.peso
    }
}

fun main() {
    val arroz = Arroz2(0.3)
    val feijao = Feijao2(0.3)

    val pessoa = Pessoa2(80.0)
    pessoa.comer(arroz)
    pessoa.comer(feijao)
    println(pessoa.peso)
}