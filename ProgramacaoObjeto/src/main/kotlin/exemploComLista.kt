fun main(){
    val contas = mutableListOf(
        ContaBanco(
            "Carlos ",
            "0000",
            "000-00",
            2000.0
        ),
        ContaBanco(
            "Joao",
            "0000",
            "000-00",
            2000.0
        ),
        ContaBanco(
            "Maria ",
            "0000",
            "000-00",
            2000.0
        )
    )

    contas.forEach {
        if(it.nome == "Maria "){
            println(it)
        }
    }
}