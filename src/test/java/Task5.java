import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Enter an array index:");
        int index = scanner.nextInt();
        System.out.println("Enter an integer to divide by:");
        int divisor = scanner.nextInt();

        try {
            int value = array[index];
            System.out.println("Array element at index " + index + ": " + value);
            int result = 100 / divisor;
            System.out.println("Result of division: 100 / " + divisor + " = " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            scanner.close();
        }
    }
}
