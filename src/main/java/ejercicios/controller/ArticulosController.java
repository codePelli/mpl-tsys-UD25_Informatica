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

    @GetMapping("/{id}")
    public Articulos getArticuloById(@PathVariable Long id) {
    	
        return articuloService.articulosPorID(id);
    }

    @PostMapping
    public Articulos saveArticulo(@RequestBody Articulos articulo) {
    	
        return articuloService.saveArticulos(articulo);
    }

    @PutMapping("/{id}")
    public Articulos updateArticulo(@PathVariable Long id, @RequestBody Articulos articulo) {
    	
        return articuloService.updateArticulos(articulo);
    }

    @DeleteMapping("/{id}")
    public void deleteArticulo(@PathVariable Long id) {
    	
        articuloService.deleteArticulos(id);
    }
}