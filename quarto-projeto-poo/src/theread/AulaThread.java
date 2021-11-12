package theread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		/*Thread rodando em paralelo*/
		Thread threadEmail = new Thread(thread1); 
		threadEmail.start();
		
		Thread threadNotaFiscal = new Thread(thread2); 
		threadNotaFiscal.start();
		
		
		System.out.println("CHEGOU O FIM DO CÓDIGO TESTE");
		JOptionPane.showMessageDialog(null, "Fim do Sistema");
		
	}

	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
		
			for (int pos = 0; pos < 10; pos++) {
					
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} /* Espera 1000 milesegundos = 1s */
				
				System.out.println("Executando uma rotina, envio email");
			}			
			
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			for (int pos = 0; pos < 10; pos++) {
				
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} /* Espera 1000 milesegundos = 1s */
				
				System.out.println("Executando uma rotina, envio nota fiscal");
			}	
			
		}
	};
}
