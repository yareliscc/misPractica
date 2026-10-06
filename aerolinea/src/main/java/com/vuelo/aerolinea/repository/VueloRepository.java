package com.vuelo.aerolinea.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vuelo.aerolinea.entity.Vuelo;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Long>{

	Optional<Vuelo>findByCodigoVuelo(String codigVuelo);
}
