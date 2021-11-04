package ReadingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    static File randomStrings = new File("RandomStrings.rtf");

    static ArrayList<String> getRandomWordsToArrayList() {
        ArrayList<String> listToReturn = new ArrayList<>();
        try {
            Scanner sc = new Scanner(randomStrings);
            while (sc.hasNextLine()) {
                listToReturn.add(sc.nextLine().replaceAll("\\\\",""));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong");
        }
        return listToReturn;
    }

    static int countWordsInString(String stringToAnalyze){
        int amountOfWordsInString=0;
        for (int i = 0; i < stringToAnalyze.length(); i++) {
            if (stringToAnalyze.charAt(i) == ' ') {
                amountOfWordsInString++;
            }
        } return amountOfWordsInString+1;
    }

    static int countWordsInFile(){
        int totalWordCountInFile =0;
        for (int i = 0; i < getRandomWordsToArrayList().size(); i++) {
            totalWordCountInFile+=countWordsInString(getRandomWordsToArrayList().get(i));
        }
        return totalWordCountInFile;
    }
}

