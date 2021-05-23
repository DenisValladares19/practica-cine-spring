package tech.denis.cine.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pelicula", schema = "administracion")
public class Pelicula implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPelicula;
	
	@Column
	private String nombre;
	
	@Column(name = "anio_estreno")
	private Integer anioEstreno;
	
	@Column
	private Integer duracion;
	
	@Column
	private String sinopsis;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;

	public Pelicula() {
		super();
	}

	public Pelicula(Long idPelicula, String nombre, Integer anioEstreno, Integer duracion, String sinopsis,
			Categoria categoria) {
		super();
		this.idPelicula = idPelicula;
		this.nombre = nombre;
		this.anioEstreno = anioEstreno;
		this.duracion = duracion;
		this.sinopsis = sinopsis;
		this.categoria = categoria;
	}

	public Long getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(Long idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(Integer anioEstreno) {
		this.anioEstreno = anioEstreno;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
