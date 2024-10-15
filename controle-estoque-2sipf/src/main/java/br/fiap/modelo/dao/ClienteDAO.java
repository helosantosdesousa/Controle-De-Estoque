package br.fiap.modelo.dao;

import java.sql.SQLException;

import br.fiap.modelo.bean.Cliente;
import br.fiap.modelo.bean.Usuario;
import br.fiap.modelo.connection.ConnectionFactory;

public class ClienteDAO extends DAO {
	
	public ClienteDAO() {
		this.connection = ConnectionFactory.getInstance().getConnection();
	}
	
	public void cadastrar(Cliente cliente) {
		int idUsuario = 0, idPerfil = 0;
		
		try {
			// início da transação --> desativa o commit automático
			connection.setAutoCommit(false);
			
			// inserção na tabela usuário
			sql = "insert into java_clientes values(?, ?)";
			ps = connection.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCpf());
			ps.execute();
			
			// obtém o ID do usuário que acabou de ser inserido
			/*sql = "select sequencia_usuario.currval from dual";
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				idUsuario = rs.getInt(1);
			}
			System.out.println(idUsuario);
			
			// obtém o ID do perfil que o usuário escolheu
			sql = "select id_perfil from java_perfil where nome = ?";
			ps = connection.prepareStatement(sql);
			ps.setString(1, usuario.getPerfil().getPerfil());
			rs = ps.executeQuery();
			if(rs.next()) {
				idPerfil = rs.getInt(1);
			}
			System.out.println(idPerfil);
			
			// inserção na tabela java_usuario_perfil
			sql = "insert into java_usuario_perfil values(?, ?)";
			ps = connection.prepareStatement(sql);
			ps.setInt(1, idUsuario);
			ps.setInt(2, idPerfil);
			ps.execute();
			
			// confirma todas as operações no banco de dados
			connection.commit();*/
			
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {				
				System.out.println("erro ao cadastrar o usuário\n" + e1);
			}
			System.out.println("erro ao cadastrar o usuário\n" + e);
		}
	

}
	}
