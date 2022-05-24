class Cliente(private var nome: String) {

    private var endereco = ""
    private var telefone = ""

    private val listCompras = mutableListOf<String>()

    init {
        throw Exception("Deu ruim aqui")
    }

    //Construtores
    constructor(nome: String, endereco: String): this(nome){
        this.endereco = endereco
    }

    constructor(nome: String, endereco: String, telefone: String)
            : this(nome, endereco){
                this.telefone = telefone
    }

    fun addCompra(compra: String){
        if(compra != ""){
            listCompras.add(compra)
            println("\nItem adcionado")
        }else{
            println("\n Item nao pode ser vazio!")
        }
    }

    fun removeCompra(compra: String){
        if (listCompras.contains(compra)){
            listCompras.remove(compra)
            println("\n Item removido")
        }else{
            println("\n Item nao existe na lista!")
        }
    }

    fun listCompras(){
        println("\n********Lista de compras*******\n")
        listCompras.forEach {
            println(it)
        }
        println()
    }
}