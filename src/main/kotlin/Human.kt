import java.util.*

class Human(override val gameBoard: GameBoard) : Player {
    override fun play(): List<Int> { // gets input from player and returns it as a list of two integers - coordinates
        val sc = Scanner(System.`in`)
        var wasValid = false
        var input: List<Int> = mutableListOf()
        while (!wasValid) {
            input = sc.nextLine().split(":").map { it.toInt() }
            wasValid = gameBoard.isValid(input[0], input[1])
        }
        return input
    }
}