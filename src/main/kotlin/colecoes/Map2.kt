package colecoes

fun main() {
    val map = hashMapOf(1 to "Julio", 2 to "Jose", 3 to "Dutra")
    for (par in map) {
        println(par)
    }

    for (id in map.keys) {
        println(id)
    }

    for ((id, nome) in map) {
        println("$id - $nome")
    }
}