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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

public class ViewMain extends JFrame {


	protected static final String frame = null;
	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMain frame = new ViewMain();
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
	public ViewMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204,223,214));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_main = new JPanel();
		panel_main.setBackground(new Color(95, 158, 160));
		
		JLabel lblOQueDeseja = new JLabel("O QUE DESEJA FAZER?");
		lblOQueDeseja.setForeground(Color.WHITE);
		lblOQueDeseja.setFont(new Font("Arial", Font.BOLD, 14));
		panel_main.add(lblOQueDeseja);
		
		JPanel panel_cadfornecedor = new JPanel();
		panel_cadfornecedor.setBackground(new Color(245, 245, 245));
		
		JLabel lblCadastrarFornecedor = new JLabel("CADASTRAR FORNECEDOR");
		lblCadastrarFornecedor.setForeground(new Color(0, 0, 0));
		lblCadastrarFornecedor.setFont(new Font("Arial", Font.BOLD, 12));
		panel_cadfornecedor.add(lblCadastrarFornecedor);
		
		JPanel panel_cadcliente = new JPanel();
		panel_cadcliente.setBackground(new Color(245, 245, 245));
		
		JLabel lblCadastrarCliente = new JLabel("CADASTRAR CLIENTE");
		lblCadastrarCliente.setForeground(Color.BLACK);
		lblCadastrarCliente.setFont(new Font("Arial", Font.BOLD, 12));
		panel_cadcliente.add(lblCadastrarCliente);
		
		JPanel panel_cadconta = new JPanel();
		panel_cadconta.setBackground(new Color(245, 245, 245));
		
		JLabel lblCadastrarNovaConta = new JLabel("CADASTRAR NOVA CONTA");
		lblCadastrarNovaConta.setForeground(Color.BLACK);
		lblCadastrarNovaConta.setFont(new Font("Arial", Font.BOLD, 12));
		panel_cadconta.add(lblCadastrarNovaConta);
		
		JPanel panel_edinf = new JPanel();
		panel_edinf.setBackground(new Color(245, 245, 245));
		
		JLabel lblEditarInformaoCadastrada = new JLabel("EDITAR INFORMA\u00C7\u00C3O CADASTRADA");
		lblEditarInformaoCadastrada.setForeground(Color.BLACK);
		lblEditarInformaoCadastrada.setFont(new Font("Arial", Font.BOLD, 12));
		panel_edinf.add(lblEditarInformaoCadastrada);
		
		JPanel panel_relatorio = new JPanel();
		panel_relatorio.setBackground(new Color(245, 245, 245));
		
		JLabel lblGerarRelatrios = new JLabel("GERAR RELAT\u00D3RIOS");
		lblGerarRelatrios.setForeground(Color.BLACK);
		lblGerarRelatrios.setFont(new Font("Arial", Font.BOLD, 12));
		panel_relatorio.add(lblGerarRelatrios);
		
		JPanel panel_relcolaboradores = new JPanel();
		panel_relcolaboradores.setBackground(new Color(245, 245, 245));
		
		JLabel lblRelatrioColaboradores = new JLabel("RELAT\u00D3RIO COLABORADORES");
		lblRelatrioColaboradores.setForeground(Color.BLACK);
		lblRelatrioColaboradores.setFont(new Font("Arial", Font.BOLD, 12));
		panel_relcolaboradores.add(lblRelatrioColaboradores);
		
		JPanel panel_exit = new JPanel();
		panel_exit.setBackground(new Color(165, 42, 42));
		
		JLabel lblSair = new JLabel("SAIR");
		lblSair.setForeground(Color.WHITE);
		lblSair.setFont(new Font("Arial", Font.BOLD, 14));
		panel_exit.add(lblSair);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ViewMain.class.getResource("/img/rsz_poc_verde.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(331, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_exit, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_relcolaboradores, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_relatorio, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_edinf, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_cadconta, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_cadcliente, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_cadfornecedor, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_main, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE))
							.addGap(320))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
							.addGap(416))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(62, Short.MAX_VALUE)
					.addComponent(panel_main, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(panel_cadfornecedor, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_cadcliente, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_cadconta, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_edinf, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_relatorio, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_relcolaboradores, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(panel_exit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(46))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
