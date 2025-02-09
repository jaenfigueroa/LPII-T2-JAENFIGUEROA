package DaoImp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblUsuariocl2;

public class ClassUsuarioImp implements IUsuario {

	@Override
	public boolean ValidarUsuario(TblUsuariocl2 tblusuario) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;

		try {
			emf = Persistence.createEntityManagerFactory("LPII_T2_FIGUEROALLAMPIJAEN");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			TblUsuariocl2 tblusuarix = em.find(TblUsuariocl2.class, tblusuario.getIdusuariocl2());
			
			// Verificar si el usuario existe y hacer la comparación
			if (tblusuarix != null && tblusuarix.getUsuariocl2().equals(tblusuario.getUsuariocl2()) 
					&& tblusuarix.getPasswordcl2().equals(tblusuario.getPasswordcl2())) {
				em.getTransaction().commit();
				return true;
			} else {
				em.getTransaction().commit();
				return false;
			}
			
		} catch (Exception e) {
			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
			return false;
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}
}
