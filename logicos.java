public class logicos{
	public static void main(String args[]){

		int variable1 = 2;
		int variable2 = 0;


		if(variable1 > 5){

			System.out.println("Es verdad");

		}else{
			System.out.println("Es Falso");
		}

		if(variable1<5 && variable2>2){
			System.out.println("Sigue siendo verdad");

		}else{
			System.out.println("Sigue siendo mentira");
		}

		if(variable1<5 || variable2>2){
			System.out.println("Sigue siendo verdad");

		}else{
			System.out.println("Sigue siendo mentira");

		}

		if(!(variable1 > 5)){
			System.out.println("Sigue siendo verdad");

		}else{
			System.out.println("Sigue siendo mentira");

		}

	}
}