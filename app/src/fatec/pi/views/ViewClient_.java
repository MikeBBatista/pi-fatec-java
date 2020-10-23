package fatec.pi.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;

public class ViewClient_ extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewClient_ frame = new ViewClient_();
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
	public ViewClient_() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204,223,214));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204,223,214));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(224)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
					.addGap(252))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 758, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(95, 158, 160));
		
		JLabel lblCadastroCliente = new JLabel("CADASTRO CLIENTE");
		lblCadastroCliente.setForeground(Color.WHITE);
		lblCadastroCliente.setFont(new Font("Arial", Font.BOLD, 12));
		panel_1.add(lblCadastroCliente);
		
		JLabel lbl_cnpj = new JLabel("CNPJ - Fornecedora");
		lbl_cnpj.setFont(new Font("Arial", Font.BOLD, 11));
		
		JFormattedTextField text_CNPJSupplier_1 = new JFormattedTextField();
		text_CNPJSupplier_1.setForeground(Color.BLACK);
		text_CNPJSupplier_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("");
		
		JLabel lbl_clientname = new JLabel("NOME");
		lbl_clientname.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lbl_clientcnpjcpf = new JLabel("CPF / CNPJ");
		lbl_clientcnpjcpf.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lbl_cep = new JLabel("CEP");
		lbl_cep.setFont(new Font("Arial", Font.BOLD, 11));
		
		JFormattedTextField textField_cep_1 = new JFormattedTextField((Object) null);
		textField_cep_1.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		
		JLabel lbl_street = new JLabel("Logradouro");
		lbl_street.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lbl_num = new JLabel("N\u00FAmero");
		lbl_num.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lbl_adress = new JLabel("Complemento");
		lbl_adress.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lbl_city = new JLabel("Cidade");
		lbl_city.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lbl_num_1 = new JLabel("UF");
		lbl_num_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lbl_nummedidor = new JLabel("N\u00FAmero do Medidor");
		lbl_nummedidor.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JLabel lbl_street_1 = new JLabel("Roteiro de Leitura");
		lbl_street_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JLabel lbl_street_1_1 = new JLabel("Classe");
		lbl_street_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lbl_street_1_2 = new JLabel("Subclasse");
		lbl_street_1_2.setFont(new Font("Arial", Font.BOLD, 11));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		
		JLabel lbl_street_1_1_1 = new JLabel("Tarifa (R$)");
		lbl_street_1_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lbl_street_1_1_1_1 = new JLabel("Tarifa com Imposto (R$)");
		lbl_street_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("SALVAR");
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 13));
		
		JButton btnNewButton_2_1 = new JButton("VOLTAR");
		btnNewButton_2_1.setFont(new Font("Arial", Font.BOLD, 13));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(88)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_street_1_1_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lbl_street_1_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBox, 0, 149, Short.MAX_VALUE)
										.addComponent(textField_9, 144, 144, 144))
									.addGap(36)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(comboBox_1, 0, 149, Short.MAX_VALUE)
										.addComponent(lbl_street_1_2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addComponent(lbl_street_1_1_1_1, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
										.addComponent(textField_10, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
										.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
									.addGap(59))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lbl_street_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
									.addGap(60))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
										.addComponent(lbl_cnpj, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(text_CNPJSupplier_1, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
											.addGap(10)
											.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
											.addGap(1))
										.addComponent(lbl_clientname, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
											.addGap(1))
										.addComponent(lbl_clientcnpjcpf, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
											.addGap(1))
										.addComponent(lbl_cep, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField_cep_1, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
											.addGap(6)
											.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
											.addGap(5))
										.addComponent(lbl_street, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
											.addGap(1))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lbl_num, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addGap(77)
											.addComponent(lbl_adress, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
											.addGap(46)
											.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
											.addGap(1))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lbl_city, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
											.addGap(151)
											.addComponent(lbl_num_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
											.addGap(57)
											.addComponent(textField_6, 91, 91, 91)
											.addGap(1))
										.addComponent(lbl_nummedidor, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
											.addGap(1)))
									.addGap(59)))
							.addGap(17))
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lbl_cnpj)
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(text_CNPJSupplier_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(lbl_clientname)
					.addGap(6)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lbl_clientcnpjcpf)
					.addGap(6)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lbl_cep)
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_cep_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(lbl_street)
					.addGap(6)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_num)
						.addComponent(lbl_adress))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_city)
						.addComponent(lbl_num_1))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(lbl_nummedidor)
					.addGap(6)
					.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lbl_street_1)
					.addGap(6)
					.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_street_1_1)
						.addComponent(lbl_street_1_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_street_1_1_1)
						.addComponent(lbl_street_1_1_1_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
