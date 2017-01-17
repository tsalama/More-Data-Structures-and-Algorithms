/**
 * MazeSolver attempts to recursively traverse a Maze. The goal is to get from the
 * given starting position to the bottom right, following a path of 1's. Arbitrary
 * constants are used to represent locations in the maze that have been TRIED
 * and that are part of the solution PATH.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class MazeSolver
{
    private Maze maze;

    /**
     * Constructor for the MazeSolver class.
     */
    public MazeSolver(Maze maze)
    {
        this.maze = maze;
    }

    /**
     * Attempts to recursively traverse the maze. Inserts special
     * characters indicating locations that have been TRIED and that
     * eventually become part of the solution PATH.
     *
     * @param row row index of current location
     * @param column column index of current location
     * @return true if the maze has been solved
     */
    public boolean traverse(int row, int column, int layer)
    {
        boolean done = false;

        if (maze.validPosition(row, column, layer))
        {
            maze.tryPosition(row, column, layer);   // mark this cell as tried

            if (row == maze.getRows()-1 && column == maze.getColumns()-1 && layer == maze.getLayers()-1)
                done = true;  // the maze is solved
            else
            {
                done = traverse(row+1, column, layer);
                if (!done)
                    done = traverse(row, column+1, layer);  //down
                if (!done)
                    done = traverse(row, column, layer+1);  //right
            }

			if(!done)
			{
				done = traverse(row-1, column, layer); //up
			}
			if(!done)
			{
				done = traverse(row, column-1, layer); //left
			}
			if(!done)
			{
				done = traverse(row, column, layer-1); //next level
			}
        }

        if (done)  // this location is part of the final path
        	maze.markPath(row, column, layer);

        return done;
    }
}