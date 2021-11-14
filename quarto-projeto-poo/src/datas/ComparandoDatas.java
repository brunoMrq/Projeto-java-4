package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ComparandoDatas {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021");
		
		Date dataAtualHoje = simpleDateFormat.parse("14/03/2021");
		
		if (dataVencimentoBoleto.after(dataAtualHoje)) {
			System.out.println("Não está vencido");
		}else {
			System.out.println("Está vencido");
		}

		Calendar calendar = Calendar.getInstance(); /*Pega a data Atual*/
		
		//Simular Data que vem do Banco de Dados
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));
		
		calendar.add(calendar.DAY_OF_MONTH, 40); /*Somando 40 dias*/
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
	}

}
