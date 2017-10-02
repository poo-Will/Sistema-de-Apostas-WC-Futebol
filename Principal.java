import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;

public class Principal extends JFrame {
	Apostador a=  new Apostador();
	
	private JPanel contentPane;
	private static Principal frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistema de Apostas WC");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Microsoft JhengHei Light", Font.BOLD, 14));
		lblNewLabel.setBounds(100, 40, 229, 36);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Fazer Aposta");
		btnNewButton.setFont(new Font("Microsoft JhengHei Light", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//frame.dispose();
				
				FazerFicha a = new FazerFicha();
				a.setVisible(true);
			}
		});
		btnNewButton.setBounds(137, 87, 120, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(153, 155, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ver Lista De Jogos");
		btnNewButton_2.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 11));
		btnNewButton_2.setBounds(120, 121, 158, 23);
		contentPane.add(btnNewButton_2);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
