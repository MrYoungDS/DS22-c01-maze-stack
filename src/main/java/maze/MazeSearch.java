package maze;

import java.util.*;

/**
 * @author Lewis and Chase
 *
 * Demonstrates a simulation of recursion using a stack.
 *
 * Task 0 is to complete the traverse method in the Maze class
 * to use the stack correctly.
 *
 * Task 1 is to implement the LinkedStack class to get this class
 * to run properly.
 *
 * Task 2 is to modify the Maze class so that the successful path
 * is marked (using the PATH value).
 */
public class MazeSearch
{
    /**
     * Creates a new maze, prints its original form, attempts to
     * solve it, and prints out its final form.
     * @param args array of Strings
     */
    public static void main (String[] args)
    {
        Maze labyrinth = new Maze();

        System.out.println (labyrinth);

        if (labyrinth.traverse ())
            System.out.println ("The maze was successfully traversed!");
        else
            System.out.println ("There is no possible path.");

        System.out.println (labyrinth);
    }
}
