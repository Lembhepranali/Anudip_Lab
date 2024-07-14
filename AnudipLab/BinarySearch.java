package com.AnudipLab;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a list of integers separated by spaces: ");
        String input = scanner.nextLine();

        String[] strArr = input.split(" ");
        int[] arr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        // sort the array
        Arrays.sort(arr);

        // print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.print("Enter an integer to search for: ");
        int target = scanner.nextInt();

        // search for an element using binary search
        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // element not found
    }
}
