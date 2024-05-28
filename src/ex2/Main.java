package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> randomNums = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers do you want to generate?");

        int insertedNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < insertedNum; i++) {
            randomNums.add(random.nextInt(0, 101));
        }
        Collections.sort(randomNums);
        System.out.println(randomNums);
        System.out.println(duplicateAndReverse(randomNums));
        System.out.println(randomNums);


        System.out.println("Do you wanna to stamp only numbers in Odd or Even indexes?");
        System.out.println("1 - even, 2 - odd");

        int oddOrEvenChoice = Integer.parseInt(scanner.nextLine());

        if (oddOrEvenChoice < 0 || oddOrEvenChoice > 2) {
            System.out.println("try again");
        } else {
            if (oddOrEvenChoice == 1) {
                oddOrEvenStamp(randomNums, true);
            } else {
                oddOrEvenStamp(randomNums, false);

            }
        }
//        oddOrEvenStamp(randomNums, oddOrEvenChoice == 1);
    }

    public static ArrayList<Integer> duplicateAndReverse(ArrayList<Integer> startingArray) {

        //to avoid ruining the starting array, I'm gonna create a copy of it just to reverse it.
        ArrayList<Integer> duplicatedAndSortedArray = new ArrayList<>(startingArray);
        ArrayList<Integer> duplicatedArray = new ArrayList<>(startingArray);
        Collections.reverse(duplicatedArray);
        duplicatedAndSortedArray.addAll(duplicatedArray);

        return duplicatedAndSortedArray;
    }

    public static void oddOrEvenStamp(ArrayList<Integer> startingArray, boolean order) {
        for (int i = order ? 0 : 1; i < startingArray.size(); i += 2) {
            System.out.println(startingArray.get(i));
        }
    }
}
