package exercicio1Aula13

fun somaNumeros (vetorDeNumeros: IntArray, soma: Int) : Int {
    for (i in vetorDeNumeros.indices) {
        println("Digite o número ${i + 1}: ")
        vetorDeNumeros[i] = readln().toInt()
        soma + vetorDeNumeros[i]
    }

    return soma
}