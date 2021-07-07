package classes

class Pessoa1(var nome: String)
class Pessoa2(val nome: String)
class Pessoa3(nomeInicial: String) {
    val nome = nomeInicial
}

fun main() {
    val p1 = Pessoa1(nome = "Julio")
    p1.nome = "Jose"
    println("${p1.nome} sabe programar")

    val p2 = Pessoa2("Carvalho")
    val p3 = Pessoa3(nomeInicial = "Dutra")
    println("${p2.nome} e ${p3.nome} são legais")
}