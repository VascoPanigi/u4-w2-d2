package ex2;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers do you want to generate?");

        int insertedNum = Integer.parseInt(scanner.nextLine());

        List<Integer> randomNums = createList(insertedNum);

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
        scanner.close();
//        oddOrEvenStamp(randomNums, oddOrEvenChoice == 1);
    }

    public static List<Integer> createList(int insertedNum) {
        List<Integer> randomNums = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < insertedNum; i++) {
            randomNums.add(random.nextInt(0, 101));
        }

        Collections.sort(randomNums);

        return randomNums;
    }

    public static List<Integer> duplicateAndReverse(List<Integer> startingArray) {

        //to avoid ruining the starting array, I'm gonna create a copy of it just to reverse it.
        List<Integer> duplicatedAndSortedArray = new ArrayList<>(startingArray);
        List<Integer> duplicatedArray = new ArrayList<>(startingArray);
        Collections.reverse(duplicatedArray);
        duplicatedAndSortedArray.addAll(duplicatedArray);

        return duplicatedAndSortedArray;
    }

    public static void oddOrEvenStamp(List<Integer> startingArray, boolean order) {
        for (int i = order ? 0 : 1; i < startingArray.size(); i += 2) {
            System.out.println(startingArray.get(i));
        }
    }
}
