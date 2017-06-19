public class Ejercicio{

	public static void main(String args[]){

		int numero =10;
		int resultado;

		if(numero>=1 && numero<=1000){

           resultado = numero % 2;

             if(resultado==0){

             	System.out.print("El "+numero+"es par");

             }else{

             	System.out.println("El"+numero+"es impar");

             }
		}else{

			System.out.println("El"+numero+ "no es valido");
		}
	}
}