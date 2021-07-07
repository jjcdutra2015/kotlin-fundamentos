package colecoes

class Objeto(val nome: String, val descricao: String) {
    override fun hashCode(): Int {
        return nome.length
    }

    override fun equals(other: Any?) = if (other is Objeto) {
        nome.equals(other.nome, ignoreCase = true)
    } else {
        false
    }
}

fun main() {
    val produtos = hashSetOf(
        Objeto(nome = "Faca", descricao = "..."),
        Objeto(nome = "Garfo", descricao = "..."),
        Objeto(nome = "Colher", descricao = "...")
    )

    produtos.contains(Objeto(nome = "Faca", descricao = "...")).print()
}