package Test;


import DaoImp.ClassProveedorImp;
import model.TblProveedorcl2;

public class TestEliminarProveedor {

	public static void main(String[] args) {
		TblProveedorcl2 tbl=new TblProveedorcl2();
		ClassProveedorImp crudimp=new ClassProveedorImp();

		tbl.setIdproveedorcl2(2);
		

		crudimp.EliminarProveedor(tbl);;
	}

}
