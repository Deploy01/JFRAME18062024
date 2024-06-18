package uShoe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Pedido extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pedido frame = new Pedido();
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
	public Pedido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Pedidos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 10, 0));
		
		JLabel lblFuncionario = new JLabel("Funcionário");
		panel.add(lblFuncionario);
		
		JLabel lblProduto = new JLabel("Produto");
		panel.add(lblProduto);
		
		JComboBox comboBox_1 = new JComboBox();
		panel.add(comboBox_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 10, 0));
		
		JLabel lblDataAtual = new JLabel("Data atual");
		panel_1.add(lblDataAtual);
		
		JLabel lblValor = new JLabel("Valor total");
		panel_1.add(lblValor);
		
		ZoneId z = ZoneId.of("America/Montreal");
        LocalDateTime now = LocalDateTime.now(z);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedNow = now.format(formatter);
        
        JLabel lblNewLabel_1 = new JLabel(formattedNow);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        panel_1.add(lblNewLabel_1);
        
        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        panel_1.add(textField_1);
        textField_1.setColumns(10);
        
        JPanel panel_3 = new JPanel();
        contentPane.add(panel_3);
        
        JPanel panel_2 = new JPanel();
        contentPane.add(panel_2);
        panel_2.setLayout(new GridLayout(0, 2, 10, 0));
        
        JButton btnConfirmar = new JButton("Confirmar");
        panel_2.add(btnConfirmar);
        
        JButton btnVoltar = new JButton("Voltar");
        panel_2.add(btnVoltar);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Menu2 menu = new Menu2();
				menu.frame.setVisible(true);
				
			}
		});
	}

}
