package classes

class Filme3(nome: String, anoDeLancamento: Int, genero: String) {
    val nome: String
    val anoDeLancamento: Int
    val genero: String

    init {
        this.nome = nome
        this.anoDeLancamento = anoDeLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme3(nome = "Os incriveis", anoDeLancamento = 2004, genero = "Ação")
    println("O filme ${filme.nome} de genero ${filme.genero} foi lançado em ${filme.anoDeLancamento}")
}