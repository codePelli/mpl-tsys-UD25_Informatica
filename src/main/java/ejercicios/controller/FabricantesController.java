package ejercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicios.services.IFabricantesService;

@RestController
@RequestMapping("/fabricantes")
public class FabricantesController {

	@Autowired
	private IFabricantesService iFabricantesService;
}
