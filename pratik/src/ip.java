import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;


public class ip {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		Scanner s=new Scanner(System.in);
		String se=s.nextLine();
		System.out.println(InetAddress.getByName(se));
		System.out.println(InetAddress.getLocalHost());
	}

}
