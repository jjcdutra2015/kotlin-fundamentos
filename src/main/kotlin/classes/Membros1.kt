package classes

class Data(var dia: Int, var mes: Int, var ano: Int) {
    fun formatar(): String {
        return "$dia/$mes/$ano"
    }
}

fun main() {
    val nascimento: Data = Data(dia = 14, mes = 4, ano = 1982)
    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")
    with(nascimento) {println("$dia/$mes/$ano")}

    println(nascimento.formatar())
}