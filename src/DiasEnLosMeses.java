import java.util.Scanner;

public class DiasEnLosMeses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int mes= 0;
		int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		do {
			
		System.out.println("introduce un numero y te dire cuantos dias tiene ese mes");
		mes =scan.nextInt();
		
		System.out.print("El mes nº " + mes + " tiene un total de " + dias[mes] + " dias");
			
		}while(mes > 12 || mes < 1);
	}

}
