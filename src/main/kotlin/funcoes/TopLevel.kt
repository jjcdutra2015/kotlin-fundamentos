package funcoes

//fun min(a: Int, b: Int): Int {
//    return if (a < b) a else b
//}

fun min(a: Int, b: Int): Int = if (a < b) a else b

fun main() {
    println("O menor valor é: ${min(3, 2)}")
}