package theread;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.*;
import javax.swing.JDialog;
import javax.swing.plaf.DimensionUIResource;

public class ThreadFinal extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField motraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField motraTempo2 = new JTextField();
	
	private JButton jbuton = new JButton("Add Lista");
	private JButton jbuton1 = new JButton("Stop");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	public ThreadFinal() {
		
		setTitle("Minha Tela - Thread");
		setSize(new DimensionUIResource(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2; /*Define a quantidade de células que um elemento ira ocupar, como se fosse o mesclar células do excel*/
		gridBagConstraints.insets = new Insets(5, 10, 5, 5); /* Define a margem*/
		gridBagConstraints.anchor = GridBagConstraints.WEST; /* Define o alinhamento dos elementos da tela*/
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		motraTempo.setPreferredSize(new Dimension(200, 25));
		motraTempo.setEditable(true);
		gridBagConstraints.gridy ++;
		jPanel.add(motraTempo, gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		motraTempo2.setPreferredSize(new Dimension(200, 25));
		motraTempo2.setEditable(true);
		gridBagConstraints.gridy ++;
		jPanel.add(motraTempo2, gridBagConstraints);
		
		
		gridBagConstraints.gridwidth = 1;
		jbuton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(jbuton, gridBagConstraints);
		
		jbuton1.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridx ++;
		jPanel.add(jbuton1, gridBagConstraints);
		
		jbuton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}else {
				for (int i =0; i<100; i++) {
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(motraTempo.getText() + i);
				filaThread.setEmail(motraTempo2.getText() + i);
				fila.add(filaThread);
			}
			}
				jbuton1.setEnabled(true);
			}
		});
		
		jbuton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fila.stop();
				fila = null;
				jbuton1.setEnabled(false);
			}
			
		});
		
		jbuton1.setEnabled(true);
		
		fila.start();
		add(jPanel, BorderLayout.WEST);
		/*Sempre será o ultimo comando */ 
		setVisible(true);
		
	}
	
}
