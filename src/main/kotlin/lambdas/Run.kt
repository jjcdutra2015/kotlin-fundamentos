package lambdas

data class Casa(var endereco: String = "", var num: Int = 0)

fun main() {
    val casa = Casa()
    casa.run {
        endereco = "Rua Jorge"
        num = 369
    }
    println(casa)
}