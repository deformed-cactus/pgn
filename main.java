import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.*;

public class main{

    public static void main(String args[]){

      //make a scanner that reads in the desired txt file name, for conversion to pgn.
      Scanner scanner  = new Scanner(System.in);
      String fileName  = "placeholder";

      //the loop runs while there is a new file to be parsed into a pgn.
      //the loop stops when the user submits the word "done".
      while(true){
        System.out.println("Enter a file name. Hit enter when you are done. If you are finished making pgns, write the word done, then hit enter.");
        fileName       = scanner.nextLine();

        if(fileName.equals("done")){
          scanner.close();
          break;
        }
        convertToPGN(fileName);
      }
    }

    //takes in name of txt file containing moves, finds and opens the file,
    //adds the periods, then formats the pgn for brevity and prints to the command prompt.
    //Throws an error if the file name is not valid.
    public static void convertToPGN(String fileName){
      try{
        File moves     = new File(fileName);
        Scanner reader = new Scanner(moves);
        String pgn     = "";

        while(reader.hasNextLine()){
          String data  = reader.nextLine().replaceFirst("\\t", ". ")
                               .replace("\t", " ")
                               .replace("  ", " ");
          pgn         += data;
          pgn         += " ";
        }
        System.out.println(pgn);
        reader.close();
      } catch(FileNotFoundException error) {
          System.out.println("An error occurred.");
          error.printStackTrace();
      }
    }
}
