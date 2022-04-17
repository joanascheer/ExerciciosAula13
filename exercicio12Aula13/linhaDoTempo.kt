package exercicio12Aula13

fun mostraLinhaDoTempo() {

    println("Em que ano você nasceu?")
    var anoDigitado = readln().toInt()
    var idade = 0
    var contador = anoDigitado

    for (i in anoDigitado .. 2021) {
        idade += 1
        anoDigitado += 1
        println("Ano: $anoDigitado - idade: $idade")
    }
}