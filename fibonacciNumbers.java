import java.util.Scanner;

public class fibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci sequences to calculate: ");

        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int[] fibonacciNumbers = new int[n];
        fibonacciNumbers[0] = 0;
        if (n > 1) {
            fibonacciNumbers[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println("Fibonacci(" + i + ") = " + fibonacciNumbers[i]);
        }
    }
}