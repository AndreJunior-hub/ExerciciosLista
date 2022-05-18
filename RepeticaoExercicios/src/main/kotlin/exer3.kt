fun main() {

  // exercicio 3
    var idade = 0
    var menorIdade = 0
    var maiorIdade = 0

    while(idade != -99){
        println("Digite a idade a ser registrada: ")
        idade = readln().toInt()

        if(idade < 21 && idade > -98){
            menorIdade++

        }// fim idade < 25

        if(idade > 50 ){
            maiorIdade++
        }// fim idade > 50

    }// fim do while

    println("Pessoas com idade inferior a 21 anos: $menorIdade")
    println("Pessoas com idade superior a 50 anos: $maiorIdade")
}
