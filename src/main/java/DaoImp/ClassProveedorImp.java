package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProveedor;
import model.TblProveedorcl2;

public class ClassProveedorImp implements IProveedor {

	public void RegistrarProveedor(TblProveedorcl2 tblproveedor) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T2_FIGUEROALLAMPIJAEN");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(tblproveedor);
		System.out.println("Proveedor registrado correctamente");
		em.getTransaction().commit();
		em.close();
	}

	public void ActualizarProveedor(TblProveedorcl2 tblproveedor) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T2_FIGUEROALLAMPIJAEN");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();

		em.merge(tblproveedor);
		System.out.println("datos actualizado correctamente ");
		em.getTransaction().commit();
		em.close();
	}

	public void EliminarProveedor(TblProveedorcl2 tblproveedor) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T2_FIGUEROALLAMPIJAEN");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();

		TblProveedorcl2 tblprdoelim = em.find(TblProveedorcl2.class, tblproveedor.getIdproveedorcl2()); 
		em.remove(tblprdoelim);
		System.out.println("dato eliminado");
		em.getTransaction().commit();
		em.close();	
	}

	public List<TblProveedorcl2> ListadoProveedor() {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T2_FIGUEROALLAMPIJAEN");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();

		List<TblProveedorcl2> listadoproveedores=em.createQuery("select p from TblProveedorcl2 p",TblProveedorcl2.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return listadoproveedores;
	}

	public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 tblproveedor) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T2_FIGUEROALLAMPIJAEN");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		TblProveedorcl2 tblprovee=em.find(TblProveedorcl2.class,tblproveedor.getIdproveedorcl2());
		em.getTransaction().commit();
		em.close();
		return tblprovee;
	}
}
