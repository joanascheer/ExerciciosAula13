package exercicio5Aula13

fun montandoListaDeCompras () {
    var quantidadeDeItens: Int = 0

    println("Quantos itens deseja adicionar à sua lista? ")
    quantidadeDeItens = readln().toInt()

    var listaDeCompras = arrayOfNulls<String>(quantidadeDeItens)

    for (i: Int in listaDeCompras.indices) {
        println("Digite o item ${i + 1} de $quantidadeDeItens")
        listaDeCompras[i] = readln()
    }

    println("***Lista de Compras *** \n")

    for (i: Int in listaDeCompras.indices) {
        println("Item ${i + 1}: listaDeCompras[i]")
    }
}