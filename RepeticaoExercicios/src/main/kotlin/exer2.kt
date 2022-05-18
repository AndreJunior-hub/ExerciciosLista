fun main(args: Array<String>) {
    // exercicio
    var par = 0
    var impar = 0


    for(i in 1..3){
        println("Digite um numero: ")
        val num = readln().toInt()

        if((num % 2) == 0){
            par += 1

        }else{
            impar += 1
        }
    }// fim do for

    println("Quantidade de numeros: $par")
    print("Quantidade de numeros: $impar ")

}
