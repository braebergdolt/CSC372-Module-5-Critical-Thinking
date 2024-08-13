import java.util.Scanner;

public class RecursiveSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Please enter five numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int totalSum = sumNumbers(numbers, 0);
        System.out.println("The sum of the five numbers is: " + totalSum);
    }

    public static int sumNumbers(int[] numbers, int index) {
        // Base case: if we've reached the end of the array, return 0
        if (index == numbers.length) {
            return 0;
        }
        // Recursive case: return the current number plus the sum of the rest
        return numbers[index] + sumNumbers(numbers, index + 1);
    }
}
