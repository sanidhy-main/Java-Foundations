import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args){
        //Testing string methods
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Length of string: " + str.length());
        System.out.println("First Character: " + str.charAt(0));
        System.out.println("Last Character: " + str.charAt(str.length()-1));

        //Reversing a string
        System.out.println("Enter a string: ");
        String fwd = sc.nextLine();
        String bwd = "";

        for (int i = (fwd.length() - 1); i >= 0; i--) {
            bwd = bwd + fwd.charAt(i);
        }
        System.out.println(bwd);
    }
}
