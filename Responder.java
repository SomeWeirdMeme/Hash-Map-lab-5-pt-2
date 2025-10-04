import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
/**
 * The responder class represents a response generator object. It is used
 * to generate an automatic response. This is the second version of this 
 * class. This time, we generate some random behavior by randomly selecting 
 * a phrase from a predefined list of responses.
 * 
 * @author   Michael Kölling and David J. Barnes
 * @version 7.2
 */
public class Responder
{
    private Random randomGenerator;
    private ArrayList<String> responses;
    private HashMap<String,String> responsesMap;

    /**
     * Construct a Responder
     */
    public Responder()
    {
        randomGenerator = new Random();
        responses = new ArrayList<>();
        fillResponses();
        fillResponsesMap();
        responsesMap = new HashMap<>();
    }

    /**
     * Generate a response.
     * 
     * @return  A string that should be displayed as the response
     */
    public String generateResponse(String word)
    {
       if (responsesMap.containsKey(word)){
           return responsesMap.get(word);
        } else {
            return pickDefaultMahik();
        }
    }
    
    public String pickDefaultMahik()
    {
        int index = randomGenerator.nextInt(responses.size());
        return responses.get(index);
    }
    
    public void fillResponsesMap()
    {
        responsesMap.put("crash", "Have you tried throwing your computer out?");
        responsesMap.put("faulty", "Can you provide the exact thing that is useless?");
        responsesMap.put("slow", "Make sure your pc isnt like you and close unnecessary applications or tabs");
        responsesMap.put("install", "Check if you are not broke and find out if the disk space prerequisite is fufilled");
        responsesMap.put("update", "Make sure you got the new graphics card or something like that");
        responsesMap.put("login", "Double check your user and password im talking to you Mahik");
    }
    
    /**
     * Build up a list of default responses from which we can pick one
     * if we don't know what else to say.
     */
    private void fillResponses()
    {
        responses.add("That sounds odd. Could you describe this in more detail?");
        responses.add("""
                      No other customer has ever complained about this before.
                      What is your system configuration?
                      """);
        responses.add("I need a bit more information on that.");
        responses.add("Have you checked that you do not have a dll conflict?");
        responses.add("That is covered in the manual. Have you read the manual?");
        responses.add("""
                      Your description is a bit wishy-washy. Have you got an expert
                      there with you who could describe this more precisely?
                      """);
        responses.add("That's not a bug, it's a feature!");
        responses.add("Could you elaborate on that?");
        responses.add("Have you tried running the app on your phone?");
        responses.add("I just checked StackOverflow - they don't know either.");
    }
}

