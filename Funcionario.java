package uShoe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;

public class Funcionario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txfNome;
	private JTextField txfSobrenome;
	private JTextField txfSalario;
	private JTextField txfEmail;
	private JTextField txfTelefone;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario frame = new Funcionario();
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
	public Funcionario() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(200, 200, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(10, 0, 0, 0));
		
		JLabel lblTitle = new JLabel("Cadastro de funcionário");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitle);
		
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
		panel_1.setLayout(new GridLayout(0, 3, 10, 0));
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblCargo);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblSalario);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblTelefone);
		
		JComboBox comboCargo = new JComboBox();
		comboCargo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCargo.setLabelFor(comboCargo);
		panel_1.add(comboCargo);
		
		txfSalario = new JTextField();
		txfSalario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(txfSalario);
		txfSalario.setColumns(10);
		
		txfTelefone = new JTextField();
		txfTelefone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(txfTelefone);
		txfTelefone.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblEmail);
		
		txfEmail =new JTextField();
		txfEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(txfEmail);
		txfEmail.setColumns(10);
		
		JLabel lblEndereco_1 = new JLabel("Endereço do funcionário ");
		lblEndereco_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEndereco_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblEndereco_1);
		
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
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		panel_3.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		panel_3.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		panel_3.add(textField_2);
		
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
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		panel_4.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		panel_4.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setColumns(10);
		panel_4.add(textField_5);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		panel_5.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setHorizontalAlignment(SwingConstants.LEFT);
		panel_5.add(lblBairro);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setColumns(10);
		panel_5.add(textField_6);
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7);
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 2, 10, 10));
		
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
