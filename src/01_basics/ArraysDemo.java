import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        //Program 1: Printing an array's elements
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        //Program 2: Sum and Maximum Element of a user-made array
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr2 = new int[n];
        for (int j = 0; j < n; j++) {
            arr2[j] = sc.nextInt();
        }
        int sum = 0;
        for (int k = 0; k < n; k++) {
            sum += arr2[k];
        }
        System.out.println(sum);
        int max = arr2[0];
        for (int x = 0; x < n; x++) {
            if (arr2[x] > max) {
                max = arr2[x];
            }
        }
        System.out.println(max);
        }
    }

