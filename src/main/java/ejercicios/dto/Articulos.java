package ejercicios.dto;

import ejercicios.dto.Fabricantes.Fabricante;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Articulo")
public class Articulos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "codigo")
	private Long codigo;
	private String nombre;
	private int precio;
	
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

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@ManyToOne
	@JoinColumn (name = "CodigoFabricante", referencedColumnName = "codigo", insertable = false, updatable = false)
	private Fabricante fabricante;
	
}
