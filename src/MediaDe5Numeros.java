import java.util.Scanner;

public class MediaDe5Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		double media = 0;	
		int[] datos = new int[5];
		
        for (int i=0; i<5; i++) {
            System.out.print( "Deme el dato "+i+": " );
            datos[i] = scan.nextInt();
        }
		
		
        for (int i=0; i<5; i++){
           media = media + datos[i];
        }
        
        media = media /5;
        
        System.out.println("La media de los datos introducidos es de " + media);
	
	}

}
