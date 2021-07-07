package classes

class Calculadora {
    private var resultado = 0

    fun somar(vararg valores: Int): Calculadora {
        valores.forEach { resultado += it }
        return this
    }

    fun multiplicar(valor: Int): Calculadora {
        resultado *= valor
        return this
    }

    fun print(): Calculadora {
        println(resultado)
        return this
    }

    fun limpar(): Calculadora {
        resultado = 0
        return this
    }

    fun obterResultado(): Int {
        return resultado
    }
}

fun main() {
    val calculadora = Calculadora()
    calculadora.somar(1, 2, 2).multiplicar(7).print()
    calculadora.multiplicar(5).print().limpar()
    println(calculadora.obterResultado())
}