 import java.util.Scanner;

public class ArrayExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Input values
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Output values
        System.out.println("You entered:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

