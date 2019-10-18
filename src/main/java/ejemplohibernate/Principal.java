package ejemplohibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Principal {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Persona persona = new Persona();
		persona.setNombre("Juan");
		session.save(persona);
		System.out.println(persona.getId());
		transaction.commit();
		session.close();
	}

}
