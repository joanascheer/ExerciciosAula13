package exercicio10Aula13

fun somaNumeros() {
    var contador = 1
    var soma = 0

    do {
        soma += contador
        contador ++
        println(soma)

    } while (contador < 15)
}