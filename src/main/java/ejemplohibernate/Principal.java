package ejemplohibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mysql.cj.QueryResult;

public class Principal {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
//		CONSULTA 1 =================================================================
//		Persona persona = new Persona();
//		persona.setNombre("Juan");
//		session.save(persona);
//		Long idGenerado = persona.getId();
//				
//		System.out.println(persona.getId());
//		
//		Persona personaRecuperada = (Persona) session.get(Persona.class,  idGenerado);
//		personaRecuperada.setNombre("Maria");
//		
//		session.saveOrUpdate(personaRecuperada);
//		
//		Query consulta = session.createQuery("from Persona as p order by p.nombre");
//		List<Persona> personas = consulta.list();
//
//		for (Persona p : personas) {
//			System.out.println(p.getId() +  p.getNombre());
//		}
//		
//		CONSULTA 2 =================================================================
//
//		Direccion direccion = new Direccion();
//		direccion.setCalle("Cuevas");
//		direccion.setAltura(3810);
//		session.save(direccion);
//
//		Telefono telefono1 = new Telefono();
//		telefono1.setNumero(12345612);
//		session.save(telefono1);
//		
//		Telefono telefono2 = new Telefono();
//		telefono2.setNumero(656513);
//		session.save(telefono2);
//		
//		Persona persona = new Persona();
//		persona.setNombre("Julio");
//		persona.setDireccion(direccion);
//		
//		persona.getTelefonos().add(telefono1);
//		persona.getTelefonos().add(telefono2);
//		session.save(persona);
//
//		Long idGenerado = persona.getId();
//
//		CONSULTA 3 =================================================================		
//
//		Long idPersona = 10L;
//
//		Persona persona = (Persona) session.load(Persona.class, idPersona);
//		Direccion direccion = persona.getDireccion();
//
//		System.out.println(direccion.getCalle());
//
//		for (Telefono t : persona.getTelefonos()) {
//			System.out.println(t.getNumero());
//		}
//
//		CONSULTA 4 =================================================================
//
//		Long idPersona = 10L;
//
//		Query query1 = session.createQuery("select p.direccion from Persona as p where p.id = :idPersona");
//		query1.setLong("idPersona", idPersona);
//		Direccion direccion = (Direccion) query1.uniqueResult();
//
//		System.out.println("DIRECCION.CALLE >>>>>>>>>>>" + direccion.getCalle());
//
//		Query query2 = session.createQuery("select p.telefonos from Persona as p where p.id = :idPersona");
//		query2.setLong("idPersona", idPersona);
//		List<Telefono> telefonos = query2.list();
//		for (Telefono telefono : telefonos) {
//			System.out.println("TELEFONO.NUMERO >>>>>>>>>>>" + telefono.getNumero());
//		}
//		
//		Query query3 = session.createQuery("from Persona as p where p.direccion.calle like :nombreCalle");
//		query3.setString("nombreCalle", "callao%");
//		List<Persona> personas = query3.list();
//		for (Persona persona : personas) {
//			System.out.println("PERSONA.NOMBRE >>>>>>>>>>>" + persona.getNombre());
//		}
//		
//		System.out.println("DIRECCION.CALLE >>>>>>>>>>>" + direccion.getCalle());

//		CONSULTA 5 =================================================================

//		Long idPersona = 10L;
		
//		Query query1 = session.createQuery("select count(*) from Persona");
//		long cantidad = (Long)QueryResult();
//		=================================================================		
		transaction.commit();
		session.close();

	}
}