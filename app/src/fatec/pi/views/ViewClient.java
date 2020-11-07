package fatec.pi.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fatec.pi.controllers.ClientController;
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
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;

public class ViewClient extends JFrame {

	private JPanel contentPane;
	private JTextField txt_clientName;
	private JTextField txt_clientCpf;
	private JTextField txt_streetName;
	private JTextField txt_streetNumber;
	private JTextField txt_streetComplement;
	private JTextField txt_city;
	private JTextField txt_state;
	private JTextField txt_meterNumber;
	private JTextField txt_measurementOrder;
	private JTextField txt_normalTax;
	private JTextField txt_tributeTax;
	private JTextField txt_zipCode;
	private JTextField txt_supplierCnpj;

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
		

		try {
			javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("##.###.###/####-##");
			txt_supplierCnpj= new javax.swing.JFormattedTextField(format_textField3);
			} catch (Exception e){}
		txt_supplierCnpj.setForeground(Color.BLACK);
		txt_supplierCnpj.setColumns(10);
						
		JButton btnNewButton_searchcnpj = new JButton("");
		btnNewButton_searchcnpj.setIcon(new ImageIcon(ViewClient.class.getResource("/img/rsz_search-icon.png")));
		
		JLabel lbl_clientname = new JLabel("NOME");
		lbl_clientname.setFont(new Font("Arial", Font.BOLD, 11));
		
		txt_clientName = new JTextField();
		txt_clientName.setColumns(10);
		
		JLabel lbl_clientcnpjcpf = new JLabel("CPF do Cliente");
		lbl_clientcnpjcpf.setFont(new Font("Arial", Font.BOLD, 11));
		
		txt_clientCpf = new JTextField();
		try {
			javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("###.###.###.-##");
			txt_clientCpf = new javax.swing.JFormattedTextField(format_textField3);
			} catch (Exception e){}
		txt_clientCpf.setForeground(Color.BLACK);
		txt_clientCpf.setColumns(10);
		
		JLabel lbl_cep = new JLabel("CEP");
		lbl_cep.setFont(new Font("Arial", Font.BOLD, 11));
		
		txt_zipCode = new JTextField();
		txt_zipCode.setColumns(10);
		
		JButton btnNewButton_searchcep = new JButton("");
		btnNewButton_searchcep.setIcon(new ImageIcon(ViewClient.class.getResource("/img/rsz_search-icon.png")));
		
		JLabel lbl_street = new JLabel("Logradouro");
		lbl_street.setFont(new Font("Arial", Font.BOLD, 11));
		
		txt_streetName = new JTextField();
		txt_streetName.setColumns(10);
		
		JLabel lbl_num = new JLabel("N\u00FAmero");
		lbl_num.setFont(new Font("Arial", Font.BOLD, 11));
		
		txt_streetNumber = new JTextField();
		txt_streetNumber.setColumns(10);
		
		JLabel lbl_adress = new JLabel("Complemento");
		lbl_adress.setFont(new Font("Arial", Font.BOLD, 11));
		
		txt_streetComplement = new JTextField();
		txt_streetComplement.setColumns(10);
		
		JLabel lbl_city = new JLabel("Cidade");
		lbl_city.setFont(new Font("Arial", Font.BOLD, 11));
		
		txt_city = new JTextField();
		txt_city.setColumns(10);
		
		JLabel lbl_num_1 = new JLabel("UF");
		lbl_num_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		txt_state = new JTextField();
		txt_state.setColumns(10);
		
		JLabel lbl_nummedidor = new JLabel("N\u00FAmero da Instalação");
		lbl_nummedidor.setFont(new Font("Arial", Font.BOLD, 11));
		
		txt_meterNumber = new JTextField();
		txt_meterNumber.setColumns(10);
		
		JLabel lbl_street_1 = new JLabel("Roteiro de Leitura");
		lbl_street_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		txt_measurementOrder = new JTextField();
		txt_measurementOrder.setColumns(10);
		
		JLabel lbl_street_1_1 = new JLabel("Classe");
		lbl_street_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lbl_street_1_2 = new JLabel("Subclasse");
		lbl_street_1_2.setFont(new Font("Arial", Font.BOLD, 11));
		
		JComboBox box_lightClass = new JComboBox();
		box_lightClass.setBackground(Color.WHITE);
		box_lightClass.addItem("-");
		box_lightClass.addItem("RESIDENCIAL");
		box_lightClass.addItem("INDUSTRIAL");
		box_lightClass.addItem("COMERCIAL");
		box_lightClass.addItem("RURAL");
		box_lightClass.addItem("PODER PUBLICO");
		
		
		JComboBox box_lightSubclass = new JComboBox();
		box_lightSubclass.setBackground(Color.WHITE);
		box_lightSubclass.addItem("-");
		box_lightSubclass.addItem("BAIXA RENDA");
		box_lightSubclass.addItem("BAIXA RENDA INDÍGENA");
		box_lightSubclass.addItem("BAIXA RENDA BENEFÍCIO PREST CONT");
		box_lightSubclass.addItem("BAIXA RENDA MULTIFAMILIAR");
		box_lightSubclass.addItem("SERVIÇO DE TRANSPORTE");
		box_lightSubclass.addItem("SERVIÇO DE COMUNICAÇÃO");
		box_lightSubclass.addItem("ASSOCIA. FILANTRÓPICA");
		box_lightSubclass.addItem("TEMPLOS RELIGIOSOS");
		box_lightSubclass.addItem("ADM CONDOMINIAL");
		box_lightSubclass.addItem("ILUMINAÇÃO RODOVIAS");
		box_lightSubclass.addItem("SEMÁFAROS, RADARES E CAMERAS");
		box_lightSubclass.addItem("AGROPECUARIA RURAL");
		box_lightSubclass.addItem("AGROPECUARIA URBANA");
		box_lightSubclass.addItem("RESIDENCIAL RURAL");
		box_lightSubclass.addItem("COOP DE ELETRIF. RURAL");
		box_lightSubclass.addItem("AGROINDUSTRIAL");
		box_lightSubclass.addItem("SERVIÇO PUBLI. IRRIGAÇAO RURAL");
		box_lightSubclass.addItem("ESCOLA AGROTECNICA");
		box_lightSubclass.addItem("AQUICULTURA");
		box_lightSubclass.addItem("ILUMINAÇÃO PUBLICA");
		box_lightSubclass.addItem("SERVIÇO PUBLICA");
		box_lightSubclass.addItem("CONSUMO PROPRIO");
		
