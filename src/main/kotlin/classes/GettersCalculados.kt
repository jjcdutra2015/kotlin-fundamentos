package classes

class Produto(var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean) {
    val inativo: Boolean get() = !ativo
    val precoComDesconto: Double get() = preco * (1 - desconto)
}

fun main() {
    val p1 = Produto(nome = "iPad", preco = 2349.90, desconto = 0.20, ativo = true)
    println(p1.precoComDesconto)

    val p2 = Produto(nome = "Galaxy Note", preco = 2699.49, desconto = 0.50, ativo = false)
    println("${p2.nome}\n\tDe: ${p2.preco}\n\tPor: ${p2.precoComDesconto}")

    if (p2.inativo) {
        p2.preco = 0.0
        println("Depois de inativo: R$ ${p2.precoComDesconto}")
    }
}