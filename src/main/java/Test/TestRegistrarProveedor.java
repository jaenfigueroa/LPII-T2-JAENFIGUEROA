package Test;

import java.util.Date;

import DaoImp.ClassProveedorImp;
import model.TblProveedorcl2;

public class TestRegistrarProveedor {

	public static void main(String[] args) {
		
		TblProveedorcl2 tbl = new TblProveedorcl2();
		ClassProveedorImp crudimp = new ClassProveedorImp();
		
		tbl.setNomproveecl2("Maria");
		tbl.setRsocialproveecl2("Pacifico");
		tbl.setRucproveecl2("43434343");
		tbl.setEmailproveecl2("maria@gmail.com");
		
		Date fecha = new Date();
		Date fechasql = new Date(fecha.getTime());
		
		tbl.setFeingproveecl2(fechasql);

	
		crudimp.RegistrarProveedor(tbl);
	}

}
