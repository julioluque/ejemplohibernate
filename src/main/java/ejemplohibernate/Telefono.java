package ejemplohibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Telefono {

	private long id;
	private int numero;

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Telefono() {
		
	}
	public Telefono(long id, int numero) {
		super();
		this.id = id;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefono [id=" + id + ", numero=" + numero + "]";
	}

}
