import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class bai5 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) 
        {
            System.out.print("Enter a website address (or 'exit' to quit): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) 
            {
                break;
            }

            try 
            {
                InetAddress address = InetAddress.getByName(input);
                boolean isConnected = address.isReachable(5000); 

                if (isConnected) {
                    System.out.println("Connection to " + input + " successful");
                } else {
                    System.out.println("Connection to " + input + " failed");
                }
            } 
            
            
            catch (UnknownHostException e) 
            {
                System.out.println("Unknown host: " + input);
            } 
            
            
            catch (Exception e) {
                System.out.println("Error occurred while connecting to " + input + ": " + e.getMessage());
            }
        }
        scanner.close();
    }
}
