package fatec.pi.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import fatec.pi.controllers.LightAccountController;
import fatec.pi.controllers.SupplierController;
import fatec.pi.entities.LightAccount;
import fatec.pi.entities.Supplier;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;

public class ViewSearch extends JFrame {

	private JPanel contentPane;
	Color fundo = new Color(204, 223,214);
	Color text  = new Color(218,218,217);
	Color botao  = new Color(156,183,170);
	Color jpanel = new Color(95, 158, 160);
	private JTextField txtPesquisa;
	private JTextField textFieldCNPJ;
	private JTextField textFieldCNPJ_1;
	private JTextField textFieldCPF;
	private JTextField textFieldCPF_1;
	private JTextField textField_Account;
	private JTextField textFieldNOME;
	private DefaultTableModel dtm = new DefaultTableModel();;
	private JTable table_data;
	private String type = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSearch frame = new ViewSearch();
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
	public ViewSearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 800);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(fundo);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPesquisa = new JTextField();
		txtPesquisa.setBounds(209, 46, 524, 38);
		txtPesquisa.setEditable(false);
		txtPesquisa.setHorizontalAlignment(SwingConstants.CENTER);
		txtPesquisa.setText("Pesquisa ");
		txtPesquisa.setForeground(Color.WHITE);
		txtPesquisa.setBackground(jpanel);
		txtPesquisa.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(txtPesquisa);
		txtPesquisa.setColumns(10);
		
		JLabel LabelCNPJ = new JLabel("CNPJ");
		LabelCNPJ.setBounds(308, 140, 94, 25);
		contentPane.add(LabelCNPJ);
		
		textFieldCNPJ = new JTextField();
		try {
			javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("##.###.###/####-##");
			textFieldCNPJ_1= new javax.swing.JFormattedTextField(format_textField3);
			textFieldCNPJ_1.setBounds(407, 140, 192, 25);
			} catch (Exception e){}
		contentPane.add(textFieldCNPJ_1);
		textFieldCNPJ_1.setColumns(10);
		
		JComboBox comboBoxConta = new JComboBox();
		comboBoxConta.setBounds(407, 245, 94, 20);
		comboBoxConta.setModel(new DefaultComboBoxModel(new String[] {"\u00C1gua", "Luz"}));
		contentPane.add(comboBoxConta);
		
		
		JLabel LabelTipodeConta = new JLabel("Tipo de conta");
		LabelTipodeConta.setBounds(308, 247, 94, 17);
		contentPane.add(LabelTipodeConta);
		
		JLabel LabelLogo = new JLabel("");
		LabelLogo.setBounds(473, 689, 126, 71);
		LabelLogo.setIcon(new ImageIcon(ViewSearch.class.getResource("/img/rsz_poc_verde.png")));
		contentPane.add(LabelLogo);
		
		JComboBox comboBoxBusca = new JComboBox();
		comboBoxBusca.setBounds(407, 109, 94, 20);
		comboBoxBusca.setModel(new DefaultComboBoxModel(new String[] {"Cliente", "Conta", "Fornecedor"}));
		contentPane.add(comboBoxBusca);
		

		JScrollPane scrollPane_table = new JScrollPane();
		scrollPane_table.setBounds(209, 378, 524, 220);
		contentPane.add(scrollPane_table);
		
		table_data = new JTable();
		scrollPane_table.setViewportView(table_data);
		String[] rows = {"ID", "Name", "Site", "Type"};
		dtm.setColumnIdentifiers(rows);
		JScrollPane forTable = new JScrollPane();
		getContentPane().add(forTable);
		table_data.setModel(dtm);
		table_data.setBounds(297, 393, 476, 203);
		DefaultTableModel modelo = (DefaultTableModel) table_data.getModel();
		
		JButton btnRelatorio = new JButton("Gerar Relat\u00F3rio");
		btnRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRelatorio.setBounds(209, 621, 151, 23);
		contentPane.add(btnRelatorio);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(582, 621, 151, 23);
		contentPane.add(btnVoltar);
		
		JButton btnPesquisa = new JButton("Pesquisar");
		btnPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				modelo.setNumRows(0);
				type = comboBoxBusca.getSelectedItem().toString();
				String accountType = comboBoxConta.getSelectedItem().toString(); 
				String cnpj = formataDados(textFieldCNPJ_1.getText());
				dtm.setColumnIdentifiers(searchTitles(type, accountType));
				searchResult(modelo, type, cnpj);
				textFieldCNPJ_1.setText("");
				
				
			}
		});
		btnPesquisa.setBounds(625, 344, 108, 23);
		contentPane.add(btnPesquisa);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(308, 176, 94, 25);
		contentPane.add(lblCpf);
		
		textFieldCPF = new JTextField();
		try {
			javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("###.###.###.-##");
			textFieldCPF_1 = new javax.swing.JFormattedTextField(format_textField3);
			textFieldCPF_1.setBounds(407, 176, 192, 25);
			} catch (Exception e){}
		textFieldCPF_1.setColumns(10);
		contentPane.add(textFieldCPF_1);
		
		JLabel lblAccount = new JLabel("Hidr\u00F4metro / Medidor");
		lblAccount.setBounds(308, 211, 108, 25);
		contentPane.add(lblAccount);
		
		textFieldNOME = new JTextField();
		textFieldNOME.setBounds(407, 212, 192, 25);
		textFieldNOME.setColumns(10);
		contentPane.add(textFieldNOME);

		
		JLabel LabelBusca = new JLabel("Buscar por");
		LabelBusca.setBounds(308, 109, 74, 20);
		contentPane.add(LabelBusca);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				updateData(table_data, modelo, type);
			}
		});
		btnUpdate.setBounds(402, 621, 151, 23);
		contentPane.add(btnUpdate);
		

		
		

		
	
		
	}
	//Func Trata Dados
		public static String formataDados(String dado){
			
			   return dado.replaceAll("[^0-9]+", "");
			}
		

	
		public static String[] searchTitles(String search, String accountType) {

			String[] result = {"", "", "", "", ""};
			if(search.equals("Fornecedor")) {
				result = new String[]{"ID", "CNPJ", "NAME", "SITE", "TYPE"};
			}

			else if (search.equals("Cliente")) {
				result = new String[]{"ID", "CPF/CNPJ", "NAME", "ZIP COD", "STREET NAME", "STREET NUMBER", "STREET COMPLEMENT", "CITY", "STATE" +
						"METER NUMBER", "MEASUREMENT ORDER", "LIGHT CLASS ", "LIGHT SUBCLASS", "NORMAL TAX", "TRIBUTE TAX ", "SUPPLIER CNPJ"};
			}
			else if (search.equals("Conta")) { // CONTA AGUA e LUZ

				if(accountType.equals("Luz")) {
					result = new String[]{"ID", "IDENT COD", "METERNUMBER", "INVOICE", "CURRENT DATE","DUE DATE","CONSUMPTION DAYS" +
				"FLAG TYPE","CONSUMPTION VALUE","PIS PERCENTAGE","COFINS PERCENTAGE","ICMS BASIS","ICMS PERCENTAGE","ICMS VALUE" +
					"PIS COFINS BASIS","PIS VALUE","COFINS VALUE","FORFEIT VALUE","INTEREST VALUE", "OTHER VALUES", "SUPPLY VALUES" +
				"FINANCIAL ITEMS", "ACCOUNT AMOUNT", "SUPPLIER CNPJ"};
				}
				
				else {
					result = new String[]{"ID", "NUMBER", "DUA DATE", "PENALTY", "CONSUMPTION", "POLLUTION", "SEWER", "WATER", "PIS", "OTHERS","SUPPLIER CNPJ"};
				}
				
			}

			return result;
		}
		
		public static void searchResult(DefaultTableModel table, String type, String cnpj) {
			if(type.equals("Fornecedor")) {
				List<Supplier> sup = SupplierController.getValues(cnpj);
				for(Supplier sp: sup) {
					table.addRow(new Object[] {
							sp.getId(),
							sp.getCnpj(),
							sp.getName(),
							sp.getSite(),
							sp.toType()
					});
				}
			}else if (type.contentEquals("LUZ")) {
				List <LightAccount> lgh = LightAccountController.getValues(cnpj);
				for(LightAccount la: lgh) {
					table.addRow(new Object[] {
							la.getId(),
							la.getIdentCod(),
							la.getMeterNumber(),
							la.getInvoice(),
							la.getCurrentDate(),
							la.getDueDate(),
							la.getConsumptionDays(),
							la.getFlagType(),
							la.getConsumptionValue(),
							la.getPisPercentage(),
							la.getCofinsPercentage(),
							la.getIcmsBasis(),
							la.getIcmsPercentage(),
							la.getIcmsValue(),
							la.getPisCofinsBasis(),
							la.getPisValue(),
							la.getCofinsValue(),
							la.getForfeitValue(),
							la.getInterestValue(),
							la.getInterestValue(),
							la.getOtherValues(),
							la.getSupplyValue(),
							la.getFinancialItems(),
							la.getAmount(),
							la.getSupplierCnpj()
							
					});
				}
			}
		}
		
		public static void updateData(JTable table, DefaultTableModel modelTable, String type){
			
			Integer row = table.getSelectedRow();
			String rowValues = modelTable.getDataVector().elementAt(row).toString();
			rowValues = rowValues.replaceAll("\\[", "");
			rowValues = rowValues.replaceAll("\\]", "");
			String[] objectValues = rowValues.split(", ");
			
			if(type.equals("Fornecedor")) {
				Integer supType = 3;
				if(objectValues[4].equals("Energia")) {
					supType = 0;
				}

				else if (objectValues[4].equals("Água")) {
					supType = 1;
				}
				Supplier sup = new Supplier(Integer.parseInt(objectValues[0]),Integer.parseInt(objectValues[1]), objectValues[2], objectValues[3], supType);
				SupplierController.updateValues(sup);
			}
		}
}
