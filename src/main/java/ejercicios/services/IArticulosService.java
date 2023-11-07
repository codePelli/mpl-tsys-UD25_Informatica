package ejercicios.services;

import java.util.List;

<<<<<<< HEAD
import ejercicios.dto.Articulos;
=======
import ejercicios.Articulos;
>>>>>>> branch 'master' of https://github.com/codePelli/mpl-tsys-UD25_Informatica.git

public interface IArticulosService {
	
	public List<Articulos> listArticulos();

	public Articulos articulosPorID(Long codigo);
	
	public Articulos saveArticulos(Articulos articulos);
	
	public Articulos updateArticulos(Articulos articulos);

	public void deleteArticulos(Long codigo);
}
