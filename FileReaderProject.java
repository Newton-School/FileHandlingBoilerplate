import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderProject {
    public static void main(String[] args) {
        readFromFile("dummy.txt");
    }

    public static void readFromFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
