package ejercicios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import ejercicios.controller.Fabricantes;

public class FabricantesServiceImpl implements IFabricantesService{
	
	@Autowired
	private IFabricantesService iFabricantesDAO;

	@Override
	public List<Fabricantes> listFabricantes() {
		// TODO Auto-generated method stub
		return iFabricantesDAO.listFabricantes();
	}

	@Override
	public Fabricantes fabricantesPorId(Long codigo) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.fabricantesPorId(codigo);
	}

	@Override
	public Fabricantes saveFabricante(Fabricantes fabricantes) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.saveFabricante(fabricantes);
	}

	@Override
	public Fabricantes updateFabricante(Fabricantes fabricantes) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.updateFabricante(fabricantes);
	}

	@Override
	public void deleteFabricante(Long codigo) {
		// TODO Auto-generated method stub
		iFabricantesDAO.deleteFabricante(codigo);
	}
	
	@GetMapping("/all")
	public List<Fabricantes> listAllFabricantes(){
		return listFabricantes();
	}

}
