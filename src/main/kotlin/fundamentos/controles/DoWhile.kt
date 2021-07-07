package fundamentos.controles

fun main() {
    var opcao: Int = -1

    do {
        val line = readLine()
        opcao = line!!.toIntOrNull() ?: 0
        println("Você escolheu a opção $opcao")
    } while (opcao != -1)

    println("Até a próxima")
}