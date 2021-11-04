package ReadingFiles;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> randomStrings = FileReader.getRandomWordsToArrayList();

        for (int i = 0; i < randomStrings.size(); i++) {
            System.out.print("Line #" + i + " has ");
            System.out.print(FileReader.countWordsInString(randomStrings.get(i)) + " words\n");
        }
        System.out.println("\nThe total amount of words in the file is " + FileReader.countWordsInFile() + " words\n\n");
    }
}
