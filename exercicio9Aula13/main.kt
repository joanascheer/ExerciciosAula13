package exercicio9Aula13

fun main() {
    println("*** Seja bem vindo(a) à sua Calculadora ***")

    println("Digite o primeiro número do seu cálculo: ")
    val numero1 = readln().toDouble()

    println("Digite o segundo número do seu cálculo: ")
    val numero2 = readln().toDouble()

    calcula(numero1,numero2)
}