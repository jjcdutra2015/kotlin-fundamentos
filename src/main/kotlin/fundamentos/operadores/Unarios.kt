package fundamentos.operadores

fun main() {
    var num1 = 1
    var num2 = 2

    num1++
    println(num1)
    --num1
    println(num1)

    println(++num1 == num2--)
    println(num1 == num2)
}