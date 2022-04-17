package exercicio9Aula13

import kotlin.system.exitProcess

fun calcula(numero1: Double, numero2: Double) {
    println("Que cálculo deseja fazer entre os dois números?")

    while (true) {
        println("+ - Somar")
        println("- - Subtrair")
        println("* - Multiplicar")
        println("/ - Dividir")
        println("x - Sair \n")

        println("Escolha uma operação matemática: ")

        when (readln()) {
            "+" -> {
                somar(numero1,numero2)
            }
            "-" -> {
                subtrair(numero1,numero2)
            }
            "*" -> {
                multiplicar(numero1,numero2)
            }
            "/" -> {
                dividir(numero1,numero2)
            }
            "x" -> {
                println("Até mais!")
                exitProcess(0)
            }
        }
    }
}