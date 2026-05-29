package gameshop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class telacatalogo {

	private JFrame Catalogo;
	JTextArea mostrarcarrinho;
	ArrayList <String> carrinho = new ArrayList<>();
	JLabel lbltotal;
	double total = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telacatalogo window = new telacatalogo();
					window.Catalogo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telacatalogo() {
		initialize();
	}
	public void visivel() {
		telacatalogo window = new telacatalogo();
		window.Catalogo.setVisible(true);
		}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Catalogo = new JFrame();
		Catalogo.setBounds(100, 100, 1090, 661);
		Catalogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Catalogo.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Users\\Aluno\\Downloads\\iloveimg-resized (3)\\ff (1).png"));
		lblNewLabel_1.setBounds(36, 23, 100, 56);
		Catalogo.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Users\\Aluno\\Downloads\\iloveimg-resized (3)\\elden.png"));
		lblNewLabel.setBounds(168, 23, 100, 56);
		Catalogo.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Users\\Aluno\\Downloads\\iloveimg-resized (2)\\gow.png"));
		lblNewLabel_2.setBounds(307, 23, 100, 56);
		Catalogo.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Users\\Aluno\\Downloads\\iloveimg-resized (2)\\gta.png"));
		lblNewLabel_3.setBounds(441, 21, 100, 60);
		Catalogo.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\Users\\Aluno\\Downloads\\iloveimg-resized (2)\\mk.png"));
		lblNewLabel_4.setBounds(36, 226, 100, 57);
		Catalogo.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("New label");
		lblNewLabel_4_1.setIcon(new ImageIcon("D:\\Users\\Aluno\\Downloads\\iloveimg-resized (2)\\spider.png"));
		lblNewLabel_4_1.setBounds(40, 427, 100, 56);
		Catalogo.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\Users\\Aluno\\Downloads\\iloveimg-resized (3)\\rdr2.png"));
		lblNewLabel_5.setBounds(173, 226, 100, 56);
		Catalogo.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\Users\\Aluno\\Downloads\\iloveimg-resized (2)\\re.png"));
		lblNewLabel_6.setBounds(309, 226, 100, 57);
		Catalogo.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\Users\\Aluno\\Downloads\\iloveimg-resized (2)\\sf6.png"));
		lblNewLabel_7.setBounds(441, 226, 100, 56);
		Catalogo.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("D:\\Users\\Aluno\\Downloads\\iloveimg-resized (2)\\tlou.png"));
		lblNewLabel_8.setBounds(172, 427, 100, 56);
		Catalogo.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("D:\\Users\\Aluno\\Downloads\\iloveimg-resized (3)\\ufc.png"));
		lblNewLabel_9.setBounds(309, 427, 100, 57);
		Catalogo.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("D:\\Users\\Aluno\\Downloads\\iloveimg-resized (3)\\cod.png"));
		lblNewLabel_10.setBounds(446, 427, 100, 56);
		Catalogo.getContentPane().add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 224.90;
				lbltotal.setText(String.valueOf(String.format("%.2f",total)));
				carrinho.add("EA FC 24 - R$ 224,90");
				atualizarCarrinho();
			}
		});
		btnNewButton.setBounds(42, 152, 100, 22);
		Catalogo.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 250;
				lbltotal.setText(String.valueOf(String.format("%.2f",total)));
				carrinho.add("Elden Ring - R$ 250,00");
				atualizarCarrinho();
			}
		});
		btnNewButton_1.setBounds(173, 152, 100, 22);
		Catalogo.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setOpaque(false);
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 150.50;
				lbltotal.setText(String.valueOf(String.format("%.2f",total)));
				carrinho.add("God of War - R$ 150,50");
				atualizarCarrinho();
			}
		});
		btnNewButton_1_1.setBounds(309, 152, 100, 22);
		Catalogo.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setOpaque(false);
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setContentAreaFilled(false);
		btnNewButton_1_2.setBorderPainted(false);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 120;
				lbltotal.setText(String.valueOf(String.format("%.2f",total)));
				carrinho.add("GTA V - R$ 120,00");
				atualizarCarrinho();
			}
		});
		btnNewButton_1_2.setBounds(441, 152, 100, 22);
		Catalogo.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 124.25;
				lbltotal.setText(String.valueOf(String.format("%.2f",total)));
				carrinho.add("Mortal Kombat 1 - R$ 124,25");
				atualizarCarrinho();
			}});
		btnNewButton_2.setBounds(36, 350, 100, 22);
		Catalogo.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_3 = new JButton("");
		btnNewButton_1_3.setOpaque(false);
		btnNewButton_1_3.setBorder(null);
		btnNewButton_1_3.setContentAreaFilled(false);
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 150;
				lbltotal.setText(String.valueOf(String.format("%.2f",total)));
				carrinho.add("RDR2 - R$ 150,00");
				atualizarCarrinho();
			}
		});
		btnNewButton_1_3.setBounds(173, 350, 100, 22);
		Catalogo.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setOpaque(false);
		btnNewButton_1_1_1.setBorder(null);
		btnNewButton_1_1_1.setContentAreaFilled(false);
		btnNewButton_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 225.50;
				lbltotal.setText(String.valueOf(String.format("%.2f",total)));
				carrinho.add("RE 9 - R$ 225,50");
				atualizarCarrinho();
			}
		});
		btnNewButton_1_1_1.setBounds(309, 350, 100, 22);
		Catalogo.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("");
		btnNewButton_1_2_1.setOpaque(false);
		btnNewButton_1_2_1.setBorder(null);
		btnNewButton_1_2_1.setContentAreaFilled(false);
		btnNewButton_1_2_1.setBorderPainted(false);
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 84.50;
				lbltotal.setText(String.valueOf(String.format("%.2f",total)));
				carrinho.add("Street Fighter 6 - R$ 84,50");
				atualizarCarrinho();
			}
		});
		btnNewButton_1_2_1.setBounds(441, 350, 100, 22);
		Catalogo.getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 89.25;
				lbltotal.setText(String.valueOf(String.format("%.2f",total)));
				carrinho.add("Marvel Spider-man 2 - R$ 89,25");
				atualizarCarrinho();
			}
		});
		btnNewButton_3.setBounds(42, 554, 100, 22);
		Catalogo.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_4 = new JButton("");
		btnNewButton_1_4.setOpaque(false);
		btnNewButton_1_4.setBorder(null);
		btnNewButton_1_4.setContentAreaFilled(false);
		btnNewButton_1_4.setBorderPainted(false);
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 224.90;
				lbltotal.setText(String.valueOf(String.format("%.2f",total)));
				carrinho.add("The Last of Us II - R$ 224,90");
				atualizarCarrinho();
			}
		});
		btnNewButton_1_4.setBounds(173, 554, 100, 22);
		Catalogo.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_1_2 = new JButton("");
		btnNewButton_1_1_2.setOpaque(false);
		btnNewButton_1_1_2.setBorder(null);
		btnNewButton_1_1_2.setContentAreaFilled(false);
		btnNewButton_1_1_2.setBorderPainted(false);
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 289;
				lbltotal.setText(String.valueOf(String.format("%.2f",total)));
				carrinho.add("UFC 6 - R$ 289,00");
				atualizarCarrinho();
			}
		});
		btnNewButton_1_1_2.setBounds(314, 554, 100, 22);
		Catalogo.getContentPane().add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_2_2 = new JButton("");
		btnNewButton_1_2_2.setOpaque(false);
		btnNewButton_1_2_2.setBorder(null);
		btnNewButton_1_2_2.setContentAreaFilled(false);
		btnNewButton_1_2_2.setBorderPainted(false);
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 142.50;
				lbltotal.setText(String.valueOf(String.format("%.2f",total)));
				carrinho.add("Call of Duty BO6 - R$ 142,50");
				atualizarCarrinho();
			}
		});
		btnNewButton_1_2_2.setBounds(447, 554, 99, 22);
		Catalogo.getContentPane().add(btnNewButton_1_2_2);
		
		mostrarcarrinho = new JTextArea();
		JScrollPane scrollpane = new JScrollPane(mostrarcarrinho);
		Catalogo.getContentPane().add(scrollpane);
		mostrarcarrinho.setEditable(false);
		scrollpane.setBounds(640, 21, 424, 440);
		
		lbltotal = new JLabel("");
		lbltotal.setForeground(new Color(0, 255, 0));
		lbltotal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbltotal.setHorizontalAlignment(SwingConstants.CENTER);
		lbltotal.setBounds(894, 473, 99, 35);
		Catalogo.getContentPane().add(lbltotal);
		
		JLabel lblNewLabel_12 = new JLabel("R$");
		lblNewLabel_12.setForeground(new Color(0, 255, 0));
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(856, 472, 46, 36);
		Catalogo.getContentPane().add(lblNewLabel_12);
		
		JButton btnPIX = new JButton("");
		btnPIX.setOpaque(false);
		btnPIX.setBorder(null);
		btnPIX.setContentAreaFilled(false);
		btnPIX.setBorderPainted(false);
		btnPIX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Pix: denis.silvace@hotmail.com","PIX",-1);
				Bancodedados bd = new Bancodedados();
				bd.conectar();
				if(bd.verificar()) {
					bd.salvarVenda(carrinho);
					Catalogo.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "erro","aviso",-1);
				}
			}
		});
		btnPIX.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/State=Default (3).png")));
		btnPIX.setBackground(new Color(0, 0, 0));
		btnPIX.setBounds(694, 553, 100, 22);
		Catalogo.getContentPane().add(btnPIX);
		
		JButton btnCrédito = new JButton("");
		btnCrédito.setOpaque(false);
		btnCrédito.setBorder(null);
		btnCrédito.setContentAreaFilled(false);
		btnCrédito.setBorderPainted(false);
		btnCrédito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Pagamento realizado com sucesso","Crédito",-1);
				Bancodedados bd = new Bancodedados();
				bd.conectar();
				if(bd.verificar()) {
					bd.salvarVenda(carrinho);
					Catalogo.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "erro","aviso",-1);
				}
			}
		});
		btnCrédito.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/State=Default (4).png")));
		btnCrédito.setBackground(Color.BLACK);
		btnCrédito.setBounds(813, 554, 100, 22);
		Catalogo.getContentPane().add(btnCrédito);
		
		JButton btnDébito = new JButton("");
		btnDébito.setOpaque(false);
		btnDébito.setBorder(null);
		btnDébito.setContentAreaFilled(false);
		btnDébito.setBorderPainted(false);
		btnDébito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Pagamento realizado com sucesso","Débito",-1);
				Bancodedados bd = new Bancodedados();
				bd.conectar();
				if(bd.verificar()) {
					bd.salvarVenda(carrinho);
					Catalogo.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "erro","aviso",-1);
				}
			}
		});
		btnDébito.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/State=Default (5).png")));
		btnDébito.setBackground(Color.BLACK);
		btnDébito.setBounds(935, 553, 100, 22);
		Catalogo.getContentPane().add(btnDébito);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/TV - 1 (9).png")));
		lblNewLabel_11.setBounds(0, -45, 1074, 752);
		Catalogo.getContentPane().add(lblNewLabel_11);
	}
public void atualizarCarrinho() {
	mostrarcarrinho.setText("");
	for(int i = 0;i<carrinho.size();i++) {
		mostrarcarrinho.append(carrinho.get(i)+"\n");
	}
}
}
