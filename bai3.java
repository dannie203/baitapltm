import java.net.InetAddress;
import java.net.UnknownHostException;

public class bai3 {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            String ipAddress = localhost.getHostAddress();
            System.out.println("The IP address of the current machine is: " + ipAddress);
        } catch (UnknownHostException e) {
            System.out.println("Unable to determine IP address of the current machine.");
        }
    }
}
