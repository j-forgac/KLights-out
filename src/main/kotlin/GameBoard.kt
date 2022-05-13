class GameBoard(row: Int = 5,column: Int = 5) {
    val field = Array(row){Array(column){(0..1).random()} } //initializes random field

    fun changeState(y: Int, x: Int): Boolean{ //returns boolean true - win / false - game should not end
        val toChange = listOf(Pair(y,x),Pair(y+1,x),Pair(y-1,x),Pair(y,x+1),Pair(y+1,x-1))
        toChange.forEach{ //changes adjacent tiles
            if(isValid(it.first,it.second)){
                field[it.first][it.second] = (field[it.first][it.second] + 1)%2 //if tile is 0 -> 1 / if is 1 -> 0
            }
        }
        for(row in field){ //checks if game should end
            for(column in row){
                if(column == 1) return false
            }
        }
        return true
    }

    fun isValid(y: Int, x: Int): Boolean = //checks if there is a tile for given coordinates
        field.getOrNull(y)?.getOrNull(x) != null

}