package fundamentos.operadores

fun main() {
    val executouTrabalho1: Boolean = true
    val executouTrabalho2: Boolean = true

    val tomarSorvete: Boolean = executouTrabalho1 || executouTrabalho2
    val comprarTv50: Boolean = executouTrabalho1 && executouTrabalho2
    val comprarTv32: Boolean = executouTrabalho1 xor executouTrabalho2

    println(tomarSorvete)
    println(comprarTv50)
    println(comprarTv32)

    //Operador unário
    if (!tomarSorvete) {
        println("A saúde agradece")
    }
}