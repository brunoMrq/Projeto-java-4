package datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) {
		
		Date date = new Date();
		Date date1 = new Date();
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("mm");
		
		System.out.println("Hoje � dia: " + date.getDate() +" e s�o: "+ date.getHours()+":" 
		+ simpleDateFormat1.format(date));

		/*----------------- Simple Date Format ------------------*/
		
		System.out.println("-------------------------------------------------------");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm"); 
		/*Se o "H" estiver em maiusculo o formato da hora �: 24h
		 Em minusculo � formato 12h.*/
		
		System.out.println(simpleDateFormat.format(date));
		
		System.out.println("-------------------------------------------------------");
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); /*Formato Padr�o para Banco de dados*/
		System.out.println("Data em Formato para Banco de Dados: " + simpleDateFormat.format(date));
		
		
	}

}
