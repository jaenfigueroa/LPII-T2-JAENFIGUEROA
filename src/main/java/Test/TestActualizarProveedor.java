package Test;

import java.util.Date;

import DaoImp.ClassProveedorImp;
import model.TblProveedorcl2;

public class TestActualizarProveedor {

	public static void main(String[] args) {
		// instanciamos la respectivas clases
		TblProveedorcl2 tbl = new TblProveedorcl2();
		ClassProveedorImp crudimp = new ClassProveedorImp();
		
		
		tbl.setIdproveedorcl2(2);;
		tbl.setNomproveecl2("jaen");
		tbl.setRsocialproveecl2("Pacifico");
		tbl.setRucproveecl2("43434343");
		tbl.setEmailproveecl2("jaen@gmail.com");
		
		Date fecha = new Date();
		Date fechasql = new Date(fecha.getTime());
		
		tbl.setFeingproveecl2(fechasql);
		
		
		crudimp.ActualizarProveedor(tbl);
	}

}