		JLabel lbl_street_1_1_1 = new JLabel("Tarifa (R$)");
		lbl_street_1_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lbl_street_1_1_1_1 = new JLabel("Tarifa com Imposto (R$)");
		lbl_street_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		txt_normalTax = new JTextField();
		txt_normalTax.setColumns(10);
		
		txt_tributeTax = new JTextField();
		txt_tributeTax.setColumns(10);
		
		JButton btn_save = new JButton("SALVAR");
		btn_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				BigDecimal normalTax = new BigDecimal(txt_normalTax.getText());
				BigDecimal tributeTax = new BigDecimal(txt_tributeTax.getText());
				Integer meterNumber = Integer.parseInt(txt_streetNumber.getText());
				
				ClientController.saveValues(formataDados(txt_supplierCnpj.getText()), txt_clientName.getText(), formataDados(txt_clientCpf.getText()),
						txt_zipCode.getText(), meterNumber, txt_streetName.getText(), txt_streetComplement.getText(),
						txt_city.getText(), txt_state.getText(), txt_meterNumber.getText(), txt_measurementOrder.getText(),
						box_lightClass.getSelectedItem().toString(), box_lightSubclass.getSelectedItem().toString(),
						normalTax, tributeTax);
				txt_supplierCnpj.setText("");
				txt_clientName.setText("");
				txt_clientCpf.setText("");
				txt_zipCode.setText("");
				txt_streetName.setText("");
				txt_streetComplement.setText("");
				box_lightClass.setToolTipText("");
				box_lightSubclass.setToolTipText("");
				txt_normalTax.setText("");
				txt_tributeTax.setText("");
				
				
			}
				});
		btn_save.setFont(new Font("Arial", Font.BOLD, 13));
		btn_save.setMnemonic(KeyEvent.VK_S);
		
		JButton btn_back = new JButton("VOLTAR");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewMain voltamenu = new ViewMain();
				voltamenu.setVisible(true);
				setVisible(false);
			}
		});
		btn_back.setFont(new Font("Arial", Font.BOLD, 13));
		btn_back.setMnemonic(KeyEvent.VK_B);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(88)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btn_save, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_street_1_1_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lbl_street_1_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addComponent(box_lightClass, 0, 149, Short.MAX_VALUE)
										.addComponent(txt_normalTax, 144, 144, 144))
									.addGap(36)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addComponent(box_lightSubclass, 0, 149, Short.MAX_VALUE)
												.addComponent(lbl_street_1_1_1_1, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
												.addComponent(txt_tributeTax, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
												.addComponent(btn_back, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
											.addGap(59))
										.addComponent(lbl_street_1_2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lbl_street_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addComponent(txt_measurementOrder, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
									.addGap(60))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
										.addComponent(lbl_cnpj, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(txt_supplierCnpj, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
											.addGap(10)
											.addComponent(btnNewButton_searchcnpj, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
											.addGap(1))
										.addComponent(lbl_clientname, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(txt_clientName, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
											.addGap(1))
										.addComponent(lbl_clientcnpjcpf, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(txt_clientCpf, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
											.addGap(1))
										.addComponent(lbl_cep, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(txt_zipCode, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
											.addGap(6)
											.addComponent(btnNewButton_searchcep, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
											.addGap(5))
										.addComponent(lbl_street, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(txt_streetName, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
											.addGap(1))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lbl_num, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addGap(77)
											.addComponent(lbl_adress, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(txt_streetNumber, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
											.addGap(46)
											.addComponent(txt_streetComplement, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
											.addGap(1))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lbl_city, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
											.addGap(151)
											.addComponent(lbl_num_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(txt_city, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
											.addGap(57)
											.addComponent(txt_state, 91, 91, 91)
											.addGap(1))
										.addComponent(lbl_nummedidor, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(txt_meterNumber, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
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
						.addComponent(txt_supplierCnpj, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_searchcnpj, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(lbl_clientname)
					.addGap(6)
					.addComponent(txt_clientName, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lbl_clientcnpjcpf)
					.addGap(6)
					.addComponent(txt_clientCpf, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lbl_cep)
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txt_zipCode, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_searchcep, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(lbl_street)
					.addGap(6)
					.addComponent(txt_streetName, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_num)
						.addComponent(lbl_adress))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txt_streetNumber, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(txt_streetComplement, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_city)
						.addComponent(lbl_num_1))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txt_city, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(txt_state, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(lbl_nummedidor)
					.addGap(6)
					.addComponent(txt_meterNumber, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lbl_street_1)
					.addGap(6)
					.addComponent(txt_measurementOrder, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_street_1_1)
						.addComponent(lbl_street_1_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(box_lightClass, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(box_lightSubclass, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_street_1_1_1)
						.addComponent(lbl_street_1_1_1_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txt_normalTax, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(txt_tributeTax, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btn_save, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_back, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(57, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
	//Func Trata Dados
	public static String formataDados(String dado){
		
		   return dado.replaceAll("[^0-9]+", "");
		}
}