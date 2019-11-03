import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileWriter;

public class Application {
    public static void main(String Args[]) throws IOException {
        FileInputStream fileByteStream = null;
        FileWriter fbs = null;
        DuplicateRemover duplicateRemover = new DuplicateRemover();

        try {
            fileByteStream = new FileInputStream("problem1.txt");
            fbs = new FileWriter("unique_words.txt");
            duplicateRemover.remove(fileByteStream);
            duplicateRemover.write(fbs);
        }

        catch(IOException except){
            System.out.println(except.getMessage());
        }

        finally {
            try {
                if(fileByteStream != null) {
                    fileByteStream.close();
                }
                if(fbs != null) {
                    fbs.close();
                }
            }

            catch(IOException excpt) {
                System.out.println(excpt.getMessage());
            }
        }
    }
}