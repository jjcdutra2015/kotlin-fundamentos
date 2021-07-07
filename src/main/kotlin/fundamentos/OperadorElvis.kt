package fundamentos

fun main() {
    val opicional: String? = null
    val obrigatorio: String = opicional ?: "Valor padrão"

    println(obrigatorio)
}