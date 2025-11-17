import java.util.Scanner;

public class AssignmentOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\nInitial value: " + num);

        num += 5;
        System.out.println("After += 5, num = " + num);

        num -= 3;
        System.out.println("After -= 3, num = " + num);

        num *= 2;
        System.out.println("After *= 2, num = " + num);

        sc.close();
    }
}
