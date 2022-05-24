fun main(){
    /*
    Classes e objetos

    classe cachorro
        Estado ( ou atributo) - raca, tamanho, peso, humor, nome, pelagem, idade

        Comportamento ( as acoes ou metodos ) - latir, comer, beber, espirrar, brincar

        Objetos - Bob, Toddy, Sonic, Mel

        Todo o objeto dentro do Kotlin terá uma identidade unica

         Pessoa
            Atributos - peso, nome, idade, cpf. rg

      Para criar objetos geramos o que chamamos de Instaância de uma classe ( um objeto de pessoa ( Objeto Pedro))
     */

    // Gerar uma instancia de pessoa Exemplo

   /* var pedro = Pessoa()

    pedro.nome = "Pedro"
    pedro.idade = 25
    pedro.peso = 65.0
    pedro.rg = "000000000000000-0"
    pedro.cpf = "000.000.000-00"

    println(pedro.nome)
    println(pedro.idade)
    println(pedro.peso)
    println(pedro.rg)
    println(pedro.cpf)*/

    // Agencia banco
    // Instancia de conta Banco adicionando informacoes no construtor
    var contaBanco = ContaBanco(
         "Carlos ",
        "0000",
        "000-00",
        2000.0
    )

    var contaBanco2 = ContaBanco(
        "Robin ",
        "0000",
        "000-00",
        2000.0,
        500.0,
        true
    )

    contaBanco.saldo()


    println("Digite o valor do saque: ")
    val dindin = readln().toDouble()

    contaBanco.saque(dindin)

    contaBanco.saldo()

    println("Digite o valor do deposido: ")
    val dinDeposito = readln().toDouble()

    contaBanco.deposito(dinDeposito)
    contaBanco.saldo()
}