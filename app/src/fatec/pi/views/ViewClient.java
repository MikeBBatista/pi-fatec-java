package fatec.pi.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField$AbstractFormatter;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class ViewClient extends JFrame {

	private JPanel contentPane;
	private JTextField textField_cep;
	private JTextField textField_clientname;
	private JTextField textField_clientcpf;
	private JTextField textField_street;
	private JTextField textField_num;
	private JTextField textField_adress;
	private JTextField textField_city;
	private JTextField textField_uf;
	private JTextField textField_nummedidor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewClient frame = new ViewClient();
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
	public ViewClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204,223,214));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204,223,214));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(95, 158, 160));
		
		JLabel lblCadastroCliente = new JLabel("CADASTRO CLIENTE");
		lblCadastroCliente.setForeground(Color.WHITE);
		lblCadastroCliente.setFont(new Font("Arial", Font.BOLD, 12));
		panel_1.add(lblCadastroCliente);
		
		JFormattedTextField text_CNPJSupplier = new JFormattedTextField();
		text_CNPJSupplier.setText("");
		try {
			javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("##.###.###/####-##");
			} catch (Exception e){}
		
		textField_cep = new JTextField();
		try {
			javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("#####-###");
			} catch (Exception e){}
		
		JLabel lbl_cnpj = new JLabel("CNPJ - Fornecedora");
		lbl_cnpj.setFont(new Font("Arial", Font.BOLD, 11));
		
		JFormattedTextField text_CNPJSupplier_1 = new JFormattedTextField();
		text_CNPJSupplier_1.setForeground(Color.BLACK);
		text_CNPJSupplier_1.setColumns(10);
		
		JLabel lbl_clientname = new JLabel("NOME");
		lbl_clientname.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_clientname = new JTextField();
		textField_clientname.setColumns(10);
		
		JLabel lbl_clientcnpjcpf = new JLabel("CPF / CNPJ");
		lbl_clientcnpjcpf.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_clientcpf = new JTextField();
		textField_clientcpf.setColumns(10);
		
		JLabel lbl_cep = new JLabel("CEP");
		lbl_cep.setFont(new Font("Arial", Font.BOLD, 11));
		
		JFormattedTextField textField_cep_1 = new JFormattedTextField((AbstractFormatter) null);
		textField_cep_1.setColumns(10);
		
		JLabel lbl_search_1 = new JLabel("");
		
		JLabel lbl_street = new JLabel("Logradouro");
		lbl_street.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_street = new JTextField();
		textField_street.setColumns(10);
		
		JLabel lbl_num = new JLabel("N\u00FAmero");
		lbl_num.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_num = new JTextField();
		textField_num.setColumns(10);
		
		JLabel lbl_adress = new JLabel("Complemento");
		lbl_adress.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_adress = new JTextField();
		textField_adress.setColumns(10);
		
		JLabel lbl_city = new JLabel("Cidade");
		lbl_city.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_city = new JTextField();
		textField_city.setColumns(10);
		
		JLabel lbl_num_1 = new JLabel("UF");
		lbl_num_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_uf = new JTextField();
		textField_uf.setColumns(10);
		
		JLabel lbl_nummedidor = new JLabel("Logradouro");
		lbl_nummedidor.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_nummedidor = new JTextField();
		textField_nummedidor.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(ViewClient.class.getResource("/img/search_box_green.png")));
		btnNewButton.setSelectedIcon(new ImageIcon(ViewClient.class.getResource("/img/search_box_green.png")));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(ViewClient.class.getResource("/img/search_box_green.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(115)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lbl_nummedidor, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_nummedidor, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(textField_city, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lbl_city, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addComponent(lbl_cnpj, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
											.addComponent(lbl_clientname, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
											.addComponent(lbl_clientcnpjcpf, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
											.addComponent(lbl_cep, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
											.addComponent(lbl_street, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_panel.createSequentialGroup()
												.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
													.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_panel.createSequentialGroup()
															.addComponent(textField_cep_1, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(btnNewButton))
														.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
															.addComponent(lbl_num, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
															.addComponent(textField_num, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
															.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																.addComponent(lbl_num_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
																.addGroup(gl_panel.createSequentialGroup()
																	.addGap(116)
																	.addComponent(textField_uf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																.addComponent(textField_adress, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
																.addComponent(lbl_adress, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
															.addComponent(textField_street, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)))
													.addComponent(textField_clientcpf, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE))
												.addGap(65)
												.addComponent(lbl_search_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
												.addGroup(gl_panel.createSequentialGroup()
													.addComponent(text_CNPJSupplier_1)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
												.addComponent(textField_clientname, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)))
										.addContainerGap())
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
										.addGap(114)))))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lbl_cnpj)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(text_CNPJSupplier_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbl_clientname)
					.addGap(6)
					.addComponent(textField_clientname, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lbl_clientcnpjcpf)
					.addGap(6)
					.addComponent(textField_clientcpf, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lbl_cep)
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lbl_search_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_cep_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lbl_street))
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(textField_street, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_num)
						.addComponent(lbl_adress))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_num, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_adress, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lbl_city)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_city, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lbl_num_1)
							.addGap(6)
							.addComponent(textField_uf, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbl_nummedidor)
					.addGap(6)
					.addComponent(textField_nummedidor, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(356, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(216, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(206))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 839, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(150, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
