import java.util.Scanner;

public class MesesDelA�o {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int mes = 0;
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		
		do {
			
			System.out.println("introduce un numero y te dire cual es ese mes");
			mes =scan.nextInt();
			
			System.out.println("El mes n� " + mes + " es " + meses[mes-1]  );
				
			}while(mes < 12 || mes > 1);
		
	}
}
