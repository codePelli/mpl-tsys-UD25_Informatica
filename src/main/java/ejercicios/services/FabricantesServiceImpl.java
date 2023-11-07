package ejercicios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import ejercicios.Fabricantes;

public class FabricantesServiceImpl implements IFabricantesService{
	
	@Autowired
	private IFabricantesService iFabricantesService;

	@Override
	public List<Fabricantes> listFabricantes() {
		// TODO Auto-generated method stub
		return iFabricantesService.listFabricantes();
	}

	@Override
	public Fabricantes fabricantesPorId(Long codigo) {
		// TODO Auto-generated method stub
		return iFabricantesService.fabricantesPorId(codigo);
	}

	@Override
	public Fabricantes saveFabricante(Fabricantes fabricantes) {
		// TODO Auto-generated method stub
		return iFabricantesService.saveFabricante(fabricantes);
	}

	@Override
	public Fabricantes updateFabricante(Fabricantes fabricantes) {
		// TODO Auto-generated method stub
		return iFabricantesService.updateFabricante(fabricantes);
	}

	@Override
	public void deleteFabricante(Long codigo) {
		// TODO Auto-generated method stub
		iFabricantesService.deleteFabricante(codigo);
	}
	
	@GetMapping("/all")
	public List<Fabricantes> listAllFabricantes(){
		return listFabricantes();
	}

}
