public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        String text = null;
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds.");
        }
        try {
            System.out.println(text.length());
        } catch (NullPointerException e){
            System.out.println("String variable is null.");
        }
    }
}
