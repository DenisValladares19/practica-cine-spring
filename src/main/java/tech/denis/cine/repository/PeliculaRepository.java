package tech.denis.cine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.denis.cine.entity.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long>{

}
