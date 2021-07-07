package fundamentos

fun soma(a: Int, b: Int = 1): Int {
    return a + b
}

fun main() {
    println(soma(5, 4))
    println(soma(11))
}