package exercicio2Aula13

fun verificaDiaDaSemana (numeroDigitado: Int) {
    if (numeroDigitado == 1) {
        println("Hoje é Domingo!")
    } else if (numeroDigitado == 2) {
        println("Hoje é Segunda-feira!")
    } else if (numeroDigitado == 3) {
        println("Hoje é Terça-feira!")
    } else if (numeroDigitado == 4) {
        println("Hoje é Quarta-feira!")
    } else if (numeroDigitado == 5) {
        println("Hoje é Quinta-feira!")
    } else if (numeroDigitado == 6) {
        println("Sextou!")
    } else if (numeroDigitado == 7) {
        println("Hoje é sábado")
    } else {
        println("Número inválido!")
    }
}