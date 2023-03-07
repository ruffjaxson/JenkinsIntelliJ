import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");

            if (tokens[0].equals("add")) {
                int a = Integer.parseInt(tokens[1]);
                int b = Integer.parseInt(tokens[2]);
                System.out.println(calculator.add(a, b));
            } else if (tokens[0].equals("subtract")) {
                int a = Integer.parseInt(tokens[1]);
                int b = Integer.parseInt(tokens[2]);
                System.out.println(calculator.subtract(a, b));
            } else if (tokens[0].equals("multiply")) {
                int a = Integer.parseInt(tokens[1]);
                int b = Integer.parseInt(tokens[2]);
                System.out.println(calculator.multiply(a, b));
            } else if (tokens[0].equals("divide")) {
                int a = Integer.parseInt(tokens[1]);
                int b = Integer.parseInt(tokens[2]);
                System.out.println(calculator.divide(a, b));
            } else if (tokens[0].equals("fibonacci")) {
                int n = Integer.parseInt(tokens[1]);
                System.out.println(calculator.fibonacciNumberFinder(n));
            } else if (tokens[0].equals("binary")) {
                int n = Integer.parseInt(tokens[1]);
                System.out.println(calculator.intToBinaryNumber(n));
            } else if (tokens[0].equals("quit")) {
                break;
            }
        }
        scanner.close();
    }
}
