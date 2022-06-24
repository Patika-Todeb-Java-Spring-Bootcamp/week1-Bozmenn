import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            File scoreFile = new File("score.txt");
            FileWriter myWriter = new FileWriter("score.txt");
            Scanner input = new Scanner(System.in);
            myWriter.write(input.nextLine());
            myWriter.close();
        }catch (IOException error){
            System.out.println("An error occured.");
            error.printStackTrace();
        }
    }
}
