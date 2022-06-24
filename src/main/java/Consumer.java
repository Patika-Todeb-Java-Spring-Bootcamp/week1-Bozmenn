import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Consumer extends Thread {
    @Override
    public void run() {
        try {
            File scoreFile = new File("score.txt");
            Scanner fileReader = new Scanner(scoreFile);
            while (fileReader.hasNextLine()) {
                String output = fileReader.nextLine();
                System.out.println(output);
            }
            fileReader.close();
        }catch (FileNotFoundException error){
            System.out.println("An error occured");
            error.printStackTrace();
        }
    }
}
