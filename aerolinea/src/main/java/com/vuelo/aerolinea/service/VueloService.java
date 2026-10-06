package com.vuelo.aerolinea.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.vuelo.aerolinea.entity.Vuelo;

@Service
public interface VueloService {

	public Optional<Vuelo> obtenerVuelo(Long id);
	//public Optional<Libros> buscarLibro(Long id);
}
