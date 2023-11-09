package ejercicios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import ejercicios.dao.IArticulosDAO;
import ejercicios.dto.Articulos;

@Service
public class IArticulosServiceImpl implements IArticulosService{

	@Autowired
	private IArticulosDAO iArtServ;
	
	@Override
	public List<Articulos> listArticulos() {
		// TODO Auto-generated method stub
		return iArtServ.findAll();
	}

	@Override
	public Articulos articulosPorID(Long codigo) {
		// TODO Auto-generated method stub
		return iArtServ.findById(codigo).get();
	}

	@Override
	public Articulos saveArticulos(Articulos articulos) {
		// TODO Auto-generated method stub
		return iArtServ.save(articulos);
	}

	@Override
	public Articulos updateArticulos(Articulos articulos) {
		// TODO Auto-generated method stub
		return iArtServ.save(articulos);
	}

	@Override
	public void deleteArticulos(Long codigo) {
		iArtServ.deleteById(codigo);		
	}
	
	@GetMapping("/all")
	public List<Articulos> listAllArticulos(){
		return listArticulos();
	}

}
