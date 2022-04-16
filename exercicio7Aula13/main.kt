package exercicio7Aula13

import exercicio1Aula13.somaDosNumeros

fun main() {

    println("Quantos alunos tem na sua turma? ")
    var numeroDeAlunos = readln().toInt()

    val listaDeNotas = DoubleArray (numeroDeAlunos)

    montaListaDeNotas(numeroDeAlunos, listaDeNotas)
    calculaMedia(numeroDeAlunos, listaDeNotas)

}






/*
*   Escreva um programa que pergunte para a pessoa usuária quantos alunos
tem na sala dela. Em seguida, através de um laço while, pessa a pessoa
usuária para que entre com as notas de todos os alunos da sala, um por
vez. Por fim, o programa mostra a nota média da turma
* */