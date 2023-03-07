import java.util.Scanner;
import java.util.UUID;

class Calculator {


    Calculator(){

    }

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

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    0 = 0
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    int fibonacciNumberFinder(int n){
        if (n <= 1) {
            return n;
        }

        int fibNum = 1;
        int prevFibNum = 1;

        for (int i = 2; i < n; i++) {
            int temp = fibNum;
            fibNum += prevFibNum;
            prevFibNum = temp;
        }

        return fibNum;
    }


    /*
    Returns binary value of the given int number
    The binary number should be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
    Tip: use “Integer.toBinaryString(n)”
     */
    String intToBinaryNumber(int n){
        return Integer.toBinaryString(n);
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n){
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return n + uuid;
    }


}
