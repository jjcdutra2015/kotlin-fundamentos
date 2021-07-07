package colecoes

data class Fruta(val nome: String, val preco: Double)

fun main() {
    val frutas = arrayListOf(Fruta("Banana", 1.5), Fruta("Morango", 3.20))
    for (fruta in frutas) {
        println("${fruta.nome} - R$ ${fruta.preco}")
    }

    println(frutas.contains(Fruta("Banana", 1.5)))
    println(frutas.distinctBy { it.preco })
}