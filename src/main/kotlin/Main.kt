import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val gameBoard = GameBoard()
    var didWin = false
    val human = Human(gameBoard)
    while (!didWin){ //game cycle
        val input = human.play()
        didWin = gameBoard.changeState(input[0],input[1])
        human.print()
    }
}