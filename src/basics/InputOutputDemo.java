import java.util.Scanner; //allows inputs to be taken

public class InputOutputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine(); //must manually consume newline after nextInt and nextDouble,
        // next time onwards, group numerical inputs together
        String name = sc.nextLine();
        double height = sc.nextDouble();

        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
    }
}
