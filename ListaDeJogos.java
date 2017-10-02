import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ListaDeJogos extends JFrame {

	private JPanel contentPane;


	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaDeJogos frame = new ListaDeJogos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/


	public ListaDeJogos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Finalizar Aposta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(271, 40, 153, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar Aposta");
		btnNewButton_1.setBounds(271, 78, 153, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Adicionar Nova Aposta");
		btnNewButton_2.setBounds(271, 112, 153, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 12));
		lblNewLabel.setBounds(109, 41, 9, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton();
		btnNewButton_3.setText(jogo[0]);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3.setBounds(10, 40, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton(jogo[3]);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(10, 78, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton(jogo[4]);
		btnNewButton_5.setBounds(125, 78, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton(jogo[1]);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBounds(125, 40, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JLabel label = new JLabel("X");
		label.setFont(new Font("Sylfaen", Font.BOLD, 12));
		label.setBounds(109, 82, 9, 23);
		contentPane.add(label);
		
		JButton button = new JButton(jogo[5]);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(10, 112, 89, 23);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("X");
		label_1.setFont(new Font("Sylfaen", Font.BOLD, 12));
		label_1.setBounds(109, 113, 9, 23);
		contentPane.add(label_1);
		
		JButton button_1 = new JButton(jogo[6]);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(125, 112, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(10, 150, 89, 23);
		contentPane.add(button_2);
		
		JLabel label_2 = new JLabel("X");
		label_2.setFont(new Font("Sylfaen", Font.BOLD, 12));
		label_2.setBounds(109, 154, 9, 23);
		contentPane.add(label_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(125, 150, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.setBounds(10, 184, 89, 23);
		contentPane.add(button_4);
		
		JLabel label_3 = new JLabel("X");
		label_3.setFont(new Font("Sylfaen", Font.BOLD, 12));
		label_3.setBounds(109, 188, 9, 23);
		contentPane.add(label_3);
		
		JButton button_5 = new JButton("New button");
		button_5.setBounds(125, 184, 89, 23);
		contentPane.add(button_5);
	}

}
