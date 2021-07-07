package classes

class Filme {
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String) {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme(nome = "O poderos chefão", anoLancamento = 1972, genero = "Drama")
    println("O ${filme.genero} ${filme.nome} foi lançado em ${filme.anoLancamento}")
}