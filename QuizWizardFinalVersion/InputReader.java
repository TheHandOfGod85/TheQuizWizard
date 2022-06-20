import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This class will handle the input from the user.
 * We need to be able to get a number and some text aftrer giving
 * a prompt to the user.
 *
 * @author Daniele Del Piano
 * @version (a version number or a date)
 */
public class InputReader
{
    // instance variables 
    private Scanner scanner;

    /**
     * Constructor for objects of class InputReader
     */
    public InputReader()
    {
        // initialise instance variables
        scanner = new Scanner(System.in); //read from the keyboard
    }
    
    public InputReader(String fileName) throws FileNotFoundException
    {
        File dataInput = new File(fileName);
        scanner = new Scanner(dataInput);
    }
    
    public Scanner getScanner(){
        return scanner;
    }
    
    public int getNumber(String prompt){
        System.out.println(prompt);
        int n = scanner.nextInt();
        scanner.nextLine();//
        return n;
    }
                 
    public String getText(String prompt){
        System.out.println(prompt);
        String value = scanner.nextLine();
        return value;
    }
}