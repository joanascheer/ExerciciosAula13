package exercicio4Aula13

fun mostraNumerosPares (vetorNumerico: IntArray) {
    for (i: Int in vetorNumerico.indices) {
        if (vetorNumerico[i] % 2 == 0) {
            println("O número ${vetorNumerico[i]} é par e está na posição $i")
        }
    }
}