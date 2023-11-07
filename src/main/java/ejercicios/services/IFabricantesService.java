package ejercicios.services;

import java.util.List;

<<<<<<< HEAD
import ejercicios.dto.Fabricantes;
=======
import ejercicios.Fabricantes;
>>>>>>> branch 'master' of https://github.com/codePelli/mpl-tsys-UD25_Informatica.git

public interface IFabricantesService {
	
	public List<Fabricantes> listFabricantes();
	
	public Fabricantes fabricantesPorId(Long codigo);
	
	public Fabricantes saveFabricante(Fabricantes fabricantes);
	
	public Fabricantes updateFabricante(Fabricantes fabricantes);
	
	public void deleteFabricante(Long codigo);

}
