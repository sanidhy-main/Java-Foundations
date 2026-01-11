import java.util.Scanner;
public class ExceptionsDemo {
    public static void main(String[] args) {
        //Program 1
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter another number: ");
        int b = sc.nextInt();

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        //Program 2
        int[] arr = {1, 2, 3};
        System.out.println("Enter an index (0-2): ");
        int index = sc.nextInt();

        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
    }
}