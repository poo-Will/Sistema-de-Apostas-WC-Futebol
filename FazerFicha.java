import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class FazerFicha extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private static FazerFicha frame;
	

	public FazerFicha() {
		setTitle("CADASTRO DE USU\u00C1RIO - WC");
		
		ImageIcon img = new ImageIcon("C:/Users/William/Desktop/Progeto/SistemaAposta/Sistema/src/imagens/dinheiro.jpg");
		JLabel lbImag = new JLabel(img);
		lbImag.setBounds(10, 0, 566, 351);
		
		
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
		lblNewLabel_1.setBounds(39, 88, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(122, 60, 227, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 86, 109, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnFazerAAposta = new JButton("Fazer a aposta");
		btnFazerAAposta.setForeground(Color.BLACK);
		btnFazerAAposta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnFazerAAposta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				Apostador apos = new Apostador();
				apos.setNome(textField.getText());
				apos.setTelefone(textField_1.getText());
				InterExibeTimes a = new InterExibeTimes(apos);
					
				
				a.setVisible(true);
				dispose();
			}
		});
		btnFazerAAposta.setBounds(39, 154, 192, 69);
		contentPane.add(btnFazerAAposta);
	}
}
