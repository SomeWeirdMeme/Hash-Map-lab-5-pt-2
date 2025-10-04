import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;
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
    
    public HashSet<String> getWords()
    {
        System.out.println("> ");
        String inputLine = reader.nextLine();
        String[] splitWords = inputLine.toLowerCase().split("//s+");
        return new HashSet<>(Arrays.asList(splitWords));
    }
}

