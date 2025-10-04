import java.util.HashSet;
import java.util.Arrays;
/**
 * Main technical support system class.
 * Uses InputReader to read user input and Responder to reply.
 */
public class SupportSystem 
{
    private InputReader reader;
    private Responder responder;

    public SupportSystem() 
    {
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * Start the support system dialog
     */
    public void start() 
    {
        boolean finished = false;
        printWelcome();

        while (!finished) 
        {
            String inputLine = reader.getInput().trim().toLowerCase();
            
            HashSet<String> words = new HashSet<>(Arrays.asList(inputLine.split("//s+")));

            if (words.contains("bye")) 
            {
                finished = true;
            } else 
            {
                String response = responder.generateResponse(words);
                System.out.println(response);
            }
        }
        printGoodbye();
    }

    private void printWelcome() 
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println("Please type your problem. Type 'bye' to exit.");
    }

    private void printGoodbye() 
    {
        System.out.println("Nice talking to Mahik. Bye...");
    }
}
