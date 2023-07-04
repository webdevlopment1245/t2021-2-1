import java.util.Scanner;

class program1 {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        scanner.nextLine(); 

        System.out.print("Enter the type of operation (add/subtract/multiply/divide): ");
        String operation = scanner.nextLine();

        double result;

        switch (operation) {
            case "add":
                result = add(a, b);
                System.out.println("Result: " + result);
                break;
            case "subtract":
                result = subtract(a, b);
                System.out.println("Result: " + result);
                break;
            case "multiply":
                result = multiply(a, b);
                System.out.println("Result: " + result);
                break;
            case "divide":
                result = divide(a, b);
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

        scanner.close();
    }
}
