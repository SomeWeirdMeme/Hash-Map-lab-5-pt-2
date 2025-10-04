import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap<String,String> Mahikbook;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        // initialise instance variables
        Mahikbook = new HashMap<>();
    }
    
    public void enterNumber(String name,String number)
    {
        Mahikbook.put(number,name);
    }
    
    public String lookupNumber(String name)
    {
        return Mahikbook.get(name);
    }
    // question 32 answer
    public void Mahikseek()
    {
        System.out.println(Mahikbook.keySet());
    }
    // question 30 answer
    public boolean hasMahik(String name)
    {
        return Mahikbook.containsKey(name);
    }
}
