package fundamentos.controles

fun main() {
    for (i in 0..100 step 10) {
        println(i)
    }

    println()
    for (i in 100 downTo 0 step 20) {
        println(i)
    }
}