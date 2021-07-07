package colecoes

fun main() {
    val map = HashMap<Long, String>()
    map.put(10020030010, "Julio")
    map.put(20030040020, "Jose")
    map.put(30070080030, "Dutra")

    map.put(30070080030, "Carvalho")

    for (par in map) {
        println(par)
    }

    for (nome in map.values) {
        println(nome)
    }

    for (cpf in map.keys) {
        println(cpf)
    }

    for ((cpf, nome) in map) {
        println("$nome: (CPF: $cpf)")
    }

    map.size.print()
    map.get(30070080030)?.print()
    map[30070080030]?.print()
    map.contains(30070080030).print()
    map.remove(30070080030)?.print()
    map.clear()
    map.isEmpty().print()
}