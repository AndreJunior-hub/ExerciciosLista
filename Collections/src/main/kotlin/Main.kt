/*
fun main(){

    var produtos = mutableListOf<String>()

    while (true) {


        println("1-armazenar; 2 remover; 3 atualizar; 4 listar produtos; 5 sair")
        when (readln().toInt()) {
            1 -> {
                println("Digite o Item: ")
                val item = readln()

                if(item != ""){
                    produtos.add(item)
                }else{
                    break
                }
            }//armazenar

            2 -> {
                if (produtos.size == 0) {
                    print("Nao existe produtos na lista!!")
                } else {
                    print("Digite o nome do produto a ser removido: ")
                    val delete = readln()

                    if (produtos.contains(delete)) {
                        produtos.remove(delete)

                    } else {
                        println("O nome $delete nao existe")
                    }
                }
            }//remover

            3 -> {
                println("Digite o produto a ser editado: ")
                val edit = readln()

                if(produtos.contains(edit)){
                    val index = produtos.indexOf(edit)
                    println("Digite o novo nome do produto: ")
                    val novo = readln()
                    produtos[index] = novo
                    println("!!Atualizado com sucesso!!")
                    break
                }else{
                    println("O nome $edit nao existe")
                    break
                }
            }//editar

            4 -> {
                println("Os produtos na lista são: ")
                println(produtos)
            }//listar

            5 -> break
        }
    }
}


 */