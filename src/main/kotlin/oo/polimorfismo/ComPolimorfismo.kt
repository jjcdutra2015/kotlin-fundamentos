package oo.polimorfismo

open class Comida(val peso: Double)
class Feijao(peso: Double) : Comida(peso)
class Arroz(peso: Double) : Comida(peso)
class Ovo(peso: Double) : Comida(peso)

class Pessoa(var peso: Double) {
    fun comer(comida: Comida) {
        peso += comida.peso
    }
}

fun main() {
    val arroz = Arroz(0.3)
    val feijao = Feijao(0.3)
    val ovo = Ovo(0.4)

    val pessoa = Pessoa(80.0)
    pessoa.comer(arroz)
    pessoa.comer(feijao)
    pessoa.comer(ovo)
    println(pessoa.peso)
}