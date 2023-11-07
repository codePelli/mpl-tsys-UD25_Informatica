package ejercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicios.services.IArticulosService;

@RestController
@RequestMapping("/articulos")
public class ArticulosController {

	@Autowired
	private IArticulosService iArticulosService;
}
