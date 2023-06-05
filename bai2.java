import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class bai2 
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the website domain: ");
        String domain = scanner.nextLine();

        try 
        {
           
            InetAddress ipAddress = InetAddress.getByName(domain);
            String ip = ipAddress.getHostAddress();

            
            System.out.println("The IP address of " + domain + " is: " + ip);
        } 
        
        catch (UnknownHostException e) 
        {
            System.out.println("Unknown host: " + domain);
        }

        
        scanner.close();
    }
}
