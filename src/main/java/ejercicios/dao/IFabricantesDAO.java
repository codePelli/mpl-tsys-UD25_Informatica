package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.Fabricantes;

public interface IFabricantesDAO extends JpaRepository<Fabricantes, Long> {
}
