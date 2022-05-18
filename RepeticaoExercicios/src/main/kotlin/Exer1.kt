fun main(args: Array<String>) {
    /* Exercicio 1
    Informe todos os numeros de 1000 a 1999 qie quando divididos por 11 obtemos resto 5 (for)

    for(i in 1..10 ){
        println("$num x $i = ${num * i}")
    }
     */

    for(num in 1000..1999){
        if(num % 11 == 5){
            println(num)
        }
    }
}