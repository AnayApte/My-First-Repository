/**
 * Anay Apte
 * 8/23/22
 * Chapter 1 Notes
 * Notes from class
 * Who helped me: myself
 *
 * 
 */
import java.util.Scanner; // Class is last argument
import java.util.Random;

public class ch1Notes
{
    /**
     * This is code notes for ch 1
     *
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        // Basic data types in Java
        int x = 9, y, z;
        boolean choice = false;
        char letter = 'b';
        float number2 = 9; // Takes 4 bytes of data, same as double
        double number1 = 8.9, number3, number4; // Takes 8 bytes of data, same as float
        short num = 6; // Takes less memory than ints
        long numbbber = 9999; // Takes more memory than ints
        
        // These are objects
        // Class  ID        Memory  Constructor
        String    word =    new     String("Anay Apte");
        Integer   number =  new     Integer(47);
        Double    anumber = new     Double(45.8);
        
        System.out.print(word);
    }
}
