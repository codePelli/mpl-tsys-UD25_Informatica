package ejercicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicios.dto.Articulos;
import ejercicios.services.IArticulosService;

@RestController
@RequestMapping("/Articulos")
public class ArticulosController {

	private IArticulosService articuloService;

    @GetMapping
    public List<Articulos> getAllArticulos() {
    	
        return articuloService.listArticulos();
    }

    @GetMapping("/{codigo}")
    public Articulos getArticuloById(@PathVariable Long codigo) {
    	
        return articuloService.articulosPorID(codigo);
    }

    @PostMapping
    public Articulos saveArticulo(@RequestBody Articulos articulo) {
    	
        return articuloService.saveArticulos(articulo);
    }

    @PutMapping("/{codigo}")
    public Articulos updateArticulo(@PathVariable(name = "codigo") Long codigo, @RequestBody Articulos articulo) {
    	
    	Articulos artSeleccionado = articuloService.articulosPorID(codigo);
        artSeleccionado.setNombre(articulo.getNombre());
        artSeleccionado.setCodigo(articulo.getCodigo());
        artSeleccionado.setPrecio(articulo.getPrecio());
        return articuloService.updateArticulos(artSeleccionado);
    }

    @DeleteMapping("/{codigo}")
    public void eliminarDepartamento(@PathVariable(name = "codigo") Long codigo) {
    	
    	articuloService.deleteArticulos(codigo);
        System.out.println("Articulo eliminado");
    }
}