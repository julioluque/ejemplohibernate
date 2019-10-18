package ejemplohibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Direccion {

	private long id;
	private String calle;
	private int altura;

	public Direccion() {
	
	}
	
	public Direccion(long id, String calle, int altura) {
		super();
		this.id = id;
		this.calle = calle;
		this.altura = altura;
	}

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", calle=" + calle + ", altura=" + altura + "]";
	}
}
