package tech.denis.cine.dto;

import lombok.Data;

@Data
public class PeliculaDto {
	private Long idPelicula;
	private String nombre;
	private Integer anioEstreno;
	private Integer duracion;
	private String sinopsis;
	private CategoriaDto categoria;
}
