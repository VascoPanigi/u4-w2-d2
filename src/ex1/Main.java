package ex1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> wordsSet = new HashSet<>();
        Set<String> duplicateWordsSet = new HashSet<>();

        int counterUniqueWords = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number.");

        int insertedNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < insertedNum; i++) {
            System.out.println("Insert a word");
            String word = scanner.nextLine().toLowerCase();
            if (wordsSet.contains(word)) {
                duplicateWordsSet.add(word);
            } else {
                wordsSet.add(word);
            }
        }

        for (String singleWord : wordsSet) {
            System.out.println(singleWord);
            counterUniqueWords++;
        }

        System.out.println("Final hash set" + wordsSet);
        System.out.println("Unique words" + counterUniqueWords);
        System.out.println("Duplicate words" + duplicateWordsSet);
    }
}
