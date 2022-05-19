fun main() {
    var num1 = 0
    var num2 = 0

    print("Insiraa o primeiro numero: ")
    num1 = readLine()!!.toInt()

    print("Insiraa o segundo numero: ")
    num2 = readLine()!!.toInt()

    println("\n---Tabela de Resultados---")
    mais (num1, num2)
    menos (num1, num2)
    multiplicacao (num1, num2)
    divisao (num1, num2)
}

fun menos(num1: Int, num2: Int){
    return println(" A subtração de $num1 e $num2 é: ${num1 - num2}")
}

fun mais(num1: Int, num2: Int){
    return println(" A adicao de $num1 e $num2 é: ${num1 + num2}")
}

fun multiplicacao(num1: Int, num2: Int){
    return println(" A multiplicacao de $num1 e $num2 é: ${num1 * num2}")
}

fun divisao(num1: Int, num2: Int){
    return println(" A divisao de $num1 e $num2 é: ${(num1 / num2).toDouble()}")
}