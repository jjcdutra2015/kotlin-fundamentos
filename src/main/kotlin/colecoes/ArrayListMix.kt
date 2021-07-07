package colecoes

fun main() {
    val listMix = arrayListOf("Julio", 10, 2.4, true, 't')
    for (item in listMix) {
        if (item is String) {
            println("Strings: ${item.uppercase()}")
        } else {
            println("Vários tipos: ${item}")
        }
    }
}