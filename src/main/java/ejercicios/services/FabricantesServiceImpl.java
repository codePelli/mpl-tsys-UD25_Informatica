package ejercicios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import ejercicios.dao.IFabricantesDAO;
import ejercicios.dto.Fabricantes;

@Service
public class FabricantesServiceImpl implements IFabricantesService{
	
	@Autowired
	private IFabricantesDAO iFabricantesService;

	@Override
	public List<Fabricantes> listFabricantes() {
		// TODO Auto-generated method stub
		return iFabricantesService.findAll();
	}

	@Override
	public Fabricantes fabricantesPorId(Long codigo) {
		// TODO Auto-generated method stub
		return iFabricantesService.findById(codigo).get();
	}

	@Override
	public Fabricantes saveFabricante(Fabricantes fabricantes) {
		// TODO Auto-generated method stub
		return iFabricantesService.save(fabricantes);
	}

	@Override
	public Fabricantes updateFabricante(Fabricantes fabricantes) {
		// TODO Auto-generated method stub
		return iFabricantesService.save(fabricantes);
	}

	@Override
	public void deleteFabricante(Long codigo) {
		// TODO Auto-generated method stub
		iFabricantesService.deleteById(codigo);
	}
	
	@GetMapping("/all")
	public List<Fabricantes> listAllFabricantes(){
		return listFabricantes();
	}

}
