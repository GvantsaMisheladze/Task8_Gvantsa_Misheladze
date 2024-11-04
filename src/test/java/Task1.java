import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Second integer: ");
        int num2 = scanner.nextInt();

        try {
            int result = num1/num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
