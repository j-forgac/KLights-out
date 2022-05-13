interface Player {
    val gameBoard: GameBoard

    fun play(): List<Int>

    fun print(){
        for(row in gameBoard.field){
            for(column in row){
                when(column){
                    1 -> print("#")
                    0 -> print(".")
                }
            }
            println()
        }
    }
}