package exercicio7Aula13

fun calculaMedia (numeroDeAlunos: Int, listaDeNotas: DoubleArray) {

    var media = 0.0
    var soma = 0.0
    for (i: Int in listaDeNotas.indices) {
        soma += listaDeNotas[i]
        media = soma / numeroDeAlunos
    }

    println("A média da sala é $media")
}