package avancado

class Caixa<T>(val objeto: T) {
    val objetos = ArrayList<T>()

    init {
        adicionar(objeto)
    }

    fun adicionar(novoObjeto: T){
        objetos.add(novoObjeto)
    }

    override fun toString(): String = objetos.toString()
}

fun main() {
    val materialEscolar = Caixa("Borracha")
    materialEscolar.adicionar("Lapis")
    materialEscolar.adicionar("Apontador")
    println(materialEscolar)

    val numeros = Caixa(objeto = 1)
    numeros.adicionar(novoObjeto = 2)
    numeros.adicionar(novoObjeto = 3)
    println(numeros)
}