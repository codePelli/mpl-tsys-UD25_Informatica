package ejercicios.services;

import java.util.List;

import ejercicios.Fabricantes;

public interface IFabricantesService {
	
	public List<Fabricantes> listFabricantes();
	
	public Fabricantes fabricantesPorId(Long codigo);
	
	public Fabricantes saveFabricante(Fabricantes fabricantes);
	
	public Fabricantes updateFabricante(Fabricantes fabricantes);
	
	public void deleteFabricante(Long codigo);

}
