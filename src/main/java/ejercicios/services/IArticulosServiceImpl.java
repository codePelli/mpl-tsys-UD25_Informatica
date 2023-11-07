package ejercicios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import ejercicios.dto.ArticulosDTO;

public class IArticulosServiceImpl implements IArticulosService{

	@Autowired
	private IArticulosService iArtServ;
	
	@Override
	public List<ArticulosDTO> listArticulos() {
		// TODO Auto-generated method stub
		return iArtServ.listArticulos();
	}

	@Override
	public ArticulosDTO articulosPorID(Long codigo) {
		// TODO Auto-generated method stub
		return iArtServ.articulosPorID(codigo);
	}

	@Override
	public ArticulosDTO saveArticulos(ArticulosDTO articulos) {
		// TODO Auto-generated method stub
		return iArtServ.saveArticulos(articulos);
	}

	@Override
	public ArticulosDTO updateArticulos(ArticulosDTO articulos) {
		// TODO Auto-generated method stub
		return iArtServ.updateArticulos(articulos);
	}

	@Override
	public void deleteArticulos(Long codigo) {
		iArtServ.deleteArticulos(codigo);		
	}
	
	@GetMapping("/all")
	public List<ArticulosDTO> listAllArticulos(){
		return listArticulos();
	}

}
