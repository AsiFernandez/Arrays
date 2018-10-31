import java.util.Scanner;

public class NumeroMaximoYNumeroMinimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int[] numeros = new int[8];
		
		
		
		for(int i = 0; i < 8; i++) {
			System.out.print ("introduce un numero " + "\n");
			numeros[i] = scan.nextInt();
		}
		
		int minimo = numeros[0];
		int maximo = numeros[0];
		
		for(int i = 0; i < 8; i++) {
			
			if(numeros[i] < minimo)
			{
				minimo=numeros[i];
			}else if(numeros[i] > maximo) {
				maximo = numeros[i];
			}
			
		}
		
		System.out.println("El numero mas pequeño es " + minimo);
		System.out.println("El numero mas grande es " + maximo);
		
		
		
	}

}
