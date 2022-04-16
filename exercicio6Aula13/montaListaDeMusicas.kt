package exercicio6Aula13

fun montaListaDeMusicas () {
    var listaDeMusicas = ArrayList <String>(3)

    println("Digite o nome da banda: ")
    val nomeDaBanda = readln()

    for (i: Int in 0..2) {
        println("Adicione a música ${i + 1}")
        listaDeMusicas.add(readln())
    }

    println("Nome da banda: $nomeDaBanda \n")

    for (i: Int in listaDeMusicas.indices) {
        println("Música ${i + 1}: ${listaDeMusicas[i]}")
    }

}
