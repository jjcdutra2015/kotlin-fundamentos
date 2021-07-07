package lambdas

fun main() {
    val listWithNulls: List<String?> = listOf("A", null, "B", null, "C")

    for (item in listWithNulls) {
        item?.let { println(it) }
    }
}