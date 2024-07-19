import java.util.Scanner;

public class Main {

    public static void helloWorld() {
        System.out.println("Hello World");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean evenOrOdd(int a) {
        return a % 2 == 0;
    }

    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f *= i;
        }
        return f;
    }

    public static int[] multiplicationTable(int a, int b) {
        int[] table = new int[a];
        for (int i = 0; i < a; i++) {
            table[i] = (i + 1) * b;
        }
        return table;
    }

    public static void findMinMax() {
        Scanner sc = new Scanner(System.in);
        int number, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        System.out.println("Enter numbers (negative number to end): ");
        while (true) {
            number = sc.nextInt();
            if (number < 0) {
                break;
            }
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        if (max == Integer.MIN_VALUE && min == Integer.MAX_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Maximum number: " + max);
            System.out.println("Minimum number: " + min);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Options Menu");
            System.out.println("1. Hello World!");
            System.out.println("2. Sum");
            System.out.println("3. Even or odd");
            System.out.println("4. Factorial");
            System.out.println("5. Multiplication table");
            System.out.println("999. Bonus: Find Min and Max");
            System.out.println("6. Exit");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    helloWorld();
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int result = sum(a, b);
                    System.out.println("Result -> " + result);
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    a = sc.nextInt();
                    boolean isEven = evenOrOdd(a);
                    System.out.println("The number is " + (isEven ? "even" : "odd"));
                    break;
                case 4:
                    System.out.print("Enter a number: ");
                    a = sc.nextInt();
                    int factorialResult = factorial(a);
                    System.out.println("Factorial -> " + factorialResult);
                    break;
                case 5:
                    System.out.print("Enter the number of elements: ");
                    a = sc.nextInt();
                    System.out.print("Enter the multiplier: ");
                    b = sc.nextInt();
                    int[] table = multiplicationTable(a, b);
                    System.out.println("Multiplication Table:");
                    for (int i = 0; i < table.length; i++) {
                        System.out.println((i + 1) + " * " + b + " = " + table[i]);
                    }
                    break;
                case 999:
                    findMinMax();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 6);
        sc.close();
    }
}