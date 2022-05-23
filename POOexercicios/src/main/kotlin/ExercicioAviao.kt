fun main(){
    val aviao = Aviao(
        2,
        2,
        "vermelho",
        true,
        "gol"
    )

    aviao.LigDesLigLuzes()
    aviao.voar()


    aviao.pousar()
    aviao.LigDesLigLuzes()
}