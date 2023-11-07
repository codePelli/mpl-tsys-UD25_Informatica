package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.Articulos;

public interface IArticulosDAO extends JpaRepository<Articulos, Long> {
}
