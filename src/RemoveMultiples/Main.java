package RemoveMultiples;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> oneToHundred = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            oneToHundred.add(i);
        }
        System.out.println(oneToHundred);
        System.out.println("\nPlease input a number which multiples will be removed:");
        int userInput = sc.nextInt();
        for (int i = 0; i < oneToHundred.size(); i++) {
            if (oneToHundred.get(i)%userInput==0 && oneToHundred.get(i)!=userInput){
                oneToHundred.remove(i);
            }
        }
        System.out.println("\n"+oneToHundred);

    }
}
