package fundamentos

fun main() {
    var vet = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    var i = 0

    while (i < 5) {
        var temp = vet[i]
        vet[i] = vet[9 - i]
        vet[9 - i] = temp
        i = i + 1
    }
    println(i)
}