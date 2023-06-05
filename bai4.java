import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class bai4
{
    public static void main(String[] args) {
        String fileName = "ip_list.txt"; 

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String ip;
            while ((ip = br.readLine()) != null) {
                try {
                    InetAddress address = InetAddress.getByName(ip);
                    System.out.println(ip + " -> " + address.getHostAddress());
                } catch (UnknownHostException e) {
                    System.out.println(ip + " -> Unknown host");
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
