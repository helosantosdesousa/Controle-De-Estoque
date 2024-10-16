package br.fiap.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fiap.modelo.bean.Cliente;
import br.fiap.modelo.dao.ClienteDAO;


@WebServlet("/cadastroCliente")
public class CadastroClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Cliente cliente = new Cliente();
	ClienteDAO dao = new ClienteDAO();
	
	
	String nome = request.getParameter("nome");
	String cpf = request.getParameter("cpf");
	
	cliente.setNome(nome);
	cliente.setCpf(cpf);
	
	dao.cadastrar(cliente);
	
	response.sendRedirect("admin/dashboard.jsp");
	
	}

	
	

}
