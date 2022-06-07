import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.*;


public class main{

    public static void main(String args[]){

      //make a scanner that reads in the desired txt file name, for conversion to pgn
      Scanner scanner  = new Scanner(System.in);
      System.out.println("Enter the file name, please.");
      String fileName  = scanner.nextLine();
      scanner.close();

      //takes in the txt file containing moves, and adds in the periods so that a pgn is returned.
      try{
        File moves     = new File(fileName);
        Scanner reader = new Scanner(moves);
        while(reader.hasNextLine()){
          String data  = reader.nextLine().replaceFirst("\\t", ". ");
          System.out.println(data);
        }
        reader.close();
      } catch(FileNotFoundException error) {
      System.out.println("An error occurred.");
      error.printStackTrace();
      }
    }
}
