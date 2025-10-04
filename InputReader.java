import java.util.Scanner;

/**
 * InputReader reads typed text input from the terminal.
 */
public class InputReader 
{
    private Scanner reader;

    public InputReader() 
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from the user
     */
    public String getInput() 
    {
        System.out.print("> ");
        return reader.nextLine();
    }
}

