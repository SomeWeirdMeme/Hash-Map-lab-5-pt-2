/**
 * Main technical support system class.
 * Uses InputReader to read user input and Responder to reply.
 */
public class SupportSystem {
    private InputReader reader;
    private Responder responder;

    public SupportSystem() {
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * Start the support system dialog
     */
    public void start() {
        boolean finished = false;
        printWelcome();

        while (!finished) {
            String input = reader.getInput().trim().toLowerCase();

            if (input.startsWith("bye")) {
                finished = true;
            } else {
                
                String[] words = input.split(" ");
                String response = null;

                
                for (String word : words) {
                    response = responder.generateResponse(word);
                    if (response != null) {
                        break; 
                    }
                }

                
                if (response == null) {
                    response = responder.generateResponse("");
                }

                System.out.println(response);
            }
        }

        printGoodbye();
    }

    private void printWelcome() {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println("Please type your problem. Type 'bye' to exit.");
    }

    private void printGoodbye() {
        System.out.println("Nice talking to you. Bye...");
    }
}
