import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
    int j = 2;

    // For Loop (Prints 1-10)
    for (int i = 1; i <= 10; i++) {
        System.out.println(i);
    }

    //While Loop (Prints even numbers from 2-20)
    while (j <= 20) {
        System.out.println(j);
        j += 2;
    }

    //Small Program using 'Continue' (Avoids numbers divisible by 3)
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
        if (i % 3 == 0) {
            continue;
        }
        System.out.println(i);
    }

    }
}