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
import model.TblProveedorcl2;

/**
 * Servlet implementation class ControladorProveedorImp
 */
public class ControladorProveedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProveedor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// instanciamos la respectiva clase...
		ClassProveedorImp crudimp = new ClassProveedorImp();
		TblProveedorcl2 tblproveedor = new TblProveedorcl2();
		
		// recuperamos el listado de productos de la BD..
		List<TblProveedorcl2> listadoproveedor = crudimp.ListadoProveedor();
		// enviamos hacia la vista...
		// almacenamos en el respectivo metodo...
		request.setAttribute("listado", listadoproveedor);

		// declaramos una variable de tipo string...
		// recibimos el valor segun la accion..
		String accion = request.getParameter("accion");
		
		System.out.println(accion);
		
		if (accion != null) {
			switch (accion) {
			case "Registrar":
				request.getRequestDispatcher("/FormRegistrarProveedor.jsp").forward(request, response);
				break;
			case "Listar":
				request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
				break;
			case "Modificar":
				System.out.println("m odffiixxxxxxxxxxxxxxxxxxxx");
				
				// obtenemos el codigo
				int cod = Integer.parseInt(request.getParameter("cod"));
				tblproveedor.setIdproveedorcl2(cod);

				// buscamos el codigo a actualizar...
				TblProveedorcl2 proveed = crudimp.BuscarProveedor(tblproveedor);
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

				// asignamos los valores
				// para enviarlos hacia la vista (formulario actualizar)
				request.setAttribute("idproveedorcl2", proveed.getIdproveedorcl2());
				request.setAttribute("emailproveecl2", proveed.getEmailproveecl2());
				request.setAttribute("feingproveecl2", format.format(proveed.getFeingproveecl2()));
				request.setAttribute("nomproveecl2", proveed.getNomproveecl2());
				request.setAttribute("rsocialproveecl2", proveed.getRsocialproveecl2());
				request.setAttribute("rucproveecl2", proveed.getRucproveecl2());
				
				// redireccionamos
				request.getRequestDispatcher("/FormModificarProveedor.jsp").forward(request, response);
				// salimos
				break;
			case "Eliminar":
				System.out.println("eliminaxxxxxxxxxxxxxxx");
				
				// obtenemos el codigo
				int codelim = Integer.parseInt(request.getParameter("cod"));
				// asignamos el codigo
				tblproveedor.setIdproveedorcl2(codelim);;
				// invocamos al metodo a eliminar...
				crudimp.EliminarProveedor(tblproveedor);;
				List<TblProveedorcl2> listado = crudimp.ListadoProveedor();
				// enviamos hacia la vista
				request.setAttribute("listado", listado);
				// redireccionamos
				request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
				break;
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("yyyyyyyyyyyyyyyy");
		
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		System.out.println(request.getParameter("emailproveecl2"));
		
		// recuperamos los datos del formulario...
		String codigo = request.getParameter("idproveedorcl2");
		String email = request.getParameter("emailproveecl2");
		String nomprovee = request.getParameter("nomproveecl2");
		String rsocial = request.getParameter("rsocialproveecl2");
		String rucprovee = request.getParameter("rucproveecl2");
		
		Date feing = null;
		try {
		    // Convierte la fecha, asegúrate de que el formato sea correcto
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Formato adecuado
		    feing = sdf.parse(request.getParameter("feingproveecl2"));
		} catch (ParseException e) {
		    // Manejar error en caso de que la fecha sea inválida
		    e.printStackTrace();
		}
		
		
		// hacer las respectivas instancias....
		TblProveedorcl2 tblprovee = new TblProveedorcl2();
		ClassProveedorImp climp = new ClassProveedorImp();
		
		
		// asignamos los valores
		tblprovee.setEmailproveecl2(email);
		tblprovee.setFeingproveecl2(feing);
		tblprovee.setNomproveecl2(nomprovee);
		tblprovee.setRsocialproveecl2(rsocial);
		tblprovee.setRucproveecl2(rucprovee);
		
		
		// aplicamos una condicion...
		if (codigo != null) {
			// int cod = Integer.parseInt(codigo);
			// luego asignamos el codigo a actualizar...
			tblprovee.setIdproveedorcl2(Integer.parseInt(codigo));
			// invocamos el metodo a actualizar...
			climp.ActualizarProveedor(tblprovee);;
			// invocamos el metodo registrar.
		} else {
			climp.RegistrarProveedor(tblprovee);;
		}
		
		
		// actualizamos el listado...
		List<TblProveedorcl2> listado = climp.ListadoProveedor();
		// enviamos hacia la vista
		request.setAttribute("listado", listado);
		// redireccionamos
		request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
		
	}

}
