import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class javaAPI {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("a.text");
        try {
            FileReader fr = new FileReader(myFile);
            int c = fr.read();
            while (c != -1) {
                c = fr.read();
                System.out.println(c + " ");

            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
