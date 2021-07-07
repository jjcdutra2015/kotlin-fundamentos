package avancado

import java.lang.IllegalArgumentException

fun fatorial(num: Int): Int = when(num) {
    in 0..1 -> 1
    in 2..Int.MAX_VALUE -> num * fatorial(num - 1)
    else -> throw IllegalArgumentException("Número inválido")
}

fun main() {
    println("Fatorial: ${fatorial(5)}")
}
