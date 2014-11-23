/**
 * The main class.
 * Start a new game with an AI and a human, or an AI or an AI, or something else.
 *
 * @author Richard
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game g = new Game(new AlphaBetaO(), new Human());
    }
}
