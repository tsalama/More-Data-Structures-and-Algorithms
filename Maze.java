import java.util.*;
import java.io.*;

/**
 * Maze represents a maze of characters. The goal is to get from the
 * top left corner to the bottom right, following a path of 1's. Arbitrary
 * constants are used to represent locations in the maze that have been TRIED
 * and that are part of the solution PATH.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class Maze
{
    private static final int TRIED = 2;
    private static final int PATH = 3;

    private int numberRows, numberColumns, numberLayers;
    private int[][][] grid;

    /**
     * Constructor for the Maze class. Loads a maze from the given file.  
     * Throws a FileNotFoundException if the given file is not found.
     *
     * @param filename the name of the file to load
     * @throws FileNotFoundException if the given file is not found
     */
    public Maze(String filename) throws FileNotFoundException
    {
        Scanner scan = new Scanner(new File(filename));
        numberRows = scan.nextInt();
        numberColumns = scan.nextInt();
        numberLayers = scan.nextInt();
        
        grid = new int[numberRows][numberColumns][numberLayers];
        
        for (int i = 0; i < numberRows; i++){
            for (int j = 0; j < numberColumns; j++){
                for(int k = 0; k < numberLayers; k++)
                	grid[i][j][k] = scan.nextInt();
            }
        }    
    }
        
    /**
     * Marks the specified position in the maze as TRIED
     *
     * @param row the index of the row to try
     * @param col the index of the column to try 
     */
    public void tryPosition(int row, int col, int lay)
    {
        grid[row][col][lay] = TRIED;
    }
    
    /**
     * Return the number of rows in this maze
     *
     * @return the number of rows in this maze
     */
    public int getRows()
    {
        return grid.length;
    }
    
    /**
     * Return the number of columns in this maze
     *
     * @return the number of columns in this maze
     */
    public int getColumns()
    {
        return grid[0].length;
    }
    
    public int getLayers()
    {
    	return grid[0][0].length;
    }
    
    /**
     * Marks a given position in the maze as part of the PATH
     *
     * @param row the index of the row to mark as part of the PATH
     * @param col the index of the column to mark as part of the PATH 
     */
    public void markPath(int row, int col, int lay)
    {
        grid[row][col][lay] = PATH;
    }

    /**
     * Determines if a specific location is valid. A valid location
     * is one that is on the grid, is not blocked, and has not been TRIED.
     *
     * @param row the row to be checked
     * @param column the column to be checked
     * @return true if the location is valid    
     */
    public boolean validPosition(int row, int column, int layer)
    {
        boolean result = false;
 
        // check if cell is in the bounds of the matrix 
        if (row >= 0 && row < grid.length &&
            column >= 0 && column < grid[row].length &&
            layer >= 0 && layer < grid[row][column].length)

            //  check if cell is not blocked and not previously tried 
            if (grid[row][column][layer] == 1)
                result = true;

        return result;
    }

    /**
     * Returns the maze as a string.
     * 
     * @return a string representation of the maze
     */
    public String toString()
    {
        String result = "\n";
        int count = 0;

        for (int row=0; row < grid.length; row++)
        {
            for (int column=0; column < grid[row].length; column++){
                for(int layer = 0; layer < grid[row][column].length; layer++){
            		result += grid[row][column][layer] + "";
            		count++;
                
            		if(count == 10){
            			result += " ";
            			count = 0;
            		}
                }
            }
            
            result += "\n";
        }

        return result;
    }
}