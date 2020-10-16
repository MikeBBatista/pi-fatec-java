package fatec.pi.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class ViewSucess {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSucess window = new ViewSucess();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewSucess() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDadosSalvosCom = new JLabel("Dados Salvos com Sucesso");
		lblDadosSalvosCom.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDadosSalvosCom.setBounds(113, 94, 217, 36);
		frame.getContentPane().add(lblDadosSalvosCom);
	}
}
