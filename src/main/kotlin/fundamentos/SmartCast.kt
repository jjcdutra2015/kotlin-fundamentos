package fundamentos

fun souEsperto(x: Any) {
    if (x is String) {
        println(x.toUpperCase())
    } else if (x is Int) {
        println(x.plus(3))
    }
}

fun souEsperto2(x: Any) {
    when(x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("Repense sua vida!")
    }
}

fun main() {
    souEsperto("ola")
    souEsperto(8)

    souEsperto2("opa")
    souEsperto2(7)
}