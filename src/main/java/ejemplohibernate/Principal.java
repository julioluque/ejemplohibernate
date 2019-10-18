package ejemplohibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Principal {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
//		=================================================================
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
//		=================================================================

		Direccion direccion = new Direccion();
		direccion.setCalle("Cuevas");
		direccion.setAltura(3810);
		session.save(direccion);

		Telefono telefono1 = new Telefono();
		telefono1.setNumero(12345612);
		session.save(telefono1);
		
		Telefono telefono2 = new Telefono();
		telefono2.setNumero(656513);
		session.save(telefono2);
		
		Persona persona = new Persona();
		persona.setNombre("Julio");
		persona.setDireccion(direccion);
		
		persona.getTelefonos().add(telefono1);
		persona.getTelefonos().add(telefono2);
		session.save(persona);

		Long idGenerado = persona.getId();

//		=================================================================		
		System.out.println(persona.getId());
		transaction.commit();
		session.close();

	}

}
