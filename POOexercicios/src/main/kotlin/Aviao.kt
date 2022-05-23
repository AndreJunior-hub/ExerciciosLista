class Aviao(
    var turbina: Int,
    var assas: Int,
    var cor: String,
    var tremPouso: Boolean,
    var modelo: String
) {

    var voando = false
    var luzes = false

    /*
    Metodos - Voar, Pousar, LigarLuzes
     */

    fun voar(){
        if(voando){
            println("O aviao já esta no ar")
        }else{
            voando = true
            println("O avião vai voar")
        }
    }

    fun pousar(){
        if(voando){
            voando = false
            println("O aviao acabou de pousar")
        }else{
            println("O aviao já esta no chao")
        }
    }

    fun LigDesLigLuzes(){
        if(luzes){
            luzes  = false
            println("As luzes estao desligadas")
        }else{
            luzes = true
            println("As luzes estao ligadas")
        }
    }
}