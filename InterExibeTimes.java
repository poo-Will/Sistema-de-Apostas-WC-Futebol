import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class InterExibeTimes extends JFrame {

	private JPanel contentPane;
	private List<JButton> botoes;
	private static GerenciaDeAposta time = new GerenciaDeAposta();
	
	private Apostador p;
	
	//private static GerenciaDeAposta gp = new GerenciaDeAposta();
	
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b10;
	JButton b11;
	JButton b12;
	JButton b13;
	JButton b14;
	JButton b15;
	JButton b16;
	JButton b17;
	JButton b18;
	JButton b19;
	JButton b20;
	
	public InterExibeTimes(Apostador p) {
		this.p = p;
		botoes = new ArrayList();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iniciarBotoes();
		alteraTextB();
		iniciarLabel();
		
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
		
		JList list = new JList();
		list.setBounds(500, 26, 1, 1);
		contentPane.add(list);
		
	}
	
	
	
	public void iniciarBotoes(){
		
		b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b2.setText("");
				Time t = new Time(b1.getText());
				p.addTimeAposta(t);
			}
		});
		b1.setBounds(21, 26, 112, 23);
		contentPane.add(b1);
		
		b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b1.setText("");
				Time t = new Time(b2.getText());
				p.addTimeAposta(t);
			}
		});
		b2.setBounds(185, 26, 110, 23);
		contentPane.add(b2);
		
		b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b4.setText("");
				Time t = new Time(b3.getText());
				p.addTimeAposta(t);
			}
		});
		b3.setBounds(23, 73, 110, 23);
		contentPane.add(b3);
		
		b4 = new JButton("");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3.setText("");
				Time t = new Time(b4.getText());
				p.addTimeAposta(t);
			}
		});
		b4.setBounds(185, 73, 110, 23);
		contentPane.add(b4);
		
		
		b5 = new JButton("");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b6.setText("");
				Time t = new Time(b5.getText());
				p.addTimeAposta(t);
			}
		});
		b5.setBounds(23, 107, 110, 23);
		contentPane.add(b5);
		
		b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b5.setText("");
				Time t = new Time(b6.getText());
				p.addTimeAposta(t);
			}
		});
		b6.setBounds(185, 107, 110, 23);
		contentPane.add(b6);
		
		b7 = new JButton("");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b8.setText("");
				Time t = new Time(b7.getText());
				p.addTimeAposta(t);
			}
		});
		b7.setBounds(23, 150, 110, 23);
		contentPane.add(b7);
		
		
		b8 = new JButton("");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b7.setText("");
				Time t = new Time(b8.getText());
				p.addTimeAposta(t);
			}
		});
		b8.setBounds(185, 150, 110, 23);
		contentPane.add(b8);
		
		b9 = new JButton("");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b10.setText("");
				Time t = new Time(b9.getText());
				p.addTimeAposta(t);
			}
		});
		b9.setBounds(23, 194, 110, 23);
		contentPane.add(b9);
		
		b10 = new JButton("");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b9.setText("");
				Time t = new Time(b10.getText());
				p.addTimeAposta(t);
			}
		});
		b10.setBounds(185, 194, 110, 23);
		contentPane.add(b10);
		
		b11 = new JButton("");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b12.setText("");
				Time t = new Time(b11.getText());
				p.addTimeAposta(t);
			}
		});
		b11.setBounds(23, 239, 110, 23);
		contentPane.add(b11);
		
		b12 = new JButton("");
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b11.setText("");
				Time t = new Time(b12.getText());
				p.addTimeAposta(t);
			}
		});
		b12.setBounds(185, 239, 110, 23);
		contentPane.add(b12);
		
		b13 = new JButton("");
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b14.setText("");
				Time t = new Time(b13.getText());
				p.addTimeAposta(t);
			}
		});
		b13.setBounds(23, 289, 110, 23);
		contentPane.add(b13);
		
		b14 = new JButton("");
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b13.setText("");
				Time t = new Time(b14.getText());
				p.addTimeAposta(t);
			}
		});
		b14.setBounds(185, 289, 110, 23);
		contentPane.add(b14);
		
		b15 = new JButton("");
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b16.setText("");
				Time t = new Time(b15.getText());
				p.addTimeAposta(t);
			}
		});
		b15.setBounds(23, 334, 110, 23);
		contentPane.add(b15);
		
		b16 = new JButton("");
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b15.setText("");
				Time t = new Time(b16.getText());
				p.addTimeAposta(t);
			}
		});
		b16.setBounds(185, 334, 110, 23);
		contentPane.add(b16);
		

		b17 = new JButton("");
		b17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b18.setText("");
				Time t = new Time(b17.getText());
				p.addTimeAposta(t);
			}
		});
		b17.setBounds(23, 378, 110, 23);
		contentPane.add(b17);
		
		b18 = new JButton("");
		b18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b17.setText("");
				Time t = new Time(b18.getText());
				p.addTimeAposta(t);
			}
		});
		b18.setBounds(185, 378, 110, 23);
		contentPane.add(b18);
		
		
		b19 = new JButton("");
		b19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b20.setText("");
				Time t = new Time(b19.getText());
				p.addTimeAposta(t);
			}
		});
		b19.setBounds(23, 428, 110, 23);
		contentPane.add(b19);
		
		
		b20 = new JButton("");
		b20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b19.setText("");
				Time t = new Time(b20.getText());
				p.addTimeAposta(t);
			}
		});
		b20.setBounds(185, 428, 110, 23);
		contentPane.add(b20);
		
		
		JButton btnNewButton = new JButton("Finalizar Aposta");
		btnNewButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int valorAp = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser apostado R$:"));
				p.setValor(valorAp);
				time.addApostador(p);
				
			}
			
		});
		btnNewButton.setBounds(369, 150, 153, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar Aposta");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal a = new Principal();
				
				a.setVisible(true);
				dispose();
				  
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 11));
		btnNewButton_1.setBounds(369, 184, 153, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Adicionar Nova Aposta");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FazerFicha a = new FazerFicha();
				a.setVisible(true);
				dispose();
				
			}
		});
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
		List<Time> a = time.getTimes();
		Collections.shuffle(botoes);
		
		
		for(int x=0; x<a.size(); x++){	
			botoes.get(x).setText(a.get(x).getNome());	
		}
	}
}
