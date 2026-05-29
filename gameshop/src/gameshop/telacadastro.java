package gameshop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JPasswordField;

public class telacadastro {

	private JFrame Cadastro;
	MaskFormatter maskcpf;
	MaskFormatter maskdata;
	MaskFormatter maskcep;
	MaskFormatter maskfone;
	private JPasswordField txtsenha;
	private JPasswordField txtConfirmarSenha;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telacadastro window = new telacadastro();
					window.Cadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telacadastro() {
		initialize();
	}
	public void visivel() {
		telacadastro window = new telacadastro();
		window.Cadastro.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Cadastro = new JFrame();
		Cadastro.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Users\\Aluno\\Music\\go.png"));
		Cadastro.setBounds(100, 100, 622, 635);
		Cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Cadastro.getContentPane().setLayout(null);
		try {
			maskcpf = new MaskFormatter("###.###.###-##");
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Erro","aviso",-1);
		}
		try {
			maskdata = new MaskFormatter("##/##/####");
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Erro","aviso",-1);
		}
		try {
			maskcep = new MaskFormatter("#####-###");
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Erro","aviso",-1);
		}
		try {
			maskfone = new MaskFormatter("+## (##) #####-####");
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Erro","aviso",-1);
		}
		
		txtConfirmarSenha = new JPasswordField();
		txtConfirmarSenha.setBorder(null);
		txtConfirmarSenha.setOpaque(false);
		txtConfirmarSenha.setBounds(151, 472, 346, 20);
		Cadastro.getContentPane().add(txtConfirmarSenha);
		
		txtsenha = new JPasswordField();
		txtsenha.setBorder(null);
		txtsenha.setOpaque(false);
		txtsenha.setBounds(151, 420, 346, 20);
		Cadastro.getContentPane().add(txtsenha);
		
		JFormattedTextField txtemail = new JFormattedTextField();
		txtemail.setOpaque(false);
		txtemail.setBorder(null);
		txtemail.setBounds(151, 369, 350, 18);
		Cadastro.getContentPane().add(txtemail);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(162, 0, 260, 47);
		Cadastro.getContentPane().add(lblNewLabel);
		
		JLabel CAD_NOME = new JLabel("");
		CAD_NOME.setForeground(new Color(255, 255, 255));
		CAD_NOME.setHorizontalAlignment(SwingConstants.CENTER);
		CAD_NOME.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CAD_NOME.setBounds(41, 79, 89, 29);
		Cadastro.getContentPane().add(CAD_NOME);
		
		JFormattedTextField txtnome = new JFormattedTextField();
		txtnome.setBorder(null);
		txtnome.setOpaque(false);
		txtnome.setBounds(151, 90, 350, 18);
		Cadastro.getContentPane().add(txtnome);
		
		JLabel CAD_NOME_1 = new JLabel("");
		CAD_NOME_1.setForeground(new Color(255, 255, 255));
		CAD_NOME_1.setHorizontalAlignment(SwingConstants.CENTER);
		CAD_NOME_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CAD_NOME_1.setBounds(41, 122, 89, 31);
		Cadastro.getContentPane().add(CAD_NOME_1);
		
		JLabel CAD_NOME_2 = new JLabel("");
		CAD_NOME_2.setForeground(new Color(255, 255, 255));
		CAD_NOME_2.setHorizontalAlignment(SwingConstants.CENTER);
		CAD_NOME_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CAD_NOME_2.setBounds(41, 165, 89, 29);
		Cadastro.getContentPane().add(CAD_NOME_2);
		
		JLabel CAD_NOME_1_1 = new JLabel("");
		CAD_NOME_1_1.setForeground(new Color(255, 255, 255));
		CAD_NOME_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		CAD_NOME_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CAD_NOME_1_1.setBounds(39, 204, 91, 29);
		Cadastro.getContentPane().add(CAD_NOME_1_1);
		
		JLabel CAD_NOME_3 = new JLabel("");
		CAD_NOME_3.setForeground(new Color(255, 255, 255));
		CAD_NOME_3.setHorizontalAlignment(SwingConstants.CENTER);
		CAD_NOME_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CAD_NOME_3.setBounds(41, 244, 89, 29);
		Cadastro.getContentPane().add(CAD_NOME_3);
		
		JLabel CAD_NOME_1_2 = new JLabel("");
		CAD_NOME_1_2.setForeground(new Color(255, 255, 255));
		CAD_NOME_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		CAD_NOME_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CAD_NOME_1_2.setBounds(41, 287, 89, 29);
		Cadastro.getContentPane().add(CAD_NOME_1_2);
		
		JFormattedTextField txtcpf = new JFormattedTextField(maskcpf);
		txtcpf.setBorder(null);
		txtcpf.setOpaque(false);
		txtcpf.setBounds(151, 135, 346, 18);
		Cadastro.getContentPane().add(txtcpf);
		
		JFormattedTextField txtdata = new JFormattedTextField(maskdata);
		txtdata.setBorder(null);
		txtdata.setOpaque(false);
		txtdata.setBounds(151, 176, 346, 18);
		Cadastro.getContentPane().add(txtdata);
		
		JFormattedTextField txtendereço = new JFormattedTextField();
		txtendereço.setBorder(null);
		txtendereço.setOpaque(false);
		txtendereço.setBounds(151, 222, 346, 18);
		Cadastro.getContentPane().add(txtendereço);
		
		JFormattedTextField txtcep = new JFormattedTextField(maskcep);
		txtcep.setBorder(null);
		txtcep.setOpaque(false);
		txtcep.setBounds(151, 272, 346, 18);
		Cadastro.getContentPane().add(txtcep);
		
		JFormattedTextField txtfone = new JFormattedTextField(maskfone);
		txtfone.setBorder(null);
		txtfone.setOpaque(false);
		txtfone.setBounds(155, 313, 346, 18);
		Cadastro.getContentPane().add(txtfone);
		
		JButton CAD_cadastrar = new JButton("");
		CAD_cadastrar.setOpaque(false);
		CAD_cadastrar.setBorder(null);
		CAD_cadastrar.setContentAreaFilled(false);
		CAD_cadastrar.setBorderPainted(false);
		CAD_cadastrar.setIcon(new ImageIcon(telacadastro.class.getResource("/imagens/State=Default (1).png")));
		CAD_cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtnome.getText().trim().toLowerCase();
				String cpf = txtcpf.getText().trim().toLowerCase();
				String data = txtdata.getText().trim().toLowerCase();
				String endereço = txtendereço.getText().trim().toLowerCase();
				String cep = txtcep.getText().trim().toLowerCase();
				String telefone = txtfone.getText().trim().toLowerCase();
				String email = txtemail.getText().trim().toLowerCase();
				String senha = txtsenha.getText().trim();
				String confirm = txtConfirmarSenha.getText().trim();
				String cpfFormatado = cpf.replaceAll("\\D", "");
				if(nome.isEmpty()==false&&cpf.isEmpty()==false&&data.isEmpty()==false&&endereço.isEmpty()==false&&cep.isEmpty()==false&&telefone.isEmpty()==false&&email.isEmpty()==false&&senha.isEmpty()==false&&confirm.isEmpty()==false) {
					if(nome.matches("[A-Za-z ]+")) {
						if(email.matches("[a-z0-9._%+-]+@[]A-Za-z0-9.-]+\\.[A-Za-z]{2,}")) {
							if(senha.equals(confirm)) {
								ValidaCPF val = new ValidaCPF();
								if(val.isCPF(cpfFormatado)) {
									Bancodedados b = new Bancodedados();
									b.conectar();
									if(b.verificar()) {
										System.out.println(senha);
										System.out.println(confirm);
										b.inserirCliente(nome, cpf, data, endereço, cep, telefone, email, senha);
										EnviarEmail env = new EnviarEmail();
										String mensagem = "Obrigado por se cadastrar na GreenGames";
										String assunto = "Cadastro Realizado";
										env.enviar(email, assunto, mensagem);
										telalogin tel = new telalogin();
										tel.visivel();
										Cadastro.dispose();
										JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso","Aviso",-1);
									} else {
										JOptionPane.showMessageDialog(null, "Erro no banco","aviso",-1);
									}
								} else {
									JOptionPane.showMessageDialog(null, "CPF inválido","aviso",-1);
								}
							} else {
								
								JOptionPane.showMessageDialog(null, "Senhas diferentes","aviso",-1);
							}
						} else {
							JOptionPane.showMessageDialog(null, "Email inválido","aviso",-1);
					} 
						} else {
						JOptionPane.showMessageDialog(null, "Nome inválido","aviso",-1);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Não pode ter campos vazios","aviso",-1);
				}
				
			}
		});
		CAD_cadastrar.setBounds(89, 534, 190, 37);
		Cadastro.getContentPane().add(CAD_cadastrar);
		
		JButton CAD_voltar = new JButton("");
		CAD_voltar.setOpaque(false);
		CAD_voltar.setBorder(null);
		CAD_voltar.setContentAreaFilled(false);
		CAD_voltar.setBorderPainted(false);
		CAD_voltar.setIcon(new ImageIcon(telacadastro.class.getResource("/imagens/State=State6 (1).png")));
		CAD_voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telalogin tel = new telalogin();
				tel.visivel();
				Cadastro.dispose();
			}
		});
		CAD_voltar.setBounds(311, 534, 190, 37);
		Cadastro.getContentPane().add(CAD_voltar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Users\\Aluno\\Downloads\\TV - 1 (11).png"));
		lblNewLabel_1.setBounds(0, 0, 606, 593);
		Cadastro.getContentPane().add(lblNewLabel_1);
	}
}
