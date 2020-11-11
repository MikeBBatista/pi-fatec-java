package fatec.pi.views;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fatec.pi.controllers.SupplierController;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JRadioButton;

public class ViewSupplier extends JFrame {

	private JPanel contentPane;
	private JTextField text_companyname;
	private JTextField text_CNPJ;
	private JTextField text_CNPJ_1;
	private JTextField text_site;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSupplier frame = new ViewSupplier();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewSupplier() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204,223,214));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		
		text_companyname = new JTextField();
		text_companyname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Empresa Fornecedora");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lblNewLabel_1_1 = new JLabel("CNPJ");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		text_CNPJ = new JTextField();
		try {
			javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("##.###.###/####-##");
			text_CNPJ_1 = new javax.swing.JFormattedTextField(format_textField3);
			} catch (Exception e){}
		text_CNPJ_1.setForeground(Color.BLACK);
		text_CNPJ_1.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Site");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		text_site = new JTextField();
		text_site.setColumns(10);
		
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SupplierController.saveValues(formataDados(text_CNPJ_1.getText()), text_companyname.getText(),text_site.getText(), 0);
				text_CNPJ_1.setText("");
				text_companyname.setText("");
				text_site.setText("");
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton.setMnemonic(KeyEvent.VK_S);
		
		JLabel lbl_title = new JLabel("");
		lbl_title.setIcon(new ImageIcon(ViewSupplier.class.getResource("/img/rsz_poc_verde.png")));
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewMain voltamenu = new ViewMain();
				voltamenu.setVisible(true);
				setVisible(false);
				
			}
		});
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 11));
		btnVoltar.setMnemonic(KeyEvent.VK_B);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tipo de Fornecimento");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 11));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("  \u00C1GUA");
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.BOLD, 12));
		rdbtnNewRadioButton.setBackground(new Color(204, 223, 214));
		
		JRadioButton rdbtnEnergia = new JRadioButton("  ENERGIA");
		rdbtnEnergia.setFont(new Font("Arial", Font.BOLD, 12));
		rdbtnEnergia.setBackground(new Color(204, 223, 214));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(341)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1_1_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(text_CNPJ_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, Alignment.LEADING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
							.addGap(75)
							.addComponent(btnVoltar, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
						.addComponent(text_site, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
							.addGap(127)
							.addComponent(rdbtnEnergia, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(99)
							.addComponent(lbl_title, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
							.addGap(93))
						.addComponent(text_companyname, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
					.addGap(320))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(45)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_2)
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnEnergia))
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(text_companyname, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_1)
					.addGap(6)
					.addComponent(text_CNPJ_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_1_1)
					.addGap(6)
					.addComponent(text_site, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnVoltar))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lbl_title, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addGap(71))
		);
		
		JLabel lblNewLabel = new JLabel("CADASTRO FORNECEDOR");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(lblNewLabel);
		contentPane.setLayout(gl_contentPane);
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	//Func Trata Dados
	public static String formataDados(String dado){
		
		   return dado.replaceAll("[^0-9]+", "");
		}
}
