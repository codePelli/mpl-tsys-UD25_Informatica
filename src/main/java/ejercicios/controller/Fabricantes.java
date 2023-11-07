package ejercicios.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Fabricantes {

	@Entity
	@Table(name = "Fabricante")
	public class Fabricante{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private Long codigo;
		private String nombre;
		
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
	}
}
