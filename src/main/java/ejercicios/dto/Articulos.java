package ejercicios.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Articulos")
public class Articulos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "codigo")
	private Long codigo;
	private String nombre;
	private int precio;
	
	@ManyToOne
	@JoinColumn (name = "CodigoFabricante", referencedColumnName = "codigo", insertable = false, updatable = false)
	private Fabricantes fabricante;
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Fabricantes getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricantes fabricante) {
		this.fabricante = fabricante;
	}
	
}
