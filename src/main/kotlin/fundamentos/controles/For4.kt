package fundamentos.controles

fun main() {
    val alunos = arrayListOf("Julio", "Jose", "Dutra")
    for ((indice, aluno) in alunos.withIndex()) {
        println("${indice + 1} - $aluno")
    }}