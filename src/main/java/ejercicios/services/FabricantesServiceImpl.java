package ejercicios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import ejercicios.dto.FabricantesDTO;

public class FabricantesServiceImpl implements IFabricantesService{
	
	@Autowired
	private IFabricantesService iFabricantesService;

	@Override
	public List<FabricantesDTO> listFabricantes() {
		// TODO Auto-generated method stub
		return iFabricantesService.listFabricantes();
	}

	@Override
	public FabricantesDTO fabricantesPorId(Long codigo) {
		// TODO Auto-generated method stub
		return iFabricantesService.fabricantesPorId(codigo);
	}

	@Override
	public FabricantesDTO saveFabricante(FabricantesDTO fabricantes) {
		// TODO Auto-generated method stub
		return iFabricantesService.saveFabricante(fabricantes);
	}

	@Override
	public FabricantesDTO updateFabricante(FabricantesDTO fabricantes) {
		// TODO Auto-generated method stub
		return iFabricantesService.updateFabricante(fabricantes);
	}

	@Override
	public void deleteFabricante(Long codigo) {
		// TODO Auto-generated method stub
		iFabricantesService.deleteFabricante(codigo);
	}
	
	@GetMapping("/all")
	public List<FabricantesDTO> listAllFabricantes(){
		return listFabricantes();
	}

}
