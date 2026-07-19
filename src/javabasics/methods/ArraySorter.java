package javabasics.methods;

import java.util.Scanner;

public class ArraySorter {

    // Read array from user
    public int[] readArray(Scanner sc) {

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    // Get user choice
    public int getChoice(Scanner sc) {

        System.out.println("Choose Sorting Order");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");

        System.out.print("Enter your choice: ");

        return sc.nextInt();
    }

    // Sort ascending
    public int[] sortAscending(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    // Sort descending
    public int[] sortDescending(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    // Print array
    public void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // Process user choice
    public void processChoice(int choice, int[] arr) {

        switch (choice) {

        case 1:
            System.out.println("Ascending Order:");
            printArray(sortAscending(arr));
            break;

        case 2:
            System.out.println("\nDescending Order:");
            printArray(sortDescending(arr));
            break;

        default:
            System.out.println("Invalid Choice");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArraySorter obj = new ArraySorter();

        int[] arr = obj.readArray(sc);

        int choice = obj.getChoice(sc);

        obj.processChoice(choice, arr);

        sc.close();
    }
}
