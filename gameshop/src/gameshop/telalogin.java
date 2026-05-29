package gameshop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class telalogin {

	private JFrame Login;
	private JTextField txtusuario;
	private JButton ent;
	private JLabel lblNewLabel_1;
	private JPasswordField txtsenha;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telalogin window = new telalogin();
					window.Login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telalogin() {
		initialize();
	}
	public void visivel() {
		try {
			telalogin window = new telalogin();
			window.Login.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Login = new JFrame();
		Login.getContentPane().setBackground(new Color(64, 0, 128));
		Login.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Users\\Aluno\\Music\\go.png"));
		Login.setTitle("Inicio");
		Login.setBounds(100, 100, 574, 455);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Login.getContentPane().setLayout(null);
		
		JLabel usuario = new JLabel("");
		usuario.setForeground(new Color(255, 255, 255));
		usuario.setHorizontalAlignment(SwingConstants.CENTER);
		usuario.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
		usuario.setBounds(46, 160, 123, 39);
		Login.getContentPane().add(usuario);
		
		JLabel senha = new JLabel("");
		senha.setForeground(new Color(255, 255, 255));
		senha.setHorizontalAlignment(SwingConstants.CENTER);
		senha.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
		senha.setBounds(46, 251, 123, 39);
		Login.getContentPane().add(senha);
		
		txtusuario = new JTextField();
		txtusuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtusuario.setForeground(new Color(0, 0, 0));
		txtusuario.setBounds(167, 169, 247, 30);
		Login.getContentPane().add(txtusuario);
		txtusuario.setColumns(10);
		txtusuario.setBorder(null);
		txtusuario.setOpaque(false);
		
		ent = new JButton("");
		ent.setOpaque(false);
		ent.setBorder(null);
		ent.setContentAreaFilled(false);
		ent.setBorderPainted(false);
		ent.setIcon(new ImageIcon(telalogin.class.getResource("/imagens/State=Default.png")));
		ent.setFont(new Font("Baskerville Old Face", Font.PLAIN, 11));
		ent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = txtusuario.getText();
				String senha = txtsenha.getText();
				Bancodedados bd = new Bancodedados();
				bd.conectar();
				if(bd.verificarLogin(usuario, senha)) {
					telacatalogo tel = new telacatalogo();
					tel.visivel();
					Login.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha inválido","Atenção",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		ent.setBounds(82, 337, 169, 39);
		Login.getContentPane().add(ent);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 27));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(157, 80, 257, 39);
		Login.getContentPane().add(lblNewLabel_1);
		
		txtsenha = new JPasswordField();
		txtsenha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtsenha.setBounds(167, 260, 247, 30);
		Login.getContentPane().add(txtsenha);
		txtsenha.setBorder(null);
		txtsenha.setOpaque(false);
		
		JButton cadastrar = new JButton("");
		cadastrar.setOpaque(false);
		cadastrar.setBorder(null);
		cadastrar.setContentAreaFilled(false);
		cadastrar.setBorderPainted(false);
		cadastrar.setIcon(new ImageIcon(telalogin.class.getResource("/imagens/State=State6.png")));
		cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telacadastro tel = new telacadastro();
				tel.visivel();
				Login.dispose();
			}
		});
		cadastrar.setFont(new Font("Baskerville Old Face", Font.PLAIN, 11));
		cadastrar.setBounds(328, 337, 169, 39);
		Login.getContentPane().add(cadastrar);
		
		JCheckBox caixasenha = new JCheckBox("Mostrar senha");
		caixasenha.setFont(new Font("Rockwell Condensed", Font.PLAIN, 16));
		caixasenha.setHorizontalAlignment(SwingConstants.CENTER);
		caixasenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(caixasenha.isSelected()) {
					txtsenha.setEchoChar((char)0);
				} else {
					txtsenha.setEchoChar('*');
				}
			}
		});
		caixasenha.setForeground(new Color(128, 64, 0));
		caixasenha.setBackground(new Color(64, 128, 128));
		caixasenha.setBounds(99, 303, 112, 23);
		Login.getContentPane().add(caixasenha);
		caixasenha.setBorder(null);
		caixasenha.setOpaque(false);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(telalogin.class.getResource("/imagens/TV - 1 (2).png")));
		lblNewLabel.setBounds(0, 0, 559, 416);
		Login.getContentPane().add(lblNewLabel);
		
	}
}
