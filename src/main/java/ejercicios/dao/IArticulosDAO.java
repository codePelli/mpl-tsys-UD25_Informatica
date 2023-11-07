package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.ArticulosDTO;

public interface IArticulosDAO extends JpaRepository<ArticulosDTO, Long> {
}
