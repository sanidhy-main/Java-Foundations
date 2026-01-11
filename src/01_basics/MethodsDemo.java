import java.util.Scanner;

public class MethodsDemo {
    static int square(int x) {
        return x * x;
    }

    static boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The square of 'n' is " + square(n));
        System.out.println("'n' is Even: " + isEven(n));
    }
}
