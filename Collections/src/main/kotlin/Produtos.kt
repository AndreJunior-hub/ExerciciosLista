fun main(){
    val produtos= mutableListOf<String>()

    while(true){

        println("Escolha uma opção:\n")
        println("1 - adicionar ")
        println("2 - remover")
        println("3 - atualizar ")
        println("1 - listar ")
        println("1 - sair \n")

        print("Opcao: ")
        val opcao = readln().toInt()

        when(opcao){

            1->{
                do{
                    println("\nCarastro de produtos\n")
                    println("Digite o nome do produto:")
                    val prod = readln()

                    if(prod != ""){
                        produtos.add(prod)
                        println("Produto cadastradi\n")
                    }else{
                        println("O nome do produto nao pode ser vazio")
                    }
                }while(prod != "")
            }// adicionar

            2-> {
                println("Digite o produto a ser deletado:")
                val prod = readln()

                if(produtos.contains(prod)){
                    produtos.remove(prod)
                    println("Produto removido com sucesso")
                }else{
                    println("Produto nao existe na lista\n")
                }
            }// delet

            3 -> {

                println("Lista de Produtos\n")

                produtos.forEach{
                    println(it)
                }

                println("\n Digite um produto a ser atualizado: ")
                val prod = readln()

                if(produtos.contains(prod)){
                    val index = produtos.indexOf(prod)

                    println("Digite o novo produto: ")
                    val valor = readln()

                    produtos[index] = valor

                    println("Produto atualizado com sucesso\n")
                }else{
                    println("Produto nao existe na lista \n")
                }
            }//atualizar

            4 ->{
                println("Lista de Produtos\n")

                produtos.forEach{
                    println(it)
                }
                println()
            }//listar

            5 -> break

            else -> println("Valor invalido\n")
        }
    }

}