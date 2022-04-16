package exercicio7Aula13

fun montaListaDeNotas (numeroDeAlunos: Int, listaDeNotas: DoubleArray) {

    var contador = 0
    while (contador < numeroDeAlunos) {

        println("Digite a nota do aluno ${contador + 1}")
        listaDeNotas[contador] = readln().toDouble()

        contador ++
    }
}