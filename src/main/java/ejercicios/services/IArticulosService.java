package ejercicios.services;

import java.util.List;

import ejercicios.dto.Articulos;

public interface IArticulosService {
	
	public List<Articulos> listArticulos();

	public Articulos articulosPorID(Long codigo);
	
	public Articulos saveArticulos(Articulos articulos);
	
	public Articulos updateArticulos(Articulos articulos);

	public void deleteArticulos(Long codigo);
}
