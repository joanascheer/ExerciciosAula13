package exercicio8Aula13

fun preencheSequenciaDeFibonacci (sequenciaFibonacci: IntArray) {
    var contador = 0
    var atual = 0
    var proximo = 1

    while (contador < sequenciaFibonacci.size ) {
        val soma = atual + proximo
        sequenciaFibonacci[contador] = atual
        atual = proximo
        proximo = soma
        contador++
    }
}