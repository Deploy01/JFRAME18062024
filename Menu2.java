package uShoe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Menu2 implements ActionListener {

	JFrame frame;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu2 window = new Menu2();
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
	public Menu2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Ushoe");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {0, 20, 20, 20, 20, 20, 0};
		gbl_panel.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel.setLayout(gbl_panel);
		
		JButton btnCliente = new JButton("Cadastrar Cliente");
		btnCliente.setFont(new Font("Arial", Font.ITALIC, 16));
		GridBagConstraints gbc_btnCliente = new GridBagConstraints();
		gbc_btnCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnCliente.gridx = 1;
		gbc_btnCliente.gridy = 0;
		panel.add(btnCliente, gbc_btnCliente);
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Cliente cliente = new Cliente();
				cliente.setVisible(true);
				
			}
		});
		
		
		JButton btnFornecedor = new JButton("Cadastrar Fornecedores");
		btnFornecedor.setFont(new Font("Arial", Font.ITALIC, 16));
		GridBagConstraints gbc_btnFornecedor = new GridBagConstraints();
		gbc_btnFornecedor.anchor = GridBagConstraints.SOUTH;
		gbc_btnFornecedor.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnFornecedor.insets = new Insets(0, 0, 5, 5);
		gbc_btnFornecedor.gridx = 5;
		gbc_btnFornecedor.gridy = 0;
		panel.add(btnFornecedor, gbc_btnFornecedor);
		btnFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AddFornecedor fornecedor = new AddFornecedor();
				fornecedor.frame.setVisible(true);
				
			}
		});
		
		JButton btnProduto = new JButton("Cadastro de Produto");
		btnProduto.setFont(new Font("Arial", Font.ITALIC, 16));
		GridBagConstraints gbc_btnProduto = new GridBagConstraints();
		gbc_btnProduto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnProduto.insets = new Insets(0, 0, 5, 5);
		gbc_btnProduto.gridx = 1;
		gbc_btnProduto.gridy = 3;
		btnProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AddProduto produto = new AddProduto();
				produto.frame.setVisible(true);
				
			}
		});
		panel.add(btnProduto, gbc_btnProduto);
		
		JButton btnPedido = new JButton("Cadastrar Pedido");
		btnPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Pedido pedido = new Pedido();
				pedido.setVisible(true);
				
			}
		});
		btnPedido.setFont(new Font("Arial", Font.ITALIC, 16));
		GridBagConstraints gbc_btnPedido = new GridBagConstraints();
		gbc_btnPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPedido.insets = new Insets(0, 0, 5, 5);
		gbc_btnPedido.gridx = 5;
		gbc_btnPedido.gridy = 3;
		panel.add(btnPedido, gbc_btnPedido);

		
		
		JButton btnFuncionario = new JButton("Cadastro de Funcionário");
		btnFuncionario.setFont(new Font("Arial", Font.ITALIC, 16));
		GridBagConstraints gbc_btnFuncionario = new GridBagConstraints();
		gbc_btnFuncionario.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnFuncionario.insets = new Insets(0, 0, 0, 5);
		gbc_btnFuncionario.gridx = 1;
		gbc_btnFuncionario.gridy = 6;
		panel.add(btnFuncionario, gbc_btnFuncionario);
		btnFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Funcionario funcionario = new Funcionario();
				funcionario.setVisible(true);
				
			}
		});
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setSelectedIcon(new ImageIcon("C:\\Users\\kauan\\OneDrive\\Área de Trabalho\\Java\\WSDS\\imgs\\exit.png"));
		btnSair.setFont(new Font("Arial", Font.ITALIC, 16));
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.insets = new Insets(0, 0, 0, 5);
		gbc_btnSair.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSair.gridx = 5;
		gbc_btnSair.gridy = 6;
		panel.add(btnSair, gbc_btnSair);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
