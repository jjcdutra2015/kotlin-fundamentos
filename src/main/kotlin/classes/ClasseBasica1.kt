package classes

class Cliente {
    var nome: String = ""
}

fun main() {
    val cliente = Cliente()
    cliente.nome = "Julio"
    println("o cliente é ${cliente.nome}")
}