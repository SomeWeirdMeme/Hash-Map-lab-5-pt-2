import java.util.HashMap;
import java.util.Random;

/**
 * Generates responses based on keywords using a HashMap.
 */
public class Responder {
    private HashMap<String, String> responsesMap;
    private Random randomGenerator;
    private String[] defaultResponses;

    public Responder() {
        randomGenerator = new Random();
        responsesMap = new HashMap<>();   
        fillResponsesMap();
        fillDefaultResponses();
    }

    /**
     * Generate a response based on a single word.
     * Returns a default response if keyword not found.
     */
    public String generateResponse(String word) {
        if (responsesMap.containsKey(word)) {
            return responsesMap.get(word);
        } else {
            return pickDefaultResponse();
        }
    }

    /**
     * Fill keyword → response map
     */
    private void fillResponsesMap() {
        responsesMap.put("slow", "Throw out your laptop");
        responsesMap.put("crash", "Have you tried buying a new pc.");
        responsesMap.put("error", "Please provide 500 dollars so i can help");
        responsesMap.put("help", "Sure, mahik is here to help, sauce the bank info");
        responsesMap.put("install", "just follow chat gpt");
        
    }

    /**
     * Fill default responses
     */
    private void fillDefaultResponses() {
        defaultResponses = new String[] {
            "I need more information to help you.",
            "Could you explain that in more detail?",
            "I'm not sure about that. Can you clarify?",
            "Have you tried restarting your system?"
        };
    }

    /**
     * Pick a random default response
     */
    private String pickDefaultResponse() {
        int index = randomGenerator.nextInt(defaultResponses.length);
        return defaultResponses[index];
    }
}

