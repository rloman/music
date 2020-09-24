package nl.rug.arrayssorting;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[] numbers = {6,4,2,8};

        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 8));
        System.out.println(Arrays.binarySearch(numbers, 9));

        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 9));

        // fibon
        int[] fibon = {0,1,1,2,3,5,8,13,21,34,55,89,144,233};

        System.out.println(Arrays.binarySearch(fibon, 8)); // 6

        System.out.println(Arrays.binarySearch(fibon, 4)); // wat vier? moet op 5. *-1 -1 = -6
    }
}
