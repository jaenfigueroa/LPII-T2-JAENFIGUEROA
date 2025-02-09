package Test;

import java.util.List;

import DaoImp.ClassProveedorImp;
import model.TblProveedorcl2;

public class TestListarProveedor {

	public static void main(String[] args) {

		ClassProveedorImp crudimp = new ClassProveedorImp();

		List<TblProveedorcl2> listadoproveedores = crudimp.ListadoProveedor();

	
		for (TblProveedorcl2 provee : listadoproveedores) {

			// imprimir por pantalla
			System.out.println("--------------------------------------------");
			System.out.println("ID: " + provee.getIdproveedorcl2());
			System.out.println("Nombre: " + provee.getNomproveecl2());
			System.out.println("Razon social: " + provee.getRsocialproveecl2());
			System.out.println("RUC: " + provee.getRucproveecl2());
			System.out.println("Email: " + provee.getEmailproveecl2());
			System.out.println("Fecha de ingreso: " + provee.getFeingproveecl2());

		} 

	}

}
