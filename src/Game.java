/**
 * Represents a Connect Four game
 *
 * @author Richard
 */
public class Game {
    private AI[] players;

    private Board board;

    //turn will oscillate between 1 and 2.
    private int turn = 1;
    private int true_turn = 1;

    private int isGameOver;

    public Game(AI one, AI two) {
        players = new AI[2];
        players[0] = one;
        players[1] = two;
        isGameOver = 0;

        board = new Board();
        System.out.println(board);

        while(isGameOver==0) {
            System.out.println("\n*****Turn: " +true_turn + "*****");
            //System.out.println(board.getPossibleMoves());
            //System.out.println("");

            int move = players[turn-1].generateMove(turn, board);
            System.out.println("Move: " + move);

            board.makeMove(turn, move);
            System.out.println(board);

            //System.out.println("Rows: " + board.getRowsAsStr());
            System.out.println("Rows: " + board.rows);
            //System.out.println("Cols: "+ board.getColsAsStr());
            System.out.println("Cols: "+ board.cols);
            //System.out.println("Diags: "+board.getDiagsAsStr());
            System.out.println("Diags: "+board.diagonals);

            this.isGameOver = board.isGameOver();

            true_turn++;
            turn++;
            if (turn == 3) {
                turn = 1;
            }
        }
        System.out.println("Player " + isGameOver
                + (isGameOver == 1 ? " (X)" : " (O)") + " wins!");

    }
}
