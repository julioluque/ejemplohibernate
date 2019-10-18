package ejemplohibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Persona {

	private long id;
	private String nombre;
	private Direccion direccion;
	private List<Telefono> telefonos = new ArrayList<Telefono>();

	public Persona () {
		
	}
	public Persona(long id, String nombre, Direccion direccion, List<Telefono> telefonos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefonos = telefonos;
	}

	@OneToMany
	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	@ManyToOne
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
