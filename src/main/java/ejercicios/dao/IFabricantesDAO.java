package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.FabricantesDTO.Fabricante;

public interface IFabricantesDAO extends JpaRepository<Fabricante, Long> {
}
