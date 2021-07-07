package lambdas

interface Operacao {
    fun executar(a: Int, b: Int): Int
}

class Multiplicacao: Operacao {
    override fun executar(a: Int, b: Int): Int {
        return a * b
    }
}

class Calculadora {
    fun calcular(a: Int, b: Int): Int {
        return a + b
    }

    fun calcular(a: Int, b: Int, operacao: Operacao): Int {
        return operacao.executar(a, b)
    }

    fun calcular(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
        return operacao(a, b)
    }
}

fun main() {
    val calc = Calculadora()
    val result1 = calc.calcular(4, 3)
    val result2 = calc.calcular(4, 3, Multiplicacao())

    val subtracao = { a: Int, b: Int -> a - b }
    val result3 = calc.calcular(5, 2, subtracao)

    println("$result1 $result2 $result3")
}