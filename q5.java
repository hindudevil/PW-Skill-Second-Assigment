import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String line1 = sc.next();
            String line2 = sc.next();
            System.out.println(line1+line2);
        }
    }
}
