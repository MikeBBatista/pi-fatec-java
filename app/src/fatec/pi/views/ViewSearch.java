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

public class ViewSearch extends JFrame {

	private JPanel contentPane;
	Color fundo = new Color(204, 223,214);
	Color text  = new Color(218,218,217);
	Color botao  = new Color(156,183,170);
	Color jpanel = new Color(95, 158, 160);
	private JTextField txtPesquisa;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
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
		
		JLabel lblNewLabel = new JLabel("CNPJ");
		lblNewLabel.setBounds(315, 140, 94, 25);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(407, 140, 192, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u00C1gua", "Luz"}));
		comboBox.setBounds(407, 245, 94, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de conta");
		lblNewLabel_1.setBounds(315, 247, 94, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(ViewSearch.class.getResource("/img/rsz_poc_verde.png")));
		lblNewLabel_2.setBounds(473, 689, 126, 71);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Gerar Relat\u00F3rio");
		btnNewButton.setBounds(350, 621, 151, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setBounds(555, 621, 151, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Pesquisar");
		btnNewButton_2.setBounds(625, 344, 108, 23);
		contentPane.add(btnNewButton_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(315, 394, 418, 147);
		contentPane.add(spinner);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(315, 176, 94, 25);
		contentPane.add(lblCpf);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(407, 176, 192, 25);
		contentPane.add(textField);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(315, 211, 94, 25);
		contentPane.add(lblNome);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(407, 212, 192, 25);
		contentPane.add(textField_2);
		
	
		
	}
}
