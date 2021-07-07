package fundamentos.controles

fun main() {
    var opcao: Int = 0

    while(opcao != -1) {
        val line = readLine()
        opcao = line!!.toIntOrNull() ?: 0

        println("Você escolheu a opção: $opcao")
    }

    println("Até a próxima!")
}