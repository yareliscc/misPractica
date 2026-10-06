package com.vuelo.aerolinea.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vuelo.aerolinea.entity.Vuelo;
import com.vuelo.aerolinea.repository.VueloRepository;


@Service
public class VueloImpl implements VueloService{
	@Autowired
	VueloRepository vuelo;
	
	@Override
	public Optional<Vuelo> obtenerVuelo(Long id) {
		// TODO Auto-generated method stub
		return vuelo.findById(id);

	
	}

}
