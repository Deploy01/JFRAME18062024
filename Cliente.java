package uShoe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txfNome;
	private JTextField txfSobrenome;
	private JTextField txfTelefone;
	private JTextField txfCPF;
	private JTextField txfEmail;
	private JTextField txfEndereco;
	private JTextField txfNumero;
	private JTextField txfCidade;
	private JTextField txfCEP;
	private JTextField txfEstado;
	private JTextField txfComplemento;
	private JTextField txfBairro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente frame = new Cliente();
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
	public Cliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(10, 1, 0, 0));
		
		JLabel lblCliente = new JLabel("Cadastro de cliente");
		lblCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblCliente);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2, 2, 10, 0));
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblSobrenome);
		
		txfNome = new JTextField();
		txfNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNome.setLabelFor(txfNome);
		panel.add(txfNome);
		txfNome.setColumns(10);
		
		txfSobrenome = new JTextField();
		txfSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSobrenome.setLabelFor(txfSobrenome);
		panel.add(txfSobrenome);
		txfSobrenome.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 10, 0));
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblTelefone);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblCPF);
		
		txfTelefone = new JTextField();
		txfTelefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelefone.setLabelFor(txfTelefone);
		panel_1.add(txfTelefone);
		txfTelefone.setColumns(10);
		
		txfCPF = new JTextField();
		txfCPF.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCPF.setLabelFor(txfCPF);
		panel_1.add(txfCPF);
		txfCPF.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblEmail);
		
		txfEmail = new JTextField();
		txfEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setLabelFor(txfEmail);
		panel_2.add(txfEmail);
		txfEmail.setColumns(10);
		
		JLabel lblEndereoDoCliente = new JLabel("Endereço do cliente");
		lblEndereoDoCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndereoDoCliente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblEndereoDoCliente);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 10, 0));
		
		JLabel lblLinhaDeEndereo = new JLabel("Linha de endereço");
		lblLinhaDeEndereo.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(lblLinhaDeEndereo);
		
		JLabel lblNumero = new JLabel("Número");
		lblNumero.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(lblNumero);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(lblCidade);
		
		txfEndereco = new JTextField();
		txfEndereco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txfEndereco.setColumns(10);
		panel_3.add(txfEndereco);
		
		txfNumero = new JTextField();
		txfNumero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txfNumero.setColumns(10);
		panel_3.add(txfNumero);
		
		txfCidade = new JTextField();
		txfCidade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txfCidade.setColumns(10);
		panel_3.add(txfCidade);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 3, 10, 0));
		
		JLabel lblCEP = new JLabel("CEP");
		lblCEP.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(lblCEP);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(lblEstado);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(lblComplemento);
		
		txfCEP = new JTextField();
		txfCEP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txfCEP.setColumns(10);
		panel_4.add(txfCEP);
		
		txfEstado = new JTextField();
		txfEstado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txfEstado.setColumns(10);
		panel_4.add(txfEstado);
		
		txfComplemento = new JTextField();
		txfComplemento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txfComplemento.setColumns(10);
		panel_4.add(txfComplemento);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		panel_5.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setHorizontalAlignment(SwingConstants.LEFT);
		panel_5.add(lblBairro);
		
		txfBairro = new JTextField();
		txfBairro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txfBairro.setColumns(10);
		panel_5.add(txfBairro);
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7);
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 2, 10, 0));
		
		JButton btnCadastrarCliente = new JButton("Cadastrar cliente");
		panel_6.add(btnCadastrarCliente);
		
		JButton btnVoltar = new JButton("Voltar");
		panel_6.add(btnVoltar);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Menu2 menu = new Menu2();
				menu.frame.setVisible(true);
				
			}
		});
	}

}
