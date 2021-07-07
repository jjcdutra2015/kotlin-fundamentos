package colecoes

fun main() {
    val aprovados = hashSetOf("Joao", "Maria", "Pedro", "Ana", "Joana")
    // aprovados.add(2)

    println("Sem ordem...")
    for (aprovado in aprovados) {
        aprovado.print()
    }

    val aprovadosOrdem1 = linkedSetOf("Joao", "Maria", "Pedro", "Ana", "Joana")
    println("\nLinked...")
    for (aprovado in aprovadosOrdem1) {
        aprovado.print()
    }

    val aprovadosOrdem2 = sortedSetOf("Joao", "Maria", "Pedro", "Ana", "Joana")
    println("\nSorted...")
    for (aprovado in aprovadosOrdem2) {
        aprovado.print()
    }

    // Ordem maluca
    aprovados.sortedBy { it.substring(1) }.print()
}