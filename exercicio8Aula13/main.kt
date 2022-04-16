package exercicio8Aula13

fun main() {

    println("Que número deseja consultar? ")
    val numeroDigitado = readln().toInt()

    val sequenciaFibonacci = IntArray(1000000)

    preencheSequenciaDeFibonacci(sequenciaFibonacci)
    verificaNumero(numeroDigitado, sequenciaFibonacci)

}





/*
* Desenvolva um programa que leia um valor e apresente o número de
Fibonacci correspondente a este valor lido. Lembre-se que os 2 primeiros
elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma
dos 2 anteriores a ele. No final imprima a mensagem "Fib(N) = X", onde X é
o N-ésimo termo da série de Fibonacci.
* */