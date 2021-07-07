package classes

//fun porReferencia(velocidade: Int) {
//    velocidade++
//}

data class Carro(var marca: String, var modelo: String, var velocidade: Int = 0)

fun porReferencia(carro: Carro) {
    carro.velocidade++
}

fun main() {
    var carro1 = Carro(marca = "Ford", modelo = "Fusion")

    var carro2 = carro1
    carro2.modelo = "Edge"
    println(carro1)

    carro1 = Carro(marca = "Audi", modelo = "A4")
    println(carro1)

    porReferencia(carro1)
    porReferencia(carro2)

    println(carro1)
    println(carro2)
}