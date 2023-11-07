package ejercicios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

<<<<<<< HEAD
import ejercicios.dto.Articulos;
=======
import ejercicios.Articulos;
>>>>>>> branch 'master' of https://github.com/codePelli/mpl-tsys-UD25_Informatica.git

public class IArticulosServiceImpl implements IArticulosService{

	@Autowired
	private IArticulosService iArtServ;
	
	@Override
	public List<Articulos> listArticulos() {
		// TODO Auto-generated method stub
		return iArtServ.listArticulos();
	}

	@Override
	public Articulos articulosPorID(Long codigo) {
		// TODO Auto-generated method stub
		return iArtServ.articulosPorID(codigo);
	}

	@Override
	public Articulos saveArticulos(Articulos articulos) {
		// TODO Auto-generated method stub
		return iArtServ.saveArticulos(articulos);
	}

	@Override
	public Articulos updateArticulos(Articulos articulos) {
		// TODO Auto-generated method stub
		return iArtServ.updateArticulos(articulos);
	}

	@Override
	public void deleteArticulos(Long codigo) {
		iArtServ.deleteArticulos(codigo);		
	}
	
	@GetMapping("/all")
	public List<Articulos> listAllArticulos(){
		return listArticulos();
	}

}
