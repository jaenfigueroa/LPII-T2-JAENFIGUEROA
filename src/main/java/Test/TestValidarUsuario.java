package Test;

import DaoImp.ClassUsuarioImp;
import model.TblUsuariocl2;

public class TestValidarUsuario {

	public static void main(String[] args) {


		TblUsuariocl2 tbl=new TblUsuariocl2();
		ClassUsuarioImp crudimp= new ClassUsuarioImp();


		tbl.setIdusuariocl2(1);
		tbl.setUsuariocl2("jaenfigueroa");
		tbl.setPasswordcl2("123456");
		

		boolean buscausuario = crudimp.ValidarUsuario(tbl);


		
		System.out.println("--------------------------------------------");
		
		if(buscausuario){
			System.out.println("Las credenciales son correctas");
		} else{
			System.out.println("Las credenciales son Incorrectas");
		}

	}

}
