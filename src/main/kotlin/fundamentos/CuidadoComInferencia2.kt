package fundamentos

fun main() {
    // var a = 1 "Kotlin não sobrepoe tipo. Foi inferido como Int e na linha 7 atribuido um Double"
    var a: Double = 1.0
    var b = 2

    a = 2.3

    println(a + b)
}