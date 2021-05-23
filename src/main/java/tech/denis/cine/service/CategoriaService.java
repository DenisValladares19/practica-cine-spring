package tech.denis.cine.service;

import java.util.List;
import org.springframework.stereotype.Service;

import tech.denis.cine.dto.CategoriaDto;

@Service
public interface CategoriaService {
	/**
	 * metodo para guardar una nueva Categoria 
	 * @return Categoria el objeto ya guardado 
	 */
	public CategoriaDto save(CategoriaDto categoria);
	
	/**
	 * metodo para modificar una Categoria 
	 * @param catgoria
	 * @return Categoria El objeto ya guardado  
	 */
	public CategoriaDto update(CategoriaDto catgoria);
	
	/**
	 * metodo que retorna una lista de cartegorias
	 * @return List de categoria
	 */
	public List<CategoriaDto> findAll();
	
	
	/**
	 * metodo para buscar una Categoria en especifico 
	 * @param idCategoria
	 * @return Categoria
	 */
	public CategoriaDto findById(Long idCategoria);
	
	/**
	 * metodo para eliminar una categoria 
	 * por medio de su Id 
	 * @param idCategoria
	 * @return el objeto de la categoria eliminado 
	 */
	public CategoriaDto delete(Long idCategoria);
}
