package br.fiap.modelo.dao;

import java.sql.SQLException;

import br.fiap.modelo.bean.Cliente;
import br.fiap.modelo.connection.ConnectionFactory;

public class ClienteDAO extends DAO {
	
	public ClienteDAO() {
		this.connection = ConnectionFactory.getInstance().getConnection();
	}
	
	
	public void cadastrar(Cliente cliente) {
		int idCliente = 0;
		
		try {
			// início da transação --> desativa o commit automático
			connection.setAutoCommit(false);
			
			// inserção na tabela usuário
			sql = "insert into java_clientes values(?, ?, sequencia_java_cliente.nextval)";
			ps = connection.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCpf());
			ps.execute();
			
			// obtém o ID do usuário que acabou de ser inserido
			sql = "select sequencia_java_cliente.currval from dual";
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				idCliente = rs.getInt(1);
			}
			System.out.println(idCliente);
			
			// obtém o ID do perfil que o usuário escolheu
			/*sql = "select id_cliente from java_clientes where nome = ?";
			ps = connection.prepareStatement(sql);
			ps.setString(1, cliente.getIdCliente());
			rs = ps.executeQuery();
			if(rs.next()) {
				idCliente = rs.getInt(1);
			}
			System.out.println(idCli);*/
			
			
			// confirma todas as operações no banco de dados
			connection.commit();
			
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
