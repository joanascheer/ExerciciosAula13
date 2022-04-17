package exercicio11Aula13

fun calculaMediaDeNumerosDigitados() {

    var soma = 0

    for (i in 1..15) {
        println("Digite o número $i de 15: ")
        val numeroDigitado = readln().toInt()
        soma += numeroDigitado
        val media = soma/15
        if (i == 15) {
            println("A média calculada foi $media")
        } else {
            println()
        }
    }

}
