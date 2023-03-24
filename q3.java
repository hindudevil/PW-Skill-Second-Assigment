import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the marks obtained in Computer :- ");
        double marks1 = sc.nextDouble();
        
        System.out.print("Enter the marks obtained in English :- ");
        double marks2 = sc.nextDouble();
        
        System.out.print("Enter the marks obtained in Maths :- ");
        double marks3 = sc.nextDouble();
        
        double totalMarks = marks1 + marks2 + marks3;
        double percentageMarks = (totalMarks / 300) * 100;
        
        System.out.println("Total marks obtained: " + totalMarks);
        System.out.println("Percentage marks obtained: " + percentageMarks + "%");
    }
}
