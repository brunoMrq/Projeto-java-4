package datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NovaAPI {

	public static void main(String[] args) {
		
	// Nova API de data Java 8
		
	LocalDate dataAtual = LocalDate.now();
	System.out.println("Data atual: " + dataAtual);
	
	LocalTime horaAtual = LocalTime.now();
	System.out.println("Hora Atual: " + horaAtual);
	
	LocalDateTime dataAtualcomHora = LocalDateTime.now();
	System.out.println("Data é hora atual: " + dataAtualcomHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
	LocalDate localDate = LocalDate.now();
	System.out.println("Data atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	
	System.out.println("Dia do mês: " + localDate.getDayOfMonth());
	
	System.out.println("Dia do Ano: " + localDate.getDayOfYear());
	
	System.out.println("Dia da semana: " + localDate.getDayOfWeek());
	
	System.out.println("--------------------------------------------------");
	
	
	}

}
