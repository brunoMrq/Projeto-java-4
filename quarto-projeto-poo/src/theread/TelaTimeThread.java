package theread;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.*;
import javax.swing.JDialog;
import javax.swing.plaf.DimensionUIResource;

public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel descricaoHora = new JLabel("Time da Thread 1");
	private JTextField motraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time da Thread 2");
	private JTextField motraTempo2 = new JTextField();
	
	private JButton jbuton = new JButton("Start");
	private JButton jbuton1 = new JButton("Stop");
	
	private Runnable thread = new Runnable() {
		public void run() {
			while(true) {
				motraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private Thread thread1Time;
	
	
	public TelaTimeThread() {
		
		setTitle("Minha Tela de Time com Thread");
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
		motraTempo.setEditable(false);
		gridBagConstraints.gridy ++;
		jPanel.add(motraTempo, gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		motraTempo2.setPreferredSize(new Dimension(200, 25));
		motraTempo2.setEditable(false);
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
				thread1Time = new Thread(thread);
				thread1Time.start();
			}
		});
		
		jbuton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				
			}
			
		});
		
		add(jPanel, BorderLayout.WEST);
		/*Sempre será o ultimo comando */ 
		setVisible(true);
		
	}
	
}
