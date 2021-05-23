package tech.denis.cine.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import tech.denis.cine.dto.CategoriaDto;
import tech.denis.cine.repository.CategoriaRepository;
import tech.denis.cine.service.CategoriaService;

public class CategoriaServiceImp implements CategoriaService {
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public CategoriaDto save(CategoriaDto categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoriaDto update(CategoriaDto catgoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoriaDto> findAll() {
		return categoriaRepository.findAll()
				.stream()
				.map(element -> modelMapper.map(element, CategoriaDto.class))
				.collect(Collectors.toList());
	}

	@Override
	public CategoriaDto findById(Long idCategoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoriaDto delete(Long idCategoria) {
		// TODO Auto-generated method stub
		return null;
	}
}
