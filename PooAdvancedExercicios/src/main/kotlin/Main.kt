fun main(){

    while (true){
        println("Digite o seu nome: ")
        val nome = readln()

        println("Digite o endereco: ")
        val endereco= readln()

        println("Digite o telefone: ")
        val telefone = readln()


        try {
            val cliente = Cliente(nome, endereco, telefone)

            while (true){
                println("\n*******Menu********\n")
                println("1- adcionar compras")
                println("2- remover compras")
                println("3- listar compras")
                println("4- sair\n")

                print("Opcao: ")
                val opc = readln().toInt()

                when(opc){

                    1->{
                        println("Digite um item para adcionar no carrinho: ")
                        val compra = readln()
                        cliente.addCompra(compra)
                    }

                    2 ->{
                        println("Digite um item para ser removido: ")
                        val compra = readln()
                        cliente.removeCompra(compra)
                    }

                    3 -> {
                        cliente.listCompras()
                    }

                    4 -> {
                        break
                    }

                    else -> println("Valor invalido")
                }
            }
            break

        }catch (e:  Exception){
            println(e.message)
        }
    }
}