package procesos_pi_scripts;

//import propiedades;



import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;
import java.awt.Color;

public class procesos_pi {

	private JFrame frmScriptsOnPi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thread.sleep(5000);					
					procesos_pi window = new procesos_pi();
					 email.main(null);
					 arrancar_procesos.main(null);
					window.frmScriptsOnPi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public procesos_pi() {
				
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		final String ruta_landis_to_pi_bat;
		final String ruta_landis_to_pi_bat_manual;
		final String ruta_pi_to_cms_bat;
		final String ruta_pi_to_cms_bat_manual;
		final String ayuda;
		
		
		propiedades Archivopropiedades = new propiedades();
		ruta_landis_to_pi_bat = Archivopropiedades.ruta_landis_to_pi_bat();
		ruta_landis_to_pi_bat_manual = Archivopropiedades.ruta_landis_to_pi_bat_manual();
		
		ruta_pi_to_cms_bat = Archivopropiedades.ruta_pi_to_cms_bat();
		ruta_pi_to_cms_bat_manual = Archivopropiedades.ruta_pi_to_cms_bat_manual();
			
		ayuda = Archivopropiedades.ayuda();
		
		
		
		/**
		
			Desktop desktop = null;
			desktop = Desktop.getDesktop();
			try {
				desktop.open(new File(ruta_landis_to_pi_bat));
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				desktop.open(new File(ruta_pi_to_cms_bat));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			*/
		
		
		
		
		
		
		
		frmScriptsOnPi = new JFrame();
		frmScriptsOnPi.setTitle("Scripts on PI");
		frmScriptsOnPi.setBounds(100, 100, 508, 365);
		frmScriptsOnPi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScriptsOnPi.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 42, 207, 138);
		frmScriptsOnPi.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton Lantis_to_pi = new JButton("Start");
		Lantis_to_pi.setToolTipText("1_landis.bat");
		Lantis_to_pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Desktop desktop = null;
					desktop = Desktop.getDesktop();
					desktop.open(new File(ruta_landis_to_pi_bat));
					//desktop.open(new File("D://scripts//1_landisB.bat"));
					
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}	
				
			
				
								
			}
		});
		Lantis_to_pi.setBounds(10, 34, 89, 23);
		panel.add(Lantis_to_pi);
		
		JLabel lblFromLandisTo = new JLabel("From Landis to PI");
		lblFromLandisTo.setBounds(10, 9, 137, 14);
		panel.add(lblFromLandisTo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(10, 203, 207, 74);
		frmScriptsOnPi.getContentPane().add(panel_1);
		
		JButton landis_manual = new JButton("Start");
		landis_manual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop desktop = null;
					desktop = Desktop.getDesktop();
					desktop.open(new File(ruta_landis_to_pi_bat_manual));
					
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}	
				
				
			}
		});
		landis_manual.setToolTipText("landis_manual.bat");
		landis_manual.setBounds(10, 34, 89, 23);
		panel_1.add(landis_manual);
		
		JLabel label = new JLabel("From Landis to PI");
		label.setBounds(10, 9, 137, 14);
		panel_1.add(label);
		
		JLabel lblManual = new JLabel("Manual");
		lblManual.setBounds(20, 184, 46, 14);
		frmScriptsOnPi.getContentPane().add(lblManual);
		
		JLabel lblAutomatico = new JLabel("Automatic");
		lblAutomatico.setBounds(20, 22, 107, 14);
		frmScriptsOnPi.getContentPane().add(lblAutomatico);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(251, 42, 207, 138);
		frmScriptsOnPi.getContentPane().add(panel_2);
		
		JButton pi_to_cms = new JButton("Start");
		pi_to_cms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop desktop = null;
					desktop = Desktop.getDesktop();
					desktop.open(new File(ruta_pi_to_cms_bat));
					
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}	
				

			
				
			}
		});
		pi_to_cms.setToolTipText("2_pi_to_cms_with_hourly_values.bat");
		pi_to_cms.setBounds(10, 34, 89, 23);
		panel_2.add(pi_to_cms);
		
		JLabel lblFromPiTo = new JLabel("From PI to CMS");
		lblFromPiTo.setBounds(10, 9, 137, 14);
		panel_2.add(lblFromPiTo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBounds(251, 203, 207, 74);
		frmScriptsOnPi.getContentPane().add(panel_3);
		
		JButton fiscal_meter_to_pi_manual = new JButton("Start");
		fiscal_meter_to_pi_manual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop desktop = null;
					desktop = Desktop.getDesktop();
					desktop.open(new File(ruta_pi_to_cms_bat_manual));
					
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}	
				
				
				
			}
		});
		fiscal_meter_to_pi_manual.setToolTipText("pi_cms_fiscalmeter.bat");
		fiscal_meter_to_pi_manual.setBounds(10, 34, 89, 23);
		panel_3.add(fiscal_meter_to_pi_manual);
		
		JLabel lblFromPiTo_1 = new JLabel("From PI to CMS (FiscalMeter.TAG)");
		lblFromPiTo_1.setBounds(10, 9, 187, 14);
		panel_3.add(lblFromPiTo_1);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop desktop = null;
					desktop = Desktop.getDesktop();
					desktop.open(new File(ayuda));
					
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}	
				
				
			}
		});
		btnHelp.setBounds(369, 11, 89, 23);
		frmScriptsOnPi.getContentPane().add(btnHelp);
		
		JLabel lblElArranqueEst = new JLabel("El arranque est\u00E1 demorado en 100segundos para dar tiempo a enviar un email");
		lblElArranqueEst.setForeground(Color.RED);
		lblElArranqueEst.setBounds(10, 288, 448, 28);
		frmScriptsOnPi.getContentPane().add(lblElArranqueEst);
	}
}
