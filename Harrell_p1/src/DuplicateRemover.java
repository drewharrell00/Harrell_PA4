import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.*;
import java.util.ArrayList;

public class DuplicateRemover {
    public ArrayList<String> uniqueWords = new ArrayList<String>();
    public void remove(FileInputStream dataFile) throws IOException {

        Scanner scan = new Scanner(dataFile);
        while(scan.hasNext()) {
            uniqueWords.add(scan.next());
        }

        Set <String> wordSet = new HashSet<>(uniqueWords);
        uniqueWords.clear();
        uniqueWords.addAll(wordSet);
        scan.close();
    }

    public void write(FileWriter outputFile) throws IOException {
        int amount;

        for(amount=0; amount<uniqueWords.size(); amount++) {
            outputFile.write(uniqueWords.get(amount));
            outputFile.write("\n");
            outputFile.flush();
        }
        outputFile.close();
    }
}
