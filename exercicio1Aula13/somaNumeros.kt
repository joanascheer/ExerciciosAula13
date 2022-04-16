package exercicio1Aula13

fun somaNumeros (vetorDeNumeros: IntArray, soma: Int) : Int {
    var vetorDeNumeros = IntArray(5)
    var soma = 0

    for (i in 0..4) {
        println("Digite o número ${i + 1}: ")
        vetorDeNumeros[i] = readln().toInt()
        soma += vetorDeNumeros[i]
    }

    println("A soma dos valores é $soma")
    return soma

}
