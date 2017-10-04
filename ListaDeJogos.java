import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class ListaDeJogos extends JFrame {

	private JPanel contentPane;
	private List<JButton> botoes;
	GerenciaDeTime time;

	public ListaDeJogos() {
		time = new GerenciaDeTime();
		botoes = new ArrayList();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iniciarBotoes();
		iniciarLabel();
		alteraTextB();
	}
	
	
	
	public void iniciarLabel(){
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 12));
		lblNewLabel.setBounds(149, 73, 9, 23);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("X");
		label.setFont(new Font("Sylfaen", Font.BOLD, 12));
		label.setBounds(149, 107, 9, 23);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("X");
		label_1.setFont(new Font("Sylfaen", Font.BOLD, 12));
		label_1.setBounds(149, 150, 9, 23);
		contentPane.add(label_1);
		
		
		
		JLabel label_2 = new JLabel("X");
		label_2.setFont(new Font("Sylfaen", Font.BOLD, 12));
		label_2.setBounds(149, 194, 9, 23);
		contentPane.add(label_2);
		
		
		
		JLabel label_3 = new JLabel("X");
		label_3.setFont(new Font("Sylfaen", Font.BOLD, 12));
		label_3.setBounds(149, 239, 9, 23);
		contentPane.add(label_3);
		
		
		
		
		JLabel label_4 = new JLabel("X");
		label_4.setFont(new Font("Sylfaen", Font.BOLD, 12));
		label_4.setBounds(149, 289, 9, 23);
		contentPane.add(label_4);
		
		
		
		JLabel label_5 = new JLabel("X");
		label_5.setFont(new Font("Sylfaen", Font.BOLD, 12));
		label_5.setBounds(149, 26, 9, 23);
		contentPane.add(label_5);
		
		
		
		JLabel label_6 = new JLabel("X");
		label_6.setFont(new Font("Sylfaen", Font.BOLD, 12));
		label_6.setBounds(149, 334, 9, 23);
		contentPane.add(label_6);
		
		
		
		JLabel label_7 = new JLabel("X");
		label_7.setFont(new Font("Sylfaen", Font.BOLD, 12));
		label_7.setBounds(149, 378, 9, 23);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("X");
		label_8.setFont(new Font("Sylfaen", Font.BOLD, 12));
		label_8.setBounds(149, 428, 9, 23);
		contentPane.add(label_8);
	}
	
	public void iniciarBotoes(){
		
		JButton b1 = new JButton("");
		b1.setBounds(21, 26, 112, 23);
		contentPane.add(b1);
		
		JButton b2 = new JButton("");
		b2.setBounds(185, 26, 110, 23);
		contentPane.add(b2);
		
		JButton b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		b3.setBounds(23, 73, 110, 23);
		contentPane.add(b3);
		
		JButton b4 = new JButton("");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b4.setBounds(185, 73, 110, 23);
		contentPane.add(b4);
		
		
		JButton b5 = new JButton("");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b5.setBounds(23, 107, 110, 23);
		contentPane.add(b5);
		
		JButton b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b6.setBounds(185, 107, 110, 23);
		contentPane.add(b6);
		
		JButton b7 = new JButton("");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b7.setBounds(23, 150, 110, 23);
		contentPane.add(b7);
		
		
		JButton b8 = new JButton("");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b8.setBounds(185, 150, 110, 23);
		contentPane.add(b8);
		
		JButton b9 = new JButton("");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b9.setBounds(23, 194, 110, 23);
		contentPane.add(b9);
		
		JButton b10 = new JButton("");
		b10.setBounds(185, 194, 110, 23);
		contentPane.add(b10);
		
		JButton b11 = new JButton("");
		b11.setBounds(23, 239, 110, 23);
		contentPane.add(b11);
		
		JButton b12 = new JButton("");
		b12.setBounds(185, 239, 110, 23);
		contentPane.add(b12);
		
		JButton b13 = new JButton("");
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b13.setBounds(23, 289, 110, 23);
		contentPane.add(b13);
		
		JButton b14 = new JButton("");
		b14.setBounds(185, 289, 110, 23);
		contentPane.add(b14);
		
		JButton b15 = new JButton("");
		b15.setBounds(23, 334, 110, 23);
		contentPane.add(b15);
		
		JButton b16 = new JButton("");
		b16.setBounds(185, 334, 110, 23);
		contentPane.add(b16);
		
		JButton b17 = new JButton("");
		b17.setBounds(23, 378, 110, 23);
		contentPane.add(b17);
		
		JButton b18 = new JButton("");
		b18.setBounds(185, 378, 110, 23);
		contentPane.add(b18);
		
		
		JButton b19 = new JButton("");
		b19.setBounds(23, 428, 110, 23);
		contentPane.add(b19);
		
		
		JButton b20 = new JButton("");
		b20.setBounds(185, 428, 110, 23);
		contentPane.add(b20);
		
		
		JButton btnNewButton = new JButton("Finalizar Aposta");
		btnNewButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(369, 150, 153, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar Aposta");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 11));
		btnNewButton_1.setBounds(369, 184, 153, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Adicionar Nova Aposta");
		btnNewButton_2.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 11));
		btnNewButton_2.setBounds(356, 218, 181, 28);
		contentPane.add(btnNewButton_2);
		
		
		botoes.add(b1);
		botoes.add(b2);
		botoes.add(b3);
		botoes.add(b4);
		botoes.add(b5);
		botoes.add(b6);
		botoes.add(b7);
		botoes.add(b8);
		botoes.add(b9);
		botoes.add(b10);
		botoes.add(b11);
		botoes.add(b12);
		botoes.add(b13);
		botoes.add(b14);
		botoes.add(b15);
		botoes.add(b16);
		botoes.add(b17);
		botoes.add(b18);
		botoes.add(b19);
		botoes.add(b20);
	}
	
	public void alteraTextB(){
		List<String> a = time.getTimes();
		Collections.shuffle(botoes);
		
		for(int x=0; x<a.size(); x++){	
			botoes.get(x).setText(a.get(x));	
		}
	}
}
