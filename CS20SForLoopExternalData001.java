import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS20S
 * 
 *  Assignment:     For Loop External Data
 * 
 *  Description:    Read records of mixed data from an external
 *                  file using a for-loop to process int values
 * 
 *************************************************************/

public class CS20SForLoopExternalData001 {

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
        
        // variables for this application
        String name;
        int score = 0;                  // score in one video game play
        
        int totalScore = 0;             // the sum of all of the scores
        double averageScore = 0.0;      // average score
    
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        BufferedReader fin = new BufferedReader(new FileReader("multiParsingExampleData.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  For Loop and External Data" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
   // ***** Main Processing *****
   
       // create an eof loop
       //pre-loop processing
       
       // prime the loop
       strin = fin.readLine();
       //System.out.println(strin);
       
       while(strin != null){
           //System.out.println(strin);
           
           // split the record into tokens
           tokens = strin.split(delim);
           
           // parse the first data item
           name = tokens[0];                // get the first token and stor it in name
           System.out.format("%-7s", name);
           
           // for loop pre-loop processing
           totalScore = 0;          // re-set total score to start adding at 0
           
           // parse the int values in each record
           for(int i = 1; i < tokens.length; i++){
               //System.out.print(tokens[i] + " ");
               
               // parse each int
               score = Integer.parseInt(tokens[i]);
               System.out.format("%5d", score);
               
               // add up the scores
               totalScore += score;               
           }// end for
           
           // post-loop processing
           System.out.format("%5d", totalScore);
           //System.out.println();
           
           // calc average
           averageScore = (double)totalScore / (tokens.length - 1);
           
           // print average
           System.out.format("%8.2f", averageScore);
           System.out.println();
           
           
           // update conrtol variable
           strin = fin.readLine();
       }// end eof
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
