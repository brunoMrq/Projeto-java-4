package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class FaixaData {

	public static void main(String[] args) throws ParseException {

	//	Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021");
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-02-01"), LocalDate.now());
		System.out.println("Possui "+dias+ " entre as datas apresentadas");
	
	
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("08/04/2021");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		for (int parcela = 1; parcela <=12; parcela ++) {
			calendar.add(Calendar.MONTH, 1);
			System.out.println("Parcela número: " +parcela+ " vencimento é em: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
		
	}
	
}
