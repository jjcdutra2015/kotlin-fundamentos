package avancado

annotation class Positivo
annotation class NaoVazio

class Pessoa(id: Int, nome: String) {
    @Positivo
    val id: Int = id

    @NaoVazio
    val nome = nome
}

// Refletion...
fun getValor(objeto: Any, nomeDoAtributo: String): Any {
    val atributo = objeto.javaClass.getDeclaredField(nomeDoAtributo)
    val estaAcessivel = atributo.isAccessible

    atributo.isAccessible = true
    val valor = atributo.get(objeto)
    atributo.isAccessible = estaAcessivel

    return valor
}

fun validar(objeto: Any): List<String> {
    val msgs = ArrayList<String>()
    objeto::class.members.forEach { member ->
        member.annotations.forEach { annotation ->
            val valor = getValor(objeto, member.name)
            when(annotation) {
                is Positivo ->
                    if (valor !is Int || valor <= 0) {
                        msgs.add("O valor $valor não é um número positivo.")
                    }
                is NaoVazio ->
                    if (valor !is String || valor.trim().isEmpty()) {
                        msgs.add("O valor $valor não é uma string válida.")
                    }
            }
        }
    }
    return msgs
}

fun main() {
    val pessoa1 = Pessoa(1, "Julio")
    println(validar(pessoa1))

    val pessoa2 = Pessoa(-1, "")
    println(validar(pessoa2))
}