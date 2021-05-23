package tech.denis.cine.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tech.denis.cine.entity.Pelicula;

@Service
public interface PeliculaService {
	
	/**
	 * metodo para guardar una nueva pelicula 
	 * @param pelicula
	 * @return un objeto de pelicula ya guardado 
	 */
	public Pelicula save(Pelicula pelicula);
	
	/**
	 * metodo para modificar una pelicula 
	 * @param pelicula
	 * @return un objeto de pelicula ya modificado 
	 */
	public Pelicula update(Pelicula pelicula);
	
	
	/**
	 * metodo para eliminar una pelicula 
	 * mediante su Id 
	 * @param idPelicula
	 * @return el objeto de pelicula eliminado 
	 */
	public Pelicula delete(Long idPelicula);
	
	/**
	 * metodo para traer todas las peliculas 
	 * guardadas en la base de datos 
	 * @return una lista de peliculas 
	 */
	public List<Pelicula> findAll();
}
