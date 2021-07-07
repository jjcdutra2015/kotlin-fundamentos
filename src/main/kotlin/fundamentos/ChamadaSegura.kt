package fundamentos

fun main() {
    val a: Int? = null // safe call operator é o interrogação no Int
    println(a?.dec())
}