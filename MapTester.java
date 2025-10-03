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
        Mahikbook.put(name,number);
    }
    
    public String lookupNumber(String name)
    {
        return Mahikbook.get(name);
    }
        
    
    
    
     
    
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
