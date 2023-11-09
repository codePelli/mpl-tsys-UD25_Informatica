package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.Fabricantes.Fabricante;

public interface IFabricantesDAO extends JpaRepository<Fabricante, Long> {
}
