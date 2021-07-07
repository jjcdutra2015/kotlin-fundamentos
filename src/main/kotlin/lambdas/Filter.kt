package lambdas

data class Aluno(val nome: String, val nota: Double)

fun main() {
    val alunos = arrayListOf(
        Aluno(nome = "Pedro", nota = 7.4),
        Aluno(nome = "Artur", nota = 8.0),
        Aluno(nome = "Rafael", nota = 9.7),
        Aluno(nome = "Ricardo", nota = 5.7)
    )

    val aprovados = alunos.filter { it.nota >= 7 }.sortedBy { it.nome }
    println(aprovados)
}