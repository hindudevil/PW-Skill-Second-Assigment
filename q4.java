import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of test cases: ");
        int t = scanner.nextInt();
        
        for (int i = 1; i <= t; i++) {
            System.out.print("Enter two integers for test case " + i + ": ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int sum = num1 + num2;
            System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
        }
    }
}
