package Controlador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoImp.ClassProveedorImp;
import DaoImp.ClassUsuarioImp;
import model.TblProveedorcl2;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorLogeo
 */
public class ControladorLogeo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorLogeo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// recuperamos los datos del formulario...
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");

		// hacer las respectivas instancias....
		TblUsuariocl2 tblprod = new TblUsuariocl2();
		ClassUsuarioImp climp = new ClassUsuarioImp();

		// asignamos los valores
		tblprod.setIdusuariocl2(1);
		tblprod.setUsuariocl2(usuario);
		tblprod.setPasswordcl2(password);
		
		boolean credencialesCorrectos = climp.ValidarUsuario(tblprod);
		
		if(credencialesCorrectos){
			
			ClassProveedorImp crudimpx = new ClassProveedorImp();
			List<TblProveedorcl2> listadoproveedores = crudimpx.ListadoProveedor();
			request.setAttribute("listado", listadoproveedores);
			
			request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
		} else{
			System.out.println("credencialesa incorrectas");
			
			request.setAttribute("errorMessage", "Usuario o contraseña incorrectos");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}
}
