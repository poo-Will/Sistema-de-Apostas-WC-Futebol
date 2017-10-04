import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class FazerFicha extends JFrame {
	
	private static ListJogos a = new ListJogos();
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private static FazerFicha frame;

	public FazerFicha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio");
		lblNewLabel.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 11));
		lblNewLabel.setBounds(39, 63, 46, 14);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Telefone");
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei Light", Font.BOLD, 11));
		lblNewLabel_1.setBounds(39, 131, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(122, 60, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 128, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnFazerAAposta = new JButton("Fazer a aposta");
		btnFazerAAposta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Apostador apos = new Apostador();
				
				apos.setNome(textField.getText());
				apos.setTelefone(textField_1.getText());
				
				ListaDeJogos a = new ListaDeJogos();
				a.setVisible(true);
				dispose();
			}
		});
		btnFazerAAposta.setBounds(290, 103, 122, 23);
		contentPane.add(btnFazerAAposta);
	}
}
