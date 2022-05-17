fun main(){
    println("Digite a idade de 10 a 25 anos: ")
    val idade = readln().toInt()

    if (idade in 10..14){
        println("Infantil")
    }else if ( idade in 15..17 ){
        println("Juvenil")
    }else if (idade in 18..25){
        println("Adulto")
    }else{
        println("Idade nao valida")
    }
}