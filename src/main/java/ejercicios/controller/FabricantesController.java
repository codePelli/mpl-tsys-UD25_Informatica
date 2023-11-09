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
import ejercicios.dto.Fabricantes;
import ejercicios.services.IFabricantesService;

@RestController
@RequestMapping("/Fabricantes")
public class FabricantesController {

    private IFabricantesService fabricanteService;

    @GetMapping
    public List<Fabricantes> getAllFabricantes() {
    	
        return fabricanteService.listFabricantes();
    }

    @GetMapping("/{codigo}")
    public Fabricantes getFabricanteById(@PathVariable Long codigo) {
    	
        return fabricanteService.fabricantesPorId(codigo);
    }

    @PostMapping
    public Fabricantes saveFabricante(@RequestBody Fabricantes fabricante) {
    	
        return fabricanteService.saveFabricante(fabricante);
    }

    @PutMapping("/{codigo}")
    public Fabricantes updateFabricante(@PathVariable(name = "codigo") Long codigo, @RequestBody Fabricantes fabricante) {
    	
    	Fabricantes fabricanteSeleccionado = fabricanteService.fabricantesPorId(codigo);
        fabricanteSeleccionado.setNombre(fabricante.getNombre());
        fabricanteSeleccionado.setCodigo(fabricante.getCodigo());
        return fabricanteService.saveFabricante(fabricanteSeleccionado);
    }

    @DeleteMapping("/{codigo}")
    public void deleteFabricante(@PathVariable Long codigo) {
        fabricanteService.deleteFabricante(codigo);
    }
}