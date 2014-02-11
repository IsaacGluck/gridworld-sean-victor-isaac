import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{
    private int steps;
    private int[] turns;
    private int moveCount = 0;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public DancingBug(int[] turnSize)
    {
        turns = turnSize;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act() {
	if (moveCount >= turns.length) 
	    moveCount = 0;
	for (int x = 0; x < turns[moveCount]; x++)
	    turn();
	move();
	moveCount++;
    }
}
