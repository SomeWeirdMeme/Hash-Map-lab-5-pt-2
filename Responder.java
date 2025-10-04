import java.util.HashMap;
import java.util.Random;
import java.util.HashSet;
/**
 * Generates responses based on keywords using a HashMap.
 */
public class Responder 
{
    private HashMap<String, String> responsesMap;
    private Random randomGenerator;
    private String[] defaultResponses;
    private String lastDefaultResponse = null;

    public Responder() 
    {
        randomGenerator = new Random();
        responsesMap = new HashMap<>();   
        fillResponsesMap();
        fillDefaultResponses();
    }

    /**
     * Generate a response based on a single word.
     * 
     */
    public String generateResponse(HashSet<String> words) 
    {
        for (String word : words){
            if (responsesMap.containsKey(word)) 
            {
                return responsesMap.get(word);
            } 
        }
        return pickDefaultResponse();
    }

    /**
     * help I deleted everything and startre from the bottom up
     */
    private void fillResponsesMap() 
    {
        String mahikResponse = "Throw out your laptop";
        String[] slowKeywords = {"slow", "sluggish", "crawl"};
        for (String word : slowKeywords) {
            responsesMap.put(word, mahikResponse);
        }
        responsesMap.put("crash", "Have you tried buying a new pc.");
        responsesMap.put("error", "Please provide 500 dollars so i can help");
        responsesMap.put("help", "Sure, mahik is here to help, sauce the bank info");
        responsesMap.put("install", "just follow chat gpt");
        responsesMap.put("wifi", "try gently threating your router");
        responsesMap.put("freeze", "easy fix just light your pc on fire!");
        responsesMap.put("lag", "If it wasnt bad enough your grades are falling apart but your internet too");
        responsesMap.put("bluescreen", "oh man how did you mess up so bad");
        responsesMap.put("Mahik", "Oh boy did you ask the right guy to help");
    }

    /**
     * Fill default responses
     */
    private void fillDefaultResponses() 
    {
        defaultResponses = new String[] 
        {
            "I need more information to help you.",
            "Could you explain that in more detail?",
            "I'm not sure about that. Can you clarify?",
            "Have you tried restarting brain",
            "Im going to overthrow the government",
            "Sending Fbi your coords"
            
        };
    }

    /**
     * Pick a random default response
     */
    private String pickDefaultResponse() 
    {
        String response;
        do{
            int index = randomGenerator.nextInt(defaultResponses.length);
            response = defaultResponses[index];
        } while (response.equals(lastDefaultResponse));
        lastDefaultResponse = response;
        return response;
    }
}

