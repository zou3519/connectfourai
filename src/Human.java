import java.util.Scanner;

/**
 * Represents a human player in Connect Four.
 * This is a commandline game, so we scan from in
 *
 * @author Richard
 */
public class Human extends AI {
    public int generateMove(int player, Board board) {
        System.out.print("Make a move: ");
        Scanner scanner = new Scanner(System.in);
        int move = scanner.nextInt();
        return move;
    }
}
