import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS20S
 * 
 *  Assignment:     For Loop intro example
 * 
 *  Description:    A simple for loop with some common variations
 * 
 *************************************************************/

public class CS20SForLoopIntoExample {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
    
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  for loop intro" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
    
    // ***** Get Input *****
    // ***** Main Processing *****
    
    /* the simplest for loop possible */
    
    // for(int i = 0; i < 10; i++){
        // System.out.println("This is iteration: " + (i + 1));
    // }// end for 0-10
    
    // // variation 1 count down
    // for(int i = 10; i >= 0; i--){
       // System.out.println("This is iteration: " + i); 
    // }// end for 10-0
    
    // // variation 2 count by 3's
    // for(int i = 0; i <= 30; i = i + 3){
        // System.out.println("i is now: " + i);
    // }// end count by 3
    
    // variation 3 a bit more complex
    // System.out.println("enter some numbers.");
    // strin = scanner.nextLine();
    // System.out.println(strin);
    
    // // split strin into tokens
    // tokens = strin.split(delim);
    
    // for(int i = 0; i < tokens.length; i++){
        // System.out.println("parse or print: " + tokens[i]);
    // }//end for tokens
    
    int start = 0;
    int stop = 0;
    
    System.out.println("Enter the starting point and ending point");
    strin = scanner.nextLine();
    System.out.println(strin);
    
    int delta = 0;
    System.out.println("enter the increment.");
    delta = scanner.nextInt();
    
    tokens = strin.split(delim);
    start = Integer.parseInt(tokens[0]);
    stop = Integer.parseInt(tokens[1]);
    
    for(int i = start; i < stop; i += delta){
        System.out.println("i is now: " + i);
    }// end start - stop
    
    
    
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");

    } // end main 
    
} // end FormatTemplate
