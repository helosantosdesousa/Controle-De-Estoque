package br.fiap.modelo.dao;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import br.fiap.modelo.bean.Perfil;
import br.fiap.modelo.connection.ConnectionFactory;

public class PerfilDAO extends DAO {

	public PerfilDAO() {
		this.connection = ConnectionFactory.getInstance().getConnection();
	}

	public List<Perfil> listar() {
		List<Perfil> lista = new LinkedList<Perfil>();

		sql = "SELECT * FROM java_perfil ORDER BY nome";

		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();

			// enquanto tiver perfis
			while (rs.next()) {
				// instanciar
				Perfil perfil = new Perfil();

				// setar o perfil
				perfil.setIdPerfil(rs.getInt("id_perfil"));
				perfil.setPerfil(rs.getString("nome"));

				// adicionar a lista
				lista.add(perfil);
			}

		} catch (SQLException e) {
			System.out.println("erro ao lista perfil\n " + e);
		}
		return lista;
	}

}
