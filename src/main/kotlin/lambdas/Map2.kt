package lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
    Produto(nome = "Borracha", preco = 1.70),
    Produto(nome = "Lápis", preco = 0.85),
    Produto(nome = "Caneta", preco = 2.30),
    Produto(nome = "Apontador", preco = 0.9),
)

fun main() {
    val totalizar = { total: Double, atual: Double -> total + atual }
    val preco = materialEscolar.map { it.preco }.reduce(totalizar)
    println("O preço média é : ${preco / materialEscolar.size}")
}