import java.net.InetAddress;
import java.net.UnknownHostException;

public class Exercise11 {
	public static void main(String[] args){

		// referenced from http://crunchify.com/how-to-get-server-ip-address-and-hostname-in-java/

		// attempt to initialize and print ip address
		// print Exception output if fail
		try {
			InetAddress ip = InetAddress.getLocalHost();
			System.out.println("Your current IP address: " + ip);
		}
		catch (UnknownHostException ex) {
			ex.printStackTrace();
		}
	}
}