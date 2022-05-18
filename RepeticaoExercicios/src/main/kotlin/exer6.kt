fun main(){

    var soma = 0.0
    var cont = 0

    do{
        print("Digite um numero: ")
        val num = readln().toInt()

        if(num % 3 == 0 && num != 0){
            soma += num
            cont++
        }

    }while (num != 0)

    val media = soma / cont

    println("A soma dos numeros multiplos de 3 é $soma,sendo a media dos mesmos é: $media")
}