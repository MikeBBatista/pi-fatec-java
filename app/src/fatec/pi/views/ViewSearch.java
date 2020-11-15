package fatec.pi.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;

public class ViewSearch extends JFrame {

	private JPanel contentPane;
	Color fundo = new Color(204, 223,214);
	Color text  = new Color(218,218,217);
	Color botao  = new Color(156,183,170);
	Color jpanel = new Color(95, 158, 160);
	private JTextField txtPesquisa;
	private JTextField textFieldCNPJ;
	private JTextField textFieldCPF;
	private JTextField textFieldNOME;
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
		txtPesquisa.setEditable(false);
		txtPesquisa.setHorizontalAlignment(SwingConstants.CENTER);
		txtPesquisa.setText("Pesquisa ");
		txtPesquisa.setForeground(Color.WHITE);
		txtPesquisa.setBounds(315, 46, 418, 38);
		txtPesquisa.setBackground(jpanel);
		txtPesquisa.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(txtPesquisa);
		txtPesquisa.setColumns(10);
		
		JLabel LabelCNPJ = new JLabel("CNPJ");
		LabelCNPJ.setBounds(315, 140, 94, 25);
		contentPane.add(LabelCNPJ);
		
		textFieldCNPJ = new JTextField();
		try {
			javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("##.###.###/####-##");
			textFieldCNPJ= new javax.swing.JFormattedTextField(format_textField3);
			} catch (Exception e){}
		textFieldCNPJ.setBounds(407, 140, 192, 25);
		contentPane.add(textFieldCNPJ);
		textFieldCNPJ.setColumns(10);
		
		JComboBox comboBoxConta = new JComboBox();
		comboBoxConta.setModel(new DefaultComboBoxModel(new String[] {"\u00C1gua", "Luz"}));
		comboBoxConta.setBounds(407, 245, 94, 20);
		contentPane.add(comboBoxConta);
		
		JLabel LabelTipodeConta = new JLabel("Tipo de conta");
		LabelTipodeConta.setBounds(315, 247, 94, 17);
		contentPane.add(LabelTipodeConta);
		
		JLabel LabelLogo = new JLabel("");
		LabelLogo.setIcon(new ImageIcon(ViewSearch.class.getResource("/img/rsz_poc_verde.png")));
		LabelLogo.setBounds(473, 689, 126, 71);
		contentPane.add(LabelLogo);
		
		JButton btnRelatorio = new JButton("Gerar Relat\u00F3rio");
		btnRelatorio.setBounds(350, 621, 151, 23);
		contentPane.add(btnRelatorio);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(555, 621, 151, 23);
		contentPane.add(btnVoltar);
		
		JButton btnPesquisa = new JButton("Pesquisar");
		btnPesquisa.setBounds(625, 344, 108, 23);
		contentPane.add(btnPesquisa);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(315, 394, 418, 147);
		contentPane.add(spinner);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(315, 176, 94, 25);
		contentPane.add(lblCpf);
		
		textFieldCPF = new JTextField();
		try {
			javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("###.###.###.-##");
			textFieldCPF = new javax.swing.JFormattedTextField(format_textField3);
			} catch (Exception e){}
		textFieldCPF.setColumns(10);
		textFieldCPF.setBounds(407, 176, 192, 25);
		contentPane.add(textFieldCPF);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(315, 211, 94, 25);
		contentPane.add(lblNome);
		
		textFieldNOME = new JTextField();
		textFieldNOME.setColumns(10);
		textFieldNOME.setBounds(407, 212, 192, 25);
		contentPane.add(textFieldNOME);
		
		JComboBox comboBoxBusca = new JComboBox();
		comboBoxBusca.setModel(new DefaultComboBoxModel(new String[] {"Cliente", "Conta", "Fornecedor"}));
		comboBoxBusca.setBounds(407, 109, 94, 20);
		contentPane.add(comboBoxBusca);
		
		JLabel LabelBusca = new JLabel("Buscar por");
		LabelBusca.setBounds(315, 109, 74, 20);
		contentPane.add(LabelBusca);
		
	
		
	}
	//Func Trata Dados
		public static String formataDados(String dado){
			
			   return dado.replaceAll("[^0-9]+", "");
			}
}
