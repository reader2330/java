import java.io.*;

public class Lector{

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Dame un número");

        String x = "a";
        int numero =0;

        System.out.println("Dame un número");
        numero=Integer.parseInt(br.readLine());
        System.out.println("Dame una palabra");
        x=br.readLine();

        System.out.println("Tu numero fue : "+numero);
        System.out.println("Tu plabra fuen :"+x);

	}
}