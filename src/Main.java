import java.util.Scanner;

public class Main {

    public static void helloWorld(){
        System.out.println("Hello World");
    }

    public static int sum (int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Options Menu");
            System.out.println("1. Hello World!");
            System.out.println("2. Sum");
            System.out.println("6. Exit");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    helloWorld();
                    break;
                    case 2:
                        int result = sum(sc.nextInt(), sc.nextInt());
                        System.out.println("Result -> " + result);
                        break;
                case 6:
                    System.out.println("Exiting...");
                    break;
            }
        }while(option!=6);
        sc.close();
    }
}