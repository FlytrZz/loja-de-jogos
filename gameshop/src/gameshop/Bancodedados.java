package gameshop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Bancodedados {
	
	public Connection conexão = null;
	public Statement consultas = null;
	public ResultSet resultado = null;
	
	Scanner numero = new Scanner(System.in);
	Scanner texto = new Scanner(System.in);
	
	
	public void conectar() {
		String servidor = "jdbc:mysql://localhost:3306/GreenGames";
		String usuario = "root";
		String senha = "Aluno";
		String driver = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driver);
			this.conexão = DriverManager.getConnection(servidor,usuario,senha);
			this.consultas = this.conexão.createStatement();
		} catch(Exception e){
			System.out.println("Erro ao conectar");
		}
	}
	
	public boolean verificar() {
		if(this.conexão!= null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void desconectar() {
		try {
			this.conexão.close();
		} catch(Exception e) {
			System.out.println("Erro");
		}
	}
	public void listarAlunos() {
		try {
			String query = "select * from alunos_senac order by nome_aluno";
			this.resultado = this.consultas.executeQuery(query);
			while(this.resultado.next()) {
				System.out.println("Matricula: "+this.resultado.getString("matricula")+
						", Nome do aluno: "+this.resultado.getString("nome_aluno")+
						", Idade: "+this.resultado.getString("idade")+
						", Sede do Senac: "+this.resultado.getString("sede_senac"));
			}
		} catch(Exception e){
			System.out.println("Erro");
		}
	}
	public boolean verificarLogin(String email,String senha) {
		try {
			String query = "select * from cadcliente where email = '"+email+"' and senha = '"+senha+"'";
			this.resultado = this.consultas.executeQuery(query);
			while(this.resultado.next()) {
				return true;
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro no banco","Aviso",-1);
		}
		return false;
	}
	public void inserirCliente(String nome,String cpf,String data,String endereço,String cep,String telefone,String email,String senha) {
		try {
			String query = "insert into cadcliente(nome,cpf,data,endereço,cep,telefone,email,senha) values('"+nome+"','"+cpf+"','"+data+"','"+endereço+"','"+cep+"','"+telefone+"','"+email+"','"+senha+"')";
			this.consultas.executeUpdate(query);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro no banco","Aviso",-1);
		}
	}
	public void inserirAluno(String nome,int idade,String sede) {
		try {
			String query = "insert into alunos_senac(nome_aluno,idade,sede_senac) values ('"+nome+"','"+idade+"','"+sede+"')";
			this.consultas.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("Erro");
		}
	}
	public void inseriAluno() {
		System.out.println("Digite o id que você deseja alterar");
		int id = numero.nextInt();
		System.out.println("Nome do aluno: ");
		String nome = texto.nextLine();
		System.out.println("Idade: ");
		int idade = numero.nextInt();
		System.out.println("Sede do Senac: ");
		String sede= texto.nextLine();
		try {
			String query = "insert into alunos_senac(nome_aluno,idade,sede_senac) values ('"+nome+"','"+idade+"','"+sede+"')";
			this.consultas.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("Erro");
		}
	}
	public void editarAluno(int matricula,String nome,int idade,String sede) {
		try {
			String query = "update alunos_senac set nome_aluno = '"+nome+"',idade = '"+idade+"',sede_senac = '"+sede+"' where matricula = '"+matricula+"'";
			this.consultas.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("Erro"+e.getMessage());
		}
	}
	public void apagarAluno() {
		int matricula1 = numero.nextInt();
		try {
			String query = "delete from alunos_senac where matricula = '"+matricula1+"'";
			this.consultas.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("Erro"+e.getMessage());
		}
	}
	public void salvarVenda(ArrayList <String> carrinho) {
		try {
			this.consultas = conexão.createStatement();
			for(String item: carrinho) {
				String query = "insert into vendas() values('"+item+"')";
				this.consultas.executeUpdate(query);
			}
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "erro","aviso",-1);
			
		}
	}
}
