package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.Articulos;

public interface IArticulosDAO extends JpaRepository<Articulos, Long> {
}
