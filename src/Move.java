/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Represents a move.
 * Not actually used anymore
 *
 * @author Richard
 */
@Deprecated //no need for such a complex class.  a move will be a number.
public class Move {
    //player is either 1 or 2.
    int player;
    int position;

    public Move(int player, int position) {
        this.player = player;
        this.position = position;
    }

    public int getPlayer() { return player; }
    public int getPosition() {return position; }

    @Override
    public String toString() {
        String result = new String();
        result = result + "(p" + player + ", " + position + ")";

        return result;
    }
}
