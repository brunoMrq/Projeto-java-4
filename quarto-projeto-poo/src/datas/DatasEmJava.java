package datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();
		Date date1 = new Date();
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("mm");
		
		System.out.println("Hoje é dia: " + date.getDate() +" e são: "+ date.getHours()+":" 
		+ simpleDateFormat1.format(date));
		System.out.println("Hoje é dia:" + calendar.get(Calendar.DATE) +" e são: "+ calendar.get(Calendar.HOUR));
		
		/*----------------- Simple Date Format ------------------*/
		
		System.out.println("-------------------------------------------------------");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm"); 
		/*Se o "H" estiver em maiusculo o formato da hora é: 24h
		 Em minusculo é formato 12h.*/
		
		
		System.out.println(simpleDateFormat.format(date));
		System.out.println(simpleDateFormat.format(calendar.getInstance().getTime())); /*Utilizando o Calendar*/
		
		System.out.println("-------------------------------------------------------");
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); /*Formato Padrão para Banco de dados*/
		System.out.println("Data em Formato para Banco de Dados: " + simpleDateFormat.format(date));
		System.out.println("Data em Formato para Banco de Dados: " + simpleDateFormat.format(calendar.getInstance().getTime()));
		
	}

}
