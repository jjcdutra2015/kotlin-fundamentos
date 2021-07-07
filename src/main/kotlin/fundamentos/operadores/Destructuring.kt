package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main() {
    val (marca, modelo) = Carro("Hyndai", "IX35")
    println("$marca, $modelo")

    val (marido, mulher) = listOf("Joao", "Maria")
    println("$marido, $mulher")

    val (_, _, terceiroLugar) = listOf("Kimi", "Hamilton", "Alonso")
    println("$terceiroLugar é o terceiro lugar.")
}