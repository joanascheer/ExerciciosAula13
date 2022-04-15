package exercicio5Aula13

fun main() {

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




/*
* Faça um programa que receba de lista de compras sendo que a
pessoa usuária irá inserir a quantidade de itens que quer adicionar
na lista de compras e após inserir a quantidade o programa deverá
permitir que o usuário insira os produtos nessa lista. Exiba a lista
completa para o usuário.
* */