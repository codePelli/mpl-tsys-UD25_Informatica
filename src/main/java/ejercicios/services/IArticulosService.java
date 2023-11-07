package ejercicios.services;

import java.util.List;

import ejercicios.dto.ArticulosDTO;

public interface IArticulosService {
	
	public List<ArticulosDTO> listArticulos();

	public ArticulosDTO articulosPorID(Long codigo);
	
	public ArticulosDTO saveArticulos(ArticulosDTO articulos);
	
	public ArticulosDTO updateArticulos(ArticulosDTO articulos);

	public void deleteArticulos(Long codigo);
}
