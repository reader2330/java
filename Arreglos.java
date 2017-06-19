import java.io.*;

public class Arreglos{

	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);


		int arreglo[] = new int [5];
		int arreglo2[] = {1,2,3,4,5};
		String palabras[] = new String [5];
		String palabras2[] = {"hola","buenos","dias","adios","todos"};


		System.out.println("el numero es"+arreglo2[2]);


		System.out.println("Dame un numero");
		arreglo[0]=Integer.parseInt(br.readLine());
		System.out.println(arreglo[0]);


		for(int i=0;i<5;i++){

			System.out.println("Dame un numero");    //1er cilo arreglo[0]. 2do arreglo[1]
			arreglo[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<5;i++){

			System.out.println("EL numero"+i+" es "+arreglo[i]);
		}


		







	}
}