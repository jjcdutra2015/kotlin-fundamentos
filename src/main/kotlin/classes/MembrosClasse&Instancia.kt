package classes

class ItemPedido(val nome: String, val preco: Double) {
    companion object {
        fun create(nome: String, preco: Double) = ItemPedido(nome, preco)
        @JvmStatic var desconto: Double = 0.0
    }

    fun precoDesconto(): Double {
        return preco - preco * desconto
    }
}

fun main() {
    val item1 = ItemPedido.create(nome = "TV 50 Polegadas", 2989.90)
    val item2 = ItemPedido(nome = "Liquidificador", 200.0)
    ItemPedido.desconto = 0.10

    println(item1.precoDesconto())
    println(item2.precoDesconto())
}