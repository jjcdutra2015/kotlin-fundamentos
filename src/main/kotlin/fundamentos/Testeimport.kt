package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main() {
    println(funcaoSimples("ok"))

    val coisa = Coisa("Ola")
    println(coisa.nome)

    println(CARA)

    println("Soma: ${soma(4, 5)} | Subtração: ${subtracao(6, 2)}")
}