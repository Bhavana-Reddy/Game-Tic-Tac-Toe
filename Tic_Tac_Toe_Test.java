import java.util.Scanner;

public class Tic_Tac_Toe_Test {
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Player " + game.currentPlayerMark
					+ " enter your move : ");
			int row = s.nextInt();
			int col = s.nextInt();
			game.placeMark(row, col);
			game.printBoard();
			if (game.checkForWin()) {
				System.out.println("We have a winner! Congrats!");
				System.exit(0);
			} else if (game.isBoardFull()) {
				System.out.println("Appears we have a draw!");
				System.exit(0);
			}
			game.changePlayer();
		} while (true);
	}
}
