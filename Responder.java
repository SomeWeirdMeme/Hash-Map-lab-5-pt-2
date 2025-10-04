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
    private HashMap<String, String> questionResponses;
    public Responder() 
    {  
        responsesMap = new HashMap<>();
        questionResponses = new HashMap<>();
        randomGenerator = new Random();
        fillResponsesMap();
        fillDefaultResponses();
        fillQuestionResponses();
    }

    /**
     * Generate a response based on a single word.
     * 
     */
    public String generateResponse(HashSet<String> words) 
    { //Question 39.
        HashSet<String> matchedResponses = new HashSet<>();
        for (String word : words){
            if (responsesMap.containsKey(word)) 
            {
                matchedResponses.add(responsesMap.get(word));
            } 
        }
        if (matchedResponses.isEmpty()) {
            return pickDefaultResponse(words);
        }
        if (matchedResponses.size() > 1) {
            return "calm down buddy you are in over your head: " + String.join(" | ", matchedResponses);
        }
        return matchedResponses.iterator().next();
    }

    /**
     * help I deleted everything and startre from the bottom up
     */
    private void fillResponsesMap() 
    { //question 40
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
        // questions 38 added new things.
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
    private String pickDefaultResponse(HashSet<String> words) 
    { //question 41
        for (String word : words)
        {
            if (questionResponses.containsKey(word))
            {
                return questionResponses.get(word);
            }
        }
        String response;
        do
        {
            int index = randomGenerator.nextInt(defaultResponses.length);
            response = defaultResponses[index];
        } while (response.equals(lastDefaultResponse));
        lastDefaultResponse = response;
        return response;
    }
    
    private void fillQuestionResponses() {
        questionResponses = new HashMap<>();
        questionResponses.put("why", "Help me please Im being held hostage");
        questionResponses.put("how", "Im just as lost as you");
        questionResponses.put("whom", "what are you shakespeare?");
        questionResponses.put("who", "Its me chatGpt");
        questionResponses.put("where", "Inside your walls...................");
    }
}

