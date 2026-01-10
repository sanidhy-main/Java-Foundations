import java.util.Scanner;

public class ConditionalsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age < 13) {
            System.out.println("Child");
        } else if (age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }
    }
}
