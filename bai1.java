import java.util.Scanner;

public class bai1 
{
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a;
        while (!scanner.hasNextInt()) 
        {
            System.out.println("Invalid input! Please enter an integer.");
            scanner.next();
        }
        a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b;
        while (!scanner.hasNextInt()) 
        {
            System.out.println("Invalid input! Please enter an integer.");
            scanner.next();
        }
        b = scanner.nextInt();
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);

        
        scanner.close();
    }
}
