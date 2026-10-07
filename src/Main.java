import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        int[] arr = {4, 1, 7, 25, 12, 9};
        Arrays.sort(arr);
        int search = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Binary Search: " + binarySearch(arr, scanner.nextInt()));
    }

    public static int binarySearch(int[] arr, int search) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int orta = (left + right) / 2;
            if (arr[orta] == search) {
                return orta;
            } else if (arr[orta] > search) {
                right = orta;
            } else if (arr[orta] < search) {
                left = orta;
            }
        } return -1;
    }
}

//bagi tap
//3 cu gune 50 dene ferqli sert her dovrden de 25 dene