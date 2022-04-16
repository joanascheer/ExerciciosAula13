package exercicio8Aula13

fun verificaNumero (numeroDigitado: Int, sequenciaFibonacci: IntArray) {

    for (i in sequenciaFibonacci.indices) {
        if (numeroDigitado == sequenciaFibonacci[i]) {
            println("O número ${sequenciaFibonacci[i]} está na posição ${i+1} da Sequência de Fibonacci")
        } else {

        }
    }

}