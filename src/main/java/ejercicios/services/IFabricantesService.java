package ejercicios.services;

import java.util.List;

import ejercicios.dto.FabricantesDTO;

public interface IFabricantesService {
	
	public List<FabricantesDTO> listFabricantes();
	
	public FabricantesDTO fabricantesPorId(Long codigo);
	
	public FabricantesDTO saveFabricante(FabricantesDTO fabricantes);
	
	public FabricantesDTO updateFabricante(FabricantesDTO fabricantes);
	
	public void deleteFabricante(Long codigo);

}
