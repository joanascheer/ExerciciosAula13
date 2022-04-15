package exercicio4Aula13

fun preencheVetorNumerico (vetorNumerico: IntArray) {
    for (i: Int in vetorNumerico.indices) {
        println("Digite o número ${i + 1} de 10: ")
        vetorNumerico[i] = readln().toInt()
    }
}