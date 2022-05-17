fun main() {
    println("Digite o primeiro numero: ")
    val num1 = readln().toInt()
    println("Digite o segundo numero: ")
    val num2 = readln().toInt()
    println("Digite o terceiro e ultimo numero: ")
    val num3 = readln().toInt()

    var a = 0
    var b = 0
    var c = 0

    if ((num1 < num2) && (num1 < num3)){
        a = num1

        if(num2 < num3){
            b = num2
            c = num3
        }else {
            b = num3
            c = num2
        }
    }else if ((num2 < num3) && (num2 < num1)){
        a = num2

        if (num1 < num3){
            b = num1
            c = num3
        }else{
            b = num3
            c = num1
        }
    }else if ((num3 < num1) && (num3 < num2)){
        a = num3

        if(num2 < num1){
            b =num2
            c = num1
        }else{
            b = num1
            c = num2
        }
    }else{

        if((num1 == num2) && num2 < num1){
            a = num1
            b = num2
            c = num3
        }else if(num2 == num3 && num2 < num1){
            a = num2
            b = num3
            c = num1
        }else{
            a = num1
            b = num3
            c = num2
        }
    }
    println(" Ordem é : $a, $b , $c")
}