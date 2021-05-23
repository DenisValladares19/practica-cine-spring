package tech.denis.cine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.denis.cine.dto.CategoriaDto;
import tech.denis.cine.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	//@Autowired
	//private CategoriaService categoriaService;
	
	@GetMapping
	public List<CategoriaDto> findAll() {
		
		return null;
	}
}
