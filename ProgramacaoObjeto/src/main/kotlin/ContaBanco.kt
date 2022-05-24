data class ContaBanco (var nome:String, val agencia: String,
                val conta: String, var saldo:Double){

    //construtores segundarios
    var limite = 0.0
    var chequeEspecial = false
    var seguroCartao = false
    /*
    estrutura construtor seguntario
    constructor ( todos os valores do construtor segundario)
        : this(referenciar as variaveis do construtor primario ){


            Indicar onde armazenaremos os valores do construtor que estamos criando
        }
     */

    // Declarando cosntrutor segundario
    constructor(titular: String, agencia: String, conta: String, saldo: Double,
    limite: Double
    ): this(titular, agencia, conta, saldo){
        this.limite = limite
    }

    constructor(
        titular: String, agencia: String, conta: String, saldo: Double,
        limite: Double, chequeEspecial: Boolean
    ): this(titular, agencia, conta, saldo, limite){
        this.chequeEspecial = chequeEspecial
    }

    constructor(
        titular: String, agencia: String, conta: String, saldo: Double,
        limite: Double, chequeEspecial: Boolean, seguroCartao: Boolean
    ): this(titular, agencia, conta, saldo, limite, chequeEspecial){
        this.seguroCartao = seguroCartao
    }

    /*
    Declarar os metodos da classe

    Por exemplo:
    fun saque(){

    }

    Métodos de uma conta de Banco
    saldo, saqie, deposito
     */

    //metodo saldo()
    fun saldo(){
        println("\n****Saldo da conta****\n")
        println("R$$saldo")
    }

    // metodo saque()
    fun saque(valor:Double){
        if(valor > 0.0 && valor <= saldo){
            saldo -= valor
            println("Saque de valor $$valor realizado com sicesso\n")
        }else{
            println("Saldo de valor $$valor é impossivel de ser realizado ")
        }
    }

    // metodo deposito()
    fun deposito(valor: Double){

        if(valor > 0.0){
            saldo += valor
            println("Deposito de R$$valor realizado com sucesso\n")
        }else{
            println("Deposito de R$$valor imposivel de ser realizado ")
        }
    }
}