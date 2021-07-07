package lambdas

import fundamentos.soma

class Calculadora2 {
    var resultado = 0;

    fun somar(a: Int, b: Int) {
        resultado += a + b
    }

    fun add(valor: Int) {
        resultado += valor
    }
}


fun main() {
    val calcular = Calculadora2()
    calcular.apply { somar(5, 4) }.apply { add(5) }.apply { println(resultado) }

    calcular.apply {
        somar(5, 4)
        add(5)
        println(resultado)
    }

    // inline function
    with(calcular) {
        somar(5, 4)
        add(5)
        println(resultado)
    }
}