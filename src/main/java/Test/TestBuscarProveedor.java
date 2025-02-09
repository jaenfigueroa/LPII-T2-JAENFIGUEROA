package Test;


import DaoImp.ClassProveedorImp;
import model.TblProveedorcl2;

public class TestBuscarProveedor {

	public static void main(String[] args) {
		//instanciamos la respectivas clases
		TblProveedorcl2 tbl=new TblProveedorcl2();
		ClassProveedorImp crudimp=new ClassProveedorImp();
		
		tbl.setIdproveedorcl2(2);

		TblProveedorcl2 buscaproveed=crudimp.BuscarProveedor(tbl);

		
		System.out.println("--------------------------------------------");
		System.out.println("ID: " + buscaproveed.getIdproveedorcl2());
		System.out.println("Nombre: " + buscaproveed.getNomproveecl2());
		System.out.println("Razon social: " + buscaproveed.getRsocialproveecl2());
		System.out.println("RUC: " + buscaproveed.getRucproveecl2());
		System.out.println("Email: " + buscaproveed.getEmailproveecl2());
		System.out.println("Fecha de ingreso: " + buscaproveed.getFeingproveecl2());
	}
}
