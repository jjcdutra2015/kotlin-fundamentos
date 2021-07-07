package fundamentos.controles

fun main() {
    val num1: Int = 7
    val num2: Int = 5

    val maiorValor = if (num1 > num2) {
        println("Processando if...")
        num1
    } else {
        println("Processando else...")
        num2
    }

    println("O mario valor é $maiorValor.")
}