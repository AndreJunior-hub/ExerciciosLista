fun main(args: Array<String>) {
    // exerccicio 4 - prefeitura

    var cont = 0
    var idade  = 0
    var sexo = 0
    var opcao = 0
    var pCalmas = 0
    var mNerv = 0
    var hAgr = 0
    var outCalmos = 0
    var pNM40 = 0
    var pCM18 = 0

    while (cont < 5){
        println("***Pessoa ${cont + 1}*****")

        println("Digite a idade: ")
        idade = readln().toInt()

        println("Digite o sexo; 1-feminino; 2-masculino; 3-outros")
        sexo = readln().toInt()

        println("Digite o comportamento" +
                "\n 1:pessoa calma; 2:pessoa nervosa; 3:pessoa agresiva")
        opcao = readln().toInt()

        if(opcao == 1){
            pCalmas++
        }

        if(sexo == 1 && opcao == 3){
            mNerv++
        }

        if(sexo == 2 && opcao == 3){
            hAgr++
        }

        if(sexo == 3 && opcao == 1){
            outCalmos++
        }

        if(opcao == 2 && idade > 40){
            pNM40++
        }

        if(opcao == 1 && idade < 18){
            pCM18++
        }

        cont++
    }

    println("Calmos: $pCalmas")
    println("Mulheres nervosas: $mNerv")
    println("Homem agressivo: $hAgr")
    println("Outros calmos: $outCalmos")
    println("Nervosas maior 40: $pNM40")
    println("Calmas menor 18: $pCM18")
}
