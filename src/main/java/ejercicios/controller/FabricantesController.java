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

import ejercicios.dto.Fabricantes;
import ejercicios.dto.Fabricantes.Fabricante;
import ejercicios.services.IFabricantesService;

@RestController
@RequestMapping("/Fabricantes")
public class FabricantesController {

    private IFabricantesService fabricanteService;

    @GetMapping
    public List<Fabricantes> getAllFabricantes() {
    	
        return fabricanteService.listFabricantes();
    }

    @GetMapping("/{id}")
    public Fabricantes getFabricanteById(@PathVariable Long id) {
    	
        return fabricanteService.fabricantesPorId(id);
    }

    @PostMapping
    public Fabricantes saveFabricante(@RequestBody Fabricantes fabricante) {
    	
        return fabricanteService.saveFabricante(fabricante);
    }

    @PutMapping("/{id}")
    public Fabricantes updateFabricante(@PathVariable Long id, @RequestBody Fabricantes fabricante) {
    	
        return fabricanteService.updateFabricante(fabricante);
    }

    @DeleteMapping("/{id}")
    public void deleteFabricante(@PathVariable Long id) {
        fabricanteService.deleteFabricante(id);
    }
}