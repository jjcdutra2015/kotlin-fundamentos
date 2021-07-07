package classes

class Filme2(val nome: String, val anoLancamento: Int, val genero: String)

fun main() {
    val filme = Filme2(nome = "Monstros S.A", anoLancamento = 2001, genero = "Comédia")
    println("A ${filme.genero} ${filme.nome} foi lançada em ${filme.anoLancamento}.")
}