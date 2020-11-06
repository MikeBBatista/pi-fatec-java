package fatec.pi.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import fatec.pi.controllers.SupplierController;

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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewClient extends JFrame {

	private JPanel contentPane;
	private JTextField textField_name;
	private JTextField textField_cnpjcpf;
	private JTextField textField_street;
	private JTextField textField_numadress;
	private JTextField textField_adress;
	private JTextField textField_city;
	private JTextField textField_uf;
	private JTextField textField_nummedidor;
	private JTextField textField_roteiro;
	private JTextField textField_value;
	private JTextField textField_valuewtax;

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

		
		JFormattedTextField text_CNPJSupplier = new JFormattedTextField();
		text_CNPJSupplier.setForeground(Color.BLACK);
		text_CNPJSupplier.setColumns(10);
		try {
			javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("##.###.###/####-##");
			text_CNPJSupplier = new javax.swing.JFormattedTextField(format_textField3);
			} catch (Exception e){}
		
		JButton btnNewButton_searchcnpj = new JButton("");
		btnNewButton_searchcnpj.setIcon(new ImageIcon(ViewClient.class.getResource("/img/rsz_search-icon.png")));
		
		JLabel lbl_clientname = new JLabel("NOME");
		lbl_clientname.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_name = new JTextField();
		textField_name.setColumns(10);
		
		JLabel lbl_clientcnpjcpf = new JLabel("CPF / CNPJ");
		lbl_clientcnpjcpf.setFont(new Font("Arial", Font.BOLD, 11));
		
		JFormattedTextField textField_cpf = new JFormattedTextField((Object) null);
		textField_cpf.setColumns(10);
		try {
			javax.swing.text.MaskFormatter format_textFieldcpf = new javax.swing.text.MaskFormatter("###.###.###-##");
			textField_cpf = new javax.swing.JFormattedTextField(format_textFieldcpf);
			} catch (Exception e){}
		
		JLabel lbl_cep = new JLabel("CEP");
		lbl_cep.setFont(new Font("Arial", Font.BOLD, 11));
		
		JFormattedTextField textField_cep = new JFormattedTextField((Object) null);
		textField_cep.setColumns(10);
		try {
			javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("#####-###");
			textField_cep = new javax.swing.JFormattedTextField(format_textField3);
			} catch (Exception e){}
		
		JButton btnNewButton_searchcep = new JButton("");
		btnNewButton_searchcep.setIcon(new ImageIcon(ViewClient.class.getResource("/img/rsz_search-icon.png")));
		
		JLabel lbl_street = new JLabel("Logradouro");
		lbl_street.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_street = new JTextField();
		textField_street.setColumns(10);
		
		JLabel lbl_num = new JLabel("N\u00FAmero");
		lbl_num.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_numadress = new JTextField();
		textField_numadress.setColumns(10);
		
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
		
		JLabel lbl_nummedidor = new JLabel("N\u00FAmero da Instala\u00E7\u00E3o");
		lbl_nummedidor.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_nummedidor = new JTextField();
		textField_nummedidor.setColumns(10);
		
		JLabel lbl_street_1 = new JLabel("Roteiro de Leitura");
		lbl_street_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_roteiro = new JTextField();
		textField_roteiro.setColumns(10);
		
		JLabel lbl_street_1_1 = new JLabel("Classe");
		lbl_street_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lbl_street_1_2 = new JLabel("Subclasse");
		lbl_street_1_2.setFont(new Font("Arial", Font.BOLD, 11));
		
		JComboBox comboBox_Classe = new JComboBox();
		comboBox_Classe.setBackground(Color.WHITE);
		comboBox_Classe.addItem("-");
		comboBox_Classe.addItem("RESIDENCIAL");
		comboBox_Classe.addItem("INDUSTRIAL");
		comboBox_Classe.addItem("COMERCIAL");
		comboBox_Classe.addItem("RURAL");
		comboBox_Classe.addItem("PODER PUBLICO");
		
		
		JComboBox comboBox_subclasse = new JComboBox();
		comboBox_subclasse.setBackground(Color.WHITE);
		comboBox_subclasse.addItem("-");
		comboBox_subclasse.addItem("BAIXA RENDA");
		comboBox_subclasse.addItem("BAIXA RENDA INDÍGENA");
		comboBox_subclasse.addItem("BAIXA RENDA BENEFÍCIO PREST CONT");
		comboBox_subclasse.addItem("BAIXA RENDA MULTIFAMILIAR");
		comboBox_subclasse.addItem("SERVIÇO DE TRANSPORTE");
		comboBox_subclasse.addItem("SERVIÇO DE COMUNICAÇÃO");
		comboBox_subclasse.addItem("ASSOCIA. FILANTRÓPICA");
		comboBox_subclasse.addItem("TEMPLOS RELIGIOSOS");
		comboBox_subclasse.addItem("ADM CONDOMINIAL");
		comboBox_subclasse.addItem("ILUMINAÇÃO RODOVIAS");
		comboBox_subclasse.addItem("SEMÁFAROS, RADARES E CAMERAS");
		comboBox_subclasse.addItem("AGROPECUARIA RURAL");
		comboBox_subclasse.addItem("AGROPECUARIA URBANA");
		comboBox_subclasse.addItem("RESIDENCIAL RURAL");
		comboBox_subclasse.addItem("COOP DE ELETRIF. RURAL");
		comboBox_subclasse.addItem("AGROINDUSTRIAL");
		comboBox_subclasse.addItem("SERVIÇO PUBLI. IRRIGAÇAO RURAL");
		comboBox_subclasse.addItem("ESCOLA AGROTECNICA");
		comboBox_subclasse.addItem("AQUICULTURA");
		comboBox_subclasse.addItem("ILUMINAÇÃO PUBLICA");
		comboBox_subclasse.addItem("SERVIÇO PUBLICA");
		comboBox_subclasse.addItem("CONSUMO PROPRIO");
		
		JLabel lbl_street_1_1_1 = new JLabel("Tarifa (R$)");
		lbl_street_1_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lbl_street_1_1_1_1 = new JLabel("Tarifa com Imposto (R$)");
		lbl_street_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_value = new JTextField();
		textField_value.setColumns(10);
		
		textField_valuewtax = new JTextField();
		textField_valuewtax.setColumns(10);
		
		JButton btnNewButton_save = new JButton("SALVAR");
		btnNewButton_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			}
		});
		btnNewButton_save.setFont(new Font("Arial", Font.BOLD, 13));
		
		JButton btnNewButton_back = new JButton("VOLTAR");
		btnNewButton_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewMain voltamenu = new ViewMain();
				voltamenu.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_back.setFont(new Font("Arial", Font.BOLD, 13));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(88)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_save, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_street_1_1_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lbl_street_1_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBox_Classe, 0, 149, Short.MAX_VALUE)
										.addComponent(textField_value, 144, 144, 144))
									.addGap(36)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addComponent(comboBox_subclasse, 0, 149, Short.MAX_VALUE)
												.addComponent(lbl_street_1_1_1_1, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
												.addComponent(textField_valuewtax, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
												.addComponent(btnNewButton_back, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
											.addGap(59))
										.addComponent(lbl_street_1_2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lbl_street_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_roteiro, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
									.addGap(60))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
										.addComponent(lbl_cnpj, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(text_CNPJSupplier, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
											.addGap(10)
											.addComponent(btnNewButton_searchcnpj, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
											.addGap(1))
										.addComponent(lbl_clientname, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField_name, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
											.addGap(1))
										.addComponent(lbl_clientcnpjcpf, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField_cpf, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
											.addGap(1))
										.addComponent(lbl_cep, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField_cep, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
											.addGap(6)
											.addComponent(btnNewButton_searchcep, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
											.addGap(5))
										.addComponent(lbl_street, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField_street, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
											.addGap(1))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lbl_num, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addGap(77)
											.addComponent(lbl_adress, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField_numadress, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
											.addGap(46)
											.addComponent(textField_adress, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
											.addGap(1))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lbl_city, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
											.addGap(151)
											.addComponent(lbl_num_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField_city, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
											.addGap(57)
											.addComponent(textField_uf, 91, 91, 91)
											.addGap(1))
										.addComponent(lbl_nummedidor, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField_nummedidor, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
											.addGap(1)))
									.addGap(59)))
							.addGap(17)))
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
						.addComponent(text_CNPJSupplier, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_searchcnpj, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(lbl_clientname)
					.addGap(6)
					.addComponent(textField_name, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lbl_clientcnpjcpf)
					.addGap(6)
					.addComponent(textField_cpf, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lbl_cep)
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_cep, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_searchcep, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(lbl_street)
					.addGap(6)
					.addComponent(textField_street, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_num)
						.addComponent(lbl_adress))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_numadress, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_adress, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_city)
						.addComponent(lbl_num_1))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_city, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_uf, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(lbl_nummedidor)
					.addGap(6)
					.addComponent(textField_nummedidor, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lbl_street_1)
					.addGap(6)
					.addComponent(textField_roteiro, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_street_1_1)
						.addComponent(lbl_street_1_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox_Classe, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_subclasse, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_street_1_1_1)
						.addComponent(lbl_street_1_1_1_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_value, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_valuewtax, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_save, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_back, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(57, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
