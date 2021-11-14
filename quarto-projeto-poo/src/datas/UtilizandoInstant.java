package datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class UtilizandoInstant {

	public static void main(String[] args) throws InterruptedException {
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Duração em nano Segundos: " + duracao.toNanos());
		System.out.println("---------------------------------------------------");
		
		LocalDate dataAntiga = LocalDate.of(2019, 2, 7);
		LocalDate dataNova = LocalDate.of(2021, 7, 4);
		
		Period periodo = Period.between(dataAntiga, dataNova);
		System.out.println("O periodo em dias é: " + periodo.getDays());
		
	}

}
