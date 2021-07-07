package fundamentos.operadores

fun obterResultado(nota: Double): String = if (nota > 7) "Aprovado" else "Reprovado"

fun main() {
    println(obterResultado(6.0))
}