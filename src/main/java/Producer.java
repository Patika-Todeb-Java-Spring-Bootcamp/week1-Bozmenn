import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Producer extends Thread {
    @Override
    public void run() {
        Scanner input = new Scanner(System.in);

        try {
            File scoreFile = new File("score.txt");
            FileWriter myWriter = new FileWriter("score.txt");
            myWriter.write(input.nextLine());
            myWriter.close();
        }catch (IOException error){
            System.out.println("An error occured.");
            error.printStackTrace();
        }
    }
}
