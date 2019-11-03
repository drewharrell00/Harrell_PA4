import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class DuplicateCounter {
    public Integer wordCounter;
    public HashMap<String, Integer> words = new HashMap<String, Integer>();
    public void count(FileInputStream dataFile) throws IOException {
        Scanner scan = new Scanner(dataFile);

        while(scan.hasNext()) {
            String one = scan.next();
            wordCounter = words.get(one);

            if(wordCounter != null) {
                wordCounter++;
            }

            else {
                wordCounter = 1;

            }
            words.put(one, wordCounter);
        }
        scan.close();
    }

    public void write(FileOutputStream outputFile) throws IOException {
        PrintWriter outFS = new PrintWriter(outputFile);
        outFS.println(words);
        outFS.flush();
        outputFile.close();
    }


}