package Conectando;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
	private String host;
	private String banco;
	private String usuario;
	private String senha;

	public conexao() {

		this.host = "127.0.0.1";
		this.banco = "tecprog2022";
		this.usuario = "root";
		this.senha = "";
	}

	public Connection getConexao() {
		String url="jdbc:mysql://" + this.host + "/" + this.banco+"?verifyServerCertificate=false&useSSL=true";
		try {
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException ex) {
			System.out.println("Conex�o com MYSQL n�o realizada");
			ex.printStackTrace();
		}
		return null;
	}
}
