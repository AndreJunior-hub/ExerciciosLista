fun main(args: Array<String>) {
    // exercicio 5

    var result = 0

    do{
        println("Digite um valor diferente de 0, caso queira sair do programa digite 0: ")
        val num = readln().toInt()
        result = result + num
    }while ( num != 0)

    println ("A soma de todos os numero digitados é de: $result")

}
