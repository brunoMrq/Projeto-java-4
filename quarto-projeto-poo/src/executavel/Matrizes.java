package executavel;

public class Matrizes {

	public static void main(String[] args) {
		
		int notas [][] = new int[2][3];
		
		notas [0][0] = 3;
		notas [0][1] = 7;
		notas [0][2] = 4;
		
		notas [1][0] = 2;
		notas [1][1] = 5;
		notas [1][2] = 9;
		
		for (int i =0; i < notas.length ; i++) {
			
			System.out.println("=================================");
			
			for (int j=0 ;j < notas[i].length ; j++ ) {
				System.out.println(notas[i][j]);
			}
		}
	}

}
