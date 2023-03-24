import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: , Enter your roll number: , Enter your field of interest:");
        String first_name = sc.next();
        String last_name = sc.next();
        int roll = sc.nextInt();
        String intrest = sc.next();
        System.out.println("name = "+first_name + " " +last_name  );
        System.out.println("Roll = "+roll);
        System.out.println("Intrest = "+intrest);
    }
}
