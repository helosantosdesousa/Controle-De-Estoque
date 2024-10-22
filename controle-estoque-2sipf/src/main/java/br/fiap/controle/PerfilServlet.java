package br.fiap.controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.fiap.modelo.bean.Perfil;
import br.fiap.modelo.dao.PerfilDAO;


@WebServlet("/perfil")
public class PerfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PerfilServlet() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	List<Perfil> lista = new PerfilDAO().listar();
	HttpSession session = request.getSession();
	
	//máximo de tempo q vai ficar logado
	session.setMaxInactiveInterval(30 * 60); //esse *60 é pq o parametro eh em segundos!!
	session.setAttribute("lista", lista);
	response.sendRedirect("usuario/formCadastroUsuario.jsp");
	
	
	}

}
