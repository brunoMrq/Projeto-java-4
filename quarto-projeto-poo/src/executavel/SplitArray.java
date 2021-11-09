package executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		
		String texto = "Carcará,pamonheiro,143,190,191,2";
		
		String [] valoresArray = texto.split(",");
		
		/*System.out.println(valoresArray[1]);*/
	
	/* Convertendo um Array para Lista */
		
		List<String> list = Arrays.asList(valoresArray);
		
		for (String d : list) {
			System.out.println(d);
		}
		
	/*Convertendo uma Lista para um Array*/
		
		String[] conversaoArray = list.toArray(new String[6]);
		
		for (int i = 0; i < conversaoArray.length; i++) {
		System.out.println(conversaoArray[i]);
		}
	
	}

}
