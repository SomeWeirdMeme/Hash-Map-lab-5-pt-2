import java.util.HashSet;
/**
 * Main technical support system class.
 * Uses InputReader to read user input and Responder to reply.
 */
public class SupportSystem 
{
    private InputReader reader = new InputReader();
    private Responder responder = new Responder();

    /**
     * Start the support system dialog
     */
    public void start() 
    {
        printWelcome();
        boolean finished = false;

        while (!finished) 
        {
            HashSet<String> words = reader.getWords();
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
    
    public static void main(String[] args) 
    {
        SupportSystem system = new SupportSystem();
        system.start();
    }
}
