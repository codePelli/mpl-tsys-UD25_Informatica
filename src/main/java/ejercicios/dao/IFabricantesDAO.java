package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.Fabricantes.Fabricante;

public interface IFabricantesDAO extends JpaRepository<Fabricante, Long> {
}
