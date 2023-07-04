import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.println("Output:");

        int number = 1;
        for (int i = 1; i <= a; i++) {
            System.out.print(number + " ");
            number += 2;
        }

        System.out.println();

        scanner.close();
    }
}
