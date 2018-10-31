package ArrayBidimensional;

public class RellenarFilaConA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] filas = new String[4][4];
		
		for(int i = 0; i < 6; i++) {
			for(int j= 0; j < 6; j++) {
				if(i == 2) {
					filas[i][j] = "A";
				}
			}
			
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j= 0; j<5; j++) {
				System.out.println(filas[i][j]);
			}
			
		}
		

	}

}
